
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameSize = 0;
        int sum = 0;
        int count = 0;

        while (true) {

            String input = scanner.nextLine();
            String[] parts = input.split(",");

            if (input.equals("")) {
                break;
            }
            int nameSize = parts[0].length();

            if (nameSize > longestNameSize) {
                longestName = parts[0];
                longestNameSize = nameSize;
            }

            sum += Integer.valueOf(parts[1]);
            count++;

        }
        System.out.println("Longest name: " + longestName
        +"\nAverage of the birth years: "+ (1.0 * sum/count));
    }
}
