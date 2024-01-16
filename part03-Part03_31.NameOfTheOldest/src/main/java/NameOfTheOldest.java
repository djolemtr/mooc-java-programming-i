
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = -1;
        String name = "";
        while (true) {

            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (input.equals("")) {
                break;
            }

            if (Integer.valueOf(parts[1]) > biggest) {
                biggest = Integer.valueOf(parts[1]);
                name = (parts[0]);
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
