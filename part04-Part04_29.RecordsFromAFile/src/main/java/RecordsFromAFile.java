
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner data = new Scanner(Paths.get(file))) {

            while (data.hasNextLine()) {
                String line = data.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.print(name + ", age: " + age);
                if (age == 1) {
                    System.out.print(" year");
                } else {
                    System.out.println(" years");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

    }
}
