
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;
        while (true) {

            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (input.equals("")) {
                break;
            }

            if (Integer.valueOf(parts[1]) > biggest) {
                biggest = Integer.valueOf(parts[1]);
            }

        }
        System.out.println("Age of the oldest: " + biggest);

    }
}
