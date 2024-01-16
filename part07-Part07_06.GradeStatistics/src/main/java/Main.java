
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        // Write your program here -- consider breaking the program into
        // multiple classes.
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int pointsInput = Integer.valueOf(scanner.nextLine());

            if (pointsInput == -1) {
                break;
            }

            if (pointsInput <= 100 && pointsInput >= 0) {
                points.add(pointsInput);
            }
        }
        System.out.println("Point average (all): " + points.average());
        System.out.println("Point average (passing): " + points.averageOfPassingPoints());
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println("Grade distribution: ");
        for (int i = 5; i>=0; i--){

            System.out.println(i + ": " + points.stars(points.gradeDistribution(i)));
        }
    }
}
