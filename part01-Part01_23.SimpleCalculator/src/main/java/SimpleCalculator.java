
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int add = first + second;
        int deduct = first - second;
        int multiply = first * second;
        double divide = 1.0 * first / second;
        System.out.println( first + " + " + second + " = " + add);
        System.out.println(first + " - " + second + " = " + deduct);
        System.out.println(first + " * " + second + " = " + multiply);
        System.out.println(first + " / " + second + " = " + divide);

    }
}
