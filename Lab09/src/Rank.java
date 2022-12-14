public enum Rank {
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(2, "J"),
    QUEEN(3, "Q"),
    KING(4, "K"),
    ACE(11, "A");

    private final int weight;
    private final String symbol;

    Rank(int weight, String symbol) {
        this.weight = weight;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

    public int getWeight() {
        return weight;
    }
}
