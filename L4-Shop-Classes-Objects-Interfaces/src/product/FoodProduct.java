package product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FoodProduct extends Product implements Expirable {
    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
    private final Date expirationDate;

    public FoodProduct(String name, Double price, Integer quantity,
                       AgeRestriction ageRestriction, String date) throws ParseException {

        super(name, price, quantity, ageRestriction);
        this.expirationDate = DATE_FORMAT.parse(date);
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
