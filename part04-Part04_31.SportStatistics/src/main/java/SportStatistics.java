
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        System.out.println("Games: " + gamesCount(file, team));
        System.out.println("Wins: " + wins(file, team));
        System.out.println("Losses: " + losses(file, team));

    }

    public static int gamesCount(String file, String team) {
        int gamesCount = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                if (reader.nextLine().contains(team)) {
                    gamesCount++;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        return gamesCount;
    }

    public static int wins(String file, String team) {
        int wins = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(team)) {
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        wins++;
                    }
                }
                if (parts[1].equals(team)) {
                    if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {

                        wins++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        return wins;
    }

    public static int losses(String file, String team) {
        int losses = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(team)) {
                    if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                        losses++;
                    }
                }
                if (parts[1].equals(team)) {
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {

                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        return losses;
    }
}
