import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: "
                    + "\n1 - add a joke"
                    + "\n2 - draw a joke"
                    + "\n3 - list jokes"
                    + "\nX - stop");
            String command = this.scanner.nextLine();

            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = this.scanner.nextLine();
                this.jokeManager.addJoke(joke);
            }
            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();

            }
            if (command.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            }

        }
    }

}
