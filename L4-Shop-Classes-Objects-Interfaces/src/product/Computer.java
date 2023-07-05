package product;

public class Computer extends ElectronicsProduct {
private final static double QUANTITY_DEPENDS_PRICE = 0.95;

    public Computer(String name, Double price, Integer quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        guarantee = 24;
    }
}
