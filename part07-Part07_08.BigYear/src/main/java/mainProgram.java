
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> birds = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birds.add(new Bird(name, latinName));
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                boolean birdExists = false;
                for (Bird b : birds) {
                    if (b.getName().equals(bird)) {
                        b.addObservation();
                        birdExists = true;
                    }
                }
                if (!birdExists) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                Collections.sort(birds, new Comparator<Bird>() {
                    @Override
                    public int compare(Bird o1, Bird o2) {
                        return Double.compare(o1.getObservations(), o2.getObservations());
                    }
                });

                for (int i = birds.size() - 1; i >= 0; i--) {
                    System.out.println(birds.get(i));
                }
            }

            if (command.equals("One")) {

                System.out.print("Bird? ");
                String bird = scan.nextLine();
                boolean birdExists = false;
                for (Bird b : birds) {
                    if (b.getName().equals(bird)) {
                        System.out.println(b);
                        birdExists = true;
                    }
                }
                if (!birdExists) {
                    System.out.println("Not a bird!");
                }
            }

        }

    }

}
