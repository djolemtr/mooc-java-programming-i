
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares);
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        int priceDifference = comparedPrice - thisPrice;

        if (priceDifference < 0) {
            priceDifference *= -1;
        }

        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;

        return thisPrice > comparedPrice;
    }

}
