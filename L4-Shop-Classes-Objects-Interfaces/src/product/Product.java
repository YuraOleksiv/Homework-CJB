package product;

import java.text.SimpleDateFormat;
import java.util.Locale;

public abstract class Product implements Buyable {
    protected String name;
    protected Double price;
    protected Integer quantity;
    protected AgeRestriction ageRestriction;

    public Product(String name, Double price, Integer quantity, AgeRestriction ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ageRestriction=" + ageRestriction +
                '}';
    }
}

