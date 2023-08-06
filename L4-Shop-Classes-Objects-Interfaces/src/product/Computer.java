package product;

public class Computer extends ElectronicsProduct {
    public Computer(String name, Double price, Integer quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        guarantee = 24;
    }
}