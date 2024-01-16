
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("")){
                break;
            }
            System.out.println(parts[parts.length-1]);
        }

    }
}
