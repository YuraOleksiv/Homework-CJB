package product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FoodProduct extends Product {
    private final static Double EXP_DISCOUNT = 0.7;
    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
    private Date expirationDate;

    public FoodProduct(String name, Double price, Integer quantity,
                       AgeRestriction ageRestriction, String date) throws ParseException {

        super(name, price, quantity, ageRestriction);
        this.expirationDate = DATE_FORMAT.parse(date);
    }

    @Override
    public Double getPrice() {
        Date currentDate = new Date();
        if (expirationDate.before(currentDate)) {
            throw new RuntimeException("Food product expired");
        }
        if (TimeUnit.DAYS.convert(Math.abs(expirationDate.getTime() - currentDate.getTime()), TimeUnit.MILLISECONDS) <= 15) {
            return price * EXP_DISCOUNT;
        } else {
            return price;
        }
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "expirationDate='" + expirationDate + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ageRestriction=" + ageRestriction +
                '}';
    }
}
