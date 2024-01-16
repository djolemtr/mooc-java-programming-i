
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.00;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            affordableMeals++;
            return card.takeMoney(2.50);
        }
        return false;

        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            heartyMeals++;
            return card.takeMoney(4.30);
        }
        return false;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned
    }

    public double eatAffordably(double payment) {

        if (2.50 <= payment) {
            this.money += 2.50;
            affordableMeals++;
            return payment - 2.50;
        }

        return payment;

    }

    public double eatHeartily(double payment) {

        if (4.30 <= payment) {
            this.money += 4.30;
            heartyMeals++;
            return payment - 4.30;
        }

        return payment;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
