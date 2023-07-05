import product.Appliance;
import product.Computer;
import product.FoodProduct;
import product.Product;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PriceCalculator {
    private final Map<Class<?>, Double> productDiscount = Map.of(
            Computer.class, 0.95,
            Appliance.class, 1.05,
            FoodProduct.class, 0.7
    );

    public PriceCalculator() {
    }

    public Double calculate(FoodProduct product) {
        Date expDate = product.getExpirationDate();
        Date currentDate = new Date();
        Double price = product.getPrice();

        if (expDate.before(currentDate)) {
            throw new RuntimeException("Food product expired");
        }
        if (TimeUnit.DAYS.convert(Math.abs(expDate.getTime() - currentDate.getTime()),
                TimeUnit.MILLISECONDS) <= 15) {
            Double discount = getProductDiscount(product);
            return Math.round((price * discount) * 100.0) / 100.0;
        }
        return price;
    }

    public Double calculate(Computer computer) {
        Integer quantity = computer.getQuantity();
        Double price = computer.getPrice();

        if (quantity > 1000) {
            Double discount = getProductDiscount(computer);
            return Math.round((price * discount) * 100.0) / 100.0;
        }
        return price;
    }

    public Double calculate(Appliance appliance) {
        Integer quantity = appliance.getQuantity();
        Double price = appliance.getPrice();

        if (quantity < 50) {
            Double discount = getProductDiscount(appliance);
            return Math.round((price * discount) * 100.0) / 100.0;
        }
        return price;
    }

    public <T extends Product> Double getProductDiscount(T someProduct) {
        return productDiscount.get(someProduct.getClass());
    }
}
