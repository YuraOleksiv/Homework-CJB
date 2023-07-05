package product;

public abstract class ElectronicsProduct extends Product {
    protected int guarantee;
    public ElectronicsProduct(String name, Double price, Integer quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        guarantee = 0;
    }

    public int getGuarantee() {
        return guarantee;
    }
}
