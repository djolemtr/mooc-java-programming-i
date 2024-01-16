import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo;

    public TodoList() {
        todo = new ArrayList<>();
    }

    public void add(String task) {
        todo.add(task);
    }

    public void print() {
        int i = 0;
        while (todo.size() > i) {
            System.out.println((i + 1) + ": " + todo.get(i));
            i++;
        }
    }

    public void remove(int number) {
        todo.remove(number - 1);
    }
}
