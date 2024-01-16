import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void add(String value){
        stack.add(0, value);
    }

    public ArrayList<String> values(){
        return stack;
    }
    public String take(){
        return stack.remove(0);
    }
}

