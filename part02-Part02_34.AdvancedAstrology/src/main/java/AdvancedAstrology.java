
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int a = size;

        for (int i = 1; i <= a; i++) {
            printSpaces(size - 1);
            printStars(i);
            size--;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int a = height;
        int b = 0;
        int spaces = (((height * 2) - 2) / 2) - 1;

        for (int i = 1; i <= a; i++) {
            printSpaces(height - 1);
            printStars(i + b);
            b++;
            height--;
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(spaces);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
