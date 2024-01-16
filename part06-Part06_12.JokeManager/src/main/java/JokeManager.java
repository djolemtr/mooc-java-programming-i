import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {

        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        double random = Math.random() * this.jokes.size();
        return this.jokes.get((int) random);
    }

    public void printJokes() {
        for (String j : this.jokes) {
            System.out.println(j);
        }
    }

}
