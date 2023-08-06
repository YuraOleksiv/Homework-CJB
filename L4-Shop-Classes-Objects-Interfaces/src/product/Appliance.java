package product;

public class Appliance extends ElectronicsProduct{
    public Appliance(String name, Double price, Integer quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        guarantee = 6;
    }
}
