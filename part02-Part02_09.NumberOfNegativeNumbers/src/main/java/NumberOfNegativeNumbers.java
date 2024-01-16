
import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number < 0) {
                count += 1;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
