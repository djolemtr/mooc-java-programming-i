
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double avg = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0 && count == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (number > 0) {
                count += 1;
                sum += number;
                avg = 1.0 * sum / count;
            }

            if (number == 0) {
                System.out.println(avg);
                break;

            }

        }

    }
}
