import product.AgeRestriction;
import product.Product;

public class PurchaseManager {
    private static Boolean checkAgeRestriction(Customer customer, Product product) {
        int age = customer.getAge();
        AgeRestriction ageRestriction = product.getAgeRestriction();
        return age >= 18 || ageRestriction != AgeRestriction.ADULT;
    }
    private static Boolean checkQuantity(Product product) {
        int quantity = product.getQuantity();
        return quantity > 0;
    }
    private static Boolean checkBalance(Customer customer, Product product) {
        Double price = PriceCalculator.calculate(product);
        Double balance = customer.getBalance();
        return balance >= price;
    }
    public static void purchase(Customer customer,Product product) {
        Double price = PriceCalculator.calculate(product);
        Double balance = customer.getBalance();
        int quantity = product.getQuantity();
        if (checkQuantity(product) && checkAgeRestriction(customer, product) && checkBalance(customer, product)) {
            customer.setBalance(balance - price);
            product.setQuantity(quantity - 1);
        };

    }
}
