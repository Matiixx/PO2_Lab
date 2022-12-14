public class Card {
    private Suit color;
    private Rank rank;

    public Card(Suit color, Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return this.color + " " + this.rank;
    }

    public Suit getColor() {
        return color;
    }

    public Rank getRank() {
        return rank;
    }
}
