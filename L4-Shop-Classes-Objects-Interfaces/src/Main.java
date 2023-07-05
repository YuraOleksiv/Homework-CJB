import product.AgeRestriction;
import product.Appliance;
import product.Computer;
import product.FoodProduct;

import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {

        FoodProduct food1 = new FoodProduct("Tunec", 23.00, 15,
                AgeRestriction.NONE, "03.04.2023");
        Computer pc1 = new Computer("Hooman Packard", 1450.00, 1000,
                AgeRestriction.NONE);
        Appliance app1 = new Appliance("Saw", 890.00, 39,
                AgeRestriction.ADULT);
        PriceCalculator priceCalc = new PriceCalculator();
        System.out.println(priceCalc.calculate(food1));
        System.out.println(priceCalc.calculate(pc1));
        System.out.println(priceCalc.calculate(app1));
    }
}