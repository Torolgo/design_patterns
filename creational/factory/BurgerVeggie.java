import java.util.ArrayList;

public class BurgerVeggie implements Burger {
    private ArrayList<String> ingredients;
    private double prix = 8.00;

    public BurgerVeggie() {
        this.ingredients = new ArrayList<>();
        ingredients.add("Pain complet");
        ingredients.add("Salade");
        ingredients.add("Tomate");
        ingredients.add("Carotte");
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public void preparer() {
        System.out.println("Préparation : " + String.join(", ", ingredients));
    }

    @Override
    public double afficherPrix() {
        return prix;
    }
}
