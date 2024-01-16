
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = scanner.nextInt();

        System.out.print("Last number? " );
        int last = scanner.nextInt();

        int sum = 0;

        while (first <= last){
            sum += first;
            first++;
        }
        System.out.println("The sum is " + sum);

    }
}
