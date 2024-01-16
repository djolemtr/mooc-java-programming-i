
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double avg = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            count += 1;
            sum += number;
            avg = 1.0 * sum / count;

        }
        System.out.println("Average of the numbers: " + avg);

    }
}
