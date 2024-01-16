import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {
        int newWeight = totalWeight();

        if (totalWeight() < maxWeight) {
            newWeight += item.getWeight();
        }

        if (newWeight <= maxWeight) {
            items.add(item);
        }

    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items " + "(" + totalWeight() + " kg)";
        }
        if (items.size() == 1) {
            return "1 item " + "(" + totalWeight() + " kg)";
        }

        return items.size() + " items " + "(" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = new Item("H", 0);

        for (Item i : items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }

        return heaviest;

    }

}
