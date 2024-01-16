
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        while (true) {

            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0){
                even ++;
            } else {
                odd ++;
            }

            count ++;
            sum += number;
            avg = 1.0 * sum / count;

        }
        System.out.println("Thx! Bye!"
                +"\nSum: " + sum
                +"\nNumbers: " + count
                +"\nAverage: " + avg
                +"\nEven: " + even
                +"\nOdd: " + odd);
    }
}
