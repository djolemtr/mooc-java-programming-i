
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room r = new Room();
        Person first = new Person("first", 62);
        Person second = new Person("second", 59);
        Person third = new Person("third", 104);
        Person fourth = new Person("fourth", 61);

        
        r.add(first);
        r.add(second);
        r.add(third);
        r.add(fourth);

        while (!r.isEmpty()) {
            System.out.println(r.take());
        }
    }
}
