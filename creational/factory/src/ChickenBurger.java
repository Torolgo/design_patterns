import java.util.ArrayList;

public class ChickenBurger implements Burger {
    private ArrayList<String> ingredients;
    private double prix = 9.00;

    public ChickenBurger() {
        this.ingredients = new ArrayList<>();
        ingredients.add("Pain burger");
        ingredients.add("Poulet pané croustillant");
        ingredients.add("Sauce BBQ");
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
