public class Gauge {
    private int value;

    public Gauge() {
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}
