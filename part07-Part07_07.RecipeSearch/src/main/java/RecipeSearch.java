import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> recipesInArray = new ArrayList<>();
        String recipesTxt = "";

        ArrayList<Recipe> recipesList = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                recipesTxt += line + "\n";

            }

        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }

        String[] parts = recipesTxt.split("\n\n");
        for (int i = 0; i < parts.length; i++) {
            String[] p = parts[i].split("\n");
            ArrayList<String> r = new ArrayList<>();
            for (int a = 0; a < p.length; a++) {
                r.add(p[a]);
            }

            recipesInArray.add(r);
        }

        for (ArrayList<String> r : recipesInArray) {
            String name = r.get(0);

            int time = Integer.valueOf(r.get(1));
            Recipe t = new Recipe(name, time);
            recipesList.add(t);
            for (int i = 2; i < r.size(); i++) {
                t.addIngridient(r.get(i));
            }

        }
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {

            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipesList) {
                    System.out.println(r);
                }
                System.out.println("");
            }
            if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipesList) {
                    if (r.getName().contains(word)) {
                        System.out.println(r);
                    }

                }
                System.out.println();
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipesList) {
                    if (r.getCookingTime() <= time) {
                        System.out.println(r);
                    }
                }
                System.out.println();
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for (Recipe r : recipesList) {

                    for (int i = 0; i < r.getIngredients().size(); i++) {
                        String p = r.getIngredients().get(i);
                        String[] part = p.split(" ");
                        for (String a : part) {
                            if (a.equals(word)) {
                                System.out.println(r);
                            }
                        }

                    }
                }
                System.out.println();

            }

        }
    }
}
