public class Deck {
    private int length = 24;
    private Card tab[];

    public Deck() {
        tab = new Card[length];
        int it = 0;
        for (var s : Suit.values())
            for (var r : Rank.values()) {
                tab[it] = new Card(s, r);
                it++;
            }
    }

    public Card randomCard() {
        int rand = new java.util.Random().nextInt(length);
        return tab[rand];
    }

    public void removeCard(Card toRemove) {
        Card newTab[] = new Card[length - 1];
        length--;
        int it = 0;
        for (var el : tab) {
            if (el.getColor() == toRemove.getColor()
                    && el.getRank() == toRemove.getRank()) {
                continue;
            }
            newTab[it] = el;
            it++;
        }
        tab = newTab;
    }

    @Override
    public String toString() {
        String s = "Liczba kart w talii: " + length + "\n";
        for (var el : tab) {
            s += el + "\n";
        }
        return s;
    }
}
