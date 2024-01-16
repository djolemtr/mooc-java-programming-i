import javax.crypto.AEADBadTagException;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        // Money newMoney = new Money(compared.euros, compared.cents);
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;

    }

    public Money minus(Money decreaser) {
        int newEuros = 0;
        int newCents = 0;
        newEuros = this.euros - decreaser.euros;
        if (decreaser.cents > this.cents) {
            newEuros--;
            newCents = this.cents - decreaser.cents;
            newCents += 100;
        } else {
            newCents = this.cents - decreaser.cents;
        }

        Money newMoney = new Money(newEuros, newCents);
        if (newMoney.euros < 0) {
            Money brandNewMoney = new Money(0, 0);
            return brandNewMoney;
        }

        return newMoney;
    }

}
