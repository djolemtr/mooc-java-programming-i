
public class Main {
        public static void main(String[] args) {
                Menu menu = new Menu();

                // When you have completed the method addMeal(String meal)
                // You can delete the comments below

                menu.addMeal("Tofu ratatouille");
                menu.addMeal("Chilli Coconut Chicken");
                menu.addMeal("Chilli Coconut Chicken");
                menu.addMeal("Meatballs with mustard sauce");

                menu.printMeals();
                menu.clearMenu();

                System.out.println();
                menu.addMeal("Tomato and mozzarella salad");
                menu.printMeals();
        }
}
