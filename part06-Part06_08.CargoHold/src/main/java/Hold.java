import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int newWeight = totalWeight();

        if (totalWeight() < maxWeight) {
            newWeight += suitcase.totalWeight();
        }

        if (newWeight <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase s : suitcases) {
            totalWeight += s.totalWeight();
        }

        return totalWeight;
    }

    public String toString() {
        return suitcases.size() + " suitcases " + "(" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

}
