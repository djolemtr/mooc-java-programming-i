public class Container {
    private int amountOfLiquid;

    public Container() {
        this.amountOfLiquid = 0;
    }

    public int contains() {
        return this.amountOfLiquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.amountOfLiquid + amount >= 100)
                this.amountOfLiquid = 100;
            else {
                this.amountOfLiquid += amount;
            }
        }
    }

    public void remove(int amount) {
        this.amountOfLiquid -= amount;

        if (this.amountOfLiquid < 0) {
            this.amountOfLiquid = 0;
        }
    }

    public String toString() {
        return this.amountOfLiquid + "/100";
    }
}
