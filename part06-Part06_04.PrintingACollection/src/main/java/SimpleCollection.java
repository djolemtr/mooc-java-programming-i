
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String printOutput = "The collection " + this.name + " has " + elements.size();

        if (elements.size() == 1) {
            printOutput += " element:";
        } else {
            printOutput += " elements:";
        }

        String elementsInList = "";
        for (String element : elements) {

            if (elements.size() == 1) {
                elementsInList += element;
            } else {
                elementsInList += element + "\n";
            }
        }

        return printOutput + "\n" + elementsInList;
    }

}
