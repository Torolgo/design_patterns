import java.util.Arrays;

public class IngredientVerificationService {
    public static boolean verificationIngredient(String[] ingredients) {
        System.out.println("Vérification de la disponibilité des ingrédients...");
        System.out.println("Ingrédients vérifiés: " + Arrays.toString(ingredients));
        return true;
    }
}
