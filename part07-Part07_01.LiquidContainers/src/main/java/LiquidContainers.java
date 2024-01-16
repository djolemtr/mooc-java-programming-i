
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            }

            if (input.contains("add")) {
                String[] part = input.split(" ");
                int inputValue = Integer.valueOf(part[1]);
                int potentialValue = inputValue + first;

                if (inputValue > 0) {
                    if (inputValue > 100) {
                        first = 100;
                    }

                    if (potentialValue <= 100) {
                        first += inputValue;
                    } else {
                        first = 100;
                    }
                }
            }

            if (input.contains("move")) {
                if (input.contains("re")) {
                    String[] part = input.split(" ");
                    int inputValue = Integer.valueOf(part[1]);
                    int newValue = second - inputValue;

                    if (newValue > 0) {
                        second -= inputValue;
                    }

                } else {

                    String[] part = input.split(" ");
                    int inputValue = Integer.valueOf(part[1]);
                    int newValue = inputValue + second;

                    if (inputValue >= first) {

                        second = first;
                        first = 0;
                    } else {
                        if (newValue > 100) {
                            second = 100;
                            first -= inputValue;
                        } else {
                            second += inputValue;
                            first -= inputValue;
                        }
                    }

                }

            }

        }

    }
}
