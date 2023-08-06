import product.AgeRestriction;
import product.Appliance;
import product.Computer;
import product.FoodProduct;

import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {

        Customer customer1 = new Customer("Vasylko", 32, 2000.0);
        Customer customer2 = new Customer("Olenka", 17, 4000.0);
        Customer customer3 = new Customer("Sofiia", 19, 1000.0);

        FoodProduct food1 = new FoodProduct("Tunec", 23.00, 15,
                AgeRestriction.NONE, "03.04.2023");
        Computer pc1 = new Computer("Hooman Packard", 1450.00, 999,
                AgeRestriction.NONE);
        Appliance app1 = new Appliance("Saw", 890.00, 39,
                AgeRestriction.ADULT);
//        System.out.println(PriceCalculator.calculate(pc1));
        PurchaseManager.purchase(customer1, app1);
        System.out.println(customer1);
        System.out.println(app1);
    }
}