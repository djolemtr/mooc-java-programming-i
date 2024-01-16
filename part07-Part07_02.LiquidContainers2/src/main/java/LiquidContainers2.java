
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] part = input.split(" ");
            String command = part[0];
            int amount = Integer.valueOf(part[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }
            if (command.equals("move")) {
                if (amount > firstContainer.contains()) {
                    amount = firstContainer.contains();
                }
                firstContainer.remove(amount);
                secondContainer.add(amount);

                if (secondContainer.contains() > 100) {
                    secondContainer.add(100);
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);

            }

        }

    }

}
