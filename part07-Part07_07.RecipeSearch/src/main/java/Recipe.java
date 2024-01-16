import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void addIngridient(String ingridient) {
        this.ingredients.add(ingridient);
    }

    public String toString() {

        return this.name + ", cooking time: " + this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

}