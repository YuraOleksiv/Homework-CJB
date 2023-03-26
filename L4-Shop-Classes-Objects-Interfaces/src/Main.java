import product.AgeRestriction;
import product.FoodProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {

        FoodProduct foodProduct1 = new FoodProduct("Tunec", 23.0, 15,
                AgeRestriction.NONE, "30.09.2019");
        System.out.println(foodProduct1.getExpirationDate());
        System.out.println(foodProduct1);
        foodProduct1.getPrice();

//        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
//        SimpleDateFormat sddf = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
//
//        Date curDate = sdf.parse("20.02.2023");
//        System.out.println(curDate);
//        System.out.println(sddf.format(curDate));

//        Date otherDate = new Date();
//
//        System.out.println(curDate);
//        System.out.println(otherDate);
//
//        System.out.println(TimeUnit.DAYS.convert(Math.abs(otherDate.getTime() - curDate.getTime()), TimeUnit.MILLISECONDS));

    }
}