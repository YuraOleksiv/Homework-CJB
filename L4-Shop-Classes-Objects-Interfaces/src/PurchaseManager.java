import product.AgeRestriction;

public class PurchaseManager {
    private static Boolean checkAgeRestriction(int age, AgeRestriction ageRestriction) {
        return age >= 18 || ageRestriction != AgeRestriction.ADULT;
    }

}
