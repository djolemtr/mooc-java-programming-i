import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personsList;

    public Room() {
        this.personsList = new ArrayList<>();
    }

    public void add(Person person) {
        personsList.add(person);
    }

    public boolean isEmpty() {
        return personsList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personsList;
    }

    public Person shortest() {
        if (this.personsList.isEmpty()) {
            return null;
        }
        Person shortestPerson = personsList.get(0);

        for (Person p : personsList) {
            if (shortestPerson.getHeight() > p.getHeight()) {
                shortestPerson = p;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.personsList.isEmpty()) {
            return null;
        }
        Person shortestPerson = personsList.get(0);

        int shortest = 0;

        for (int i = 1; i < personsList.size(); i++) {

            if (shortestPerson.getHeight() > personsList.get(i).getHeight()) {
                shortestPerson = personsList.get(i);
                shortest = i;
            }
        }

        return personsList.remove(shortest);

    }
}
