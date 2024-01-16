
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        credentialsCheck(username, password);
    }

    public static void credentialsCheck (String username, String password){

        String user1 = "alex";
        String user2 = "emma";
        String pas1 = "sunshine";
        String pas2 = "haskell";

        if ((username.equals(user1) && password.equals(pas1)) || (username.equals(user2) && password.equals(pas2))){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
