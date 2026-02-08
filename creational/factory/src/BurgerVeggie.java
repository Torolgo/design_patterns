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
    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    @Override
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
}
