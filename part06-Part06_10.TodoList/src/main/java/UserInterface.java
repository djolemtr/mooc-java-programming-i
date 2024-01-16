import java.util.Scanner;

public class UserInterface {

    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            command(command);

        }
    }

    public void command(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {

        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        this.todolist.add(task);

    }

    public void list() {
        this.todolist.print();
    }

    public void remove() {

        System.out.print("Which one is removed? ");
        int i = Integer.valueOf(scanner.nextLine());
        todolist.remove(i);
    }

}
