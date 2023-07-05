package product;

public class Appliance extends ElectronicsProduct{
    private final static double QUANTITY_DEPENDS_PRICE = 1.05;

    public Appliance(String name, Double price, Integer quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        guarantee = 6;
    }
}
