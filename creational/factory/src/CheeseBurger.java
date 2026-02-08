import java.util.ArrayList;

public class CheeseBurger implements Burger {
    private ArrayList<String> ingredients;
    private double prix = 10.00;

    public CheeseBurger() {
        this.ingredients = new ArrayList<>();
        ingredients.add("Pain sésame");
        ingredients.add("Steak haché");
        ingredients.add("Cheddar fondu");
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
