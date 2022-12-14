import javax.swing.text.BadLocationException;

public class Blackjack {
    private final String playerName;
    private final int max_it;


    private int playerBalance;
    private int croupierBalance;
    private final Deck deck;

    public static class Builder {
        private final String playerName;
        private final Deck deck;
        private int max_it;
        private int playerBalance;
        private int croupierBalance;


        public Builder(String playerName, Deck deck) {
            this.playerName = playerName;
            this.max_it = 10;
            this.deck = deck;
            this.croupierBalance = 0;
            this.playerBalance = 0;
        }

        public Builder setCroupierBalance(int croupierBalance) {
            this.croupierBalance = croupierBalance;
            return this;
        }

        public Builder setPlayerBalance(int playerBalance) {
            this.playerBalance = playerBalance;
            return this;
        }

        public Builder setMaxIt(int max_it) {
            this.max_it = max_it;
            return this;
        }

        public Blackjack build() {
            return new Blackjack(this);
        }
    }

    private Blackjack(Builder b) {
        playerName = b.playerName;
        max_it = b.max_it;
        playerBalance = b.playerBalance;
        croupierBalance = b.croupierBalance;
        deck = b.deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public int getMax_it() {
        return max_it;
    }

    public void setPlayerBalance(int b) {
        this.playerBalance = b;
    }

    public void setCroupierBalance(int croupierBalance) {
        this.croupierBalance = croupierBalance;
    }

    public int getPlayerBalance() {
        return playerBalance;
    }

    public int getCroupierBalance() {
        return croupierBalance;
    }

    public void play() {
        Card playerCardRandom = getDeck().randomCard();
        System.out.println("Dobrales " + playerCardRandom);
        getDeck().removeCard(playerCardRandom);
        setPlayerBalance(getPlayerBalance() + playerCardRandom.getRank().getWeight());

        Card croupierCardRandom = getDeck().randomCard();
        System.out.println("Krupier dobral " + croupierCardRandom);
        getDeck().removeCard(croupierCardRandom);
        setCroupierBalance(getCroupierBalance() + croupierCardRandom.getRank().getWeight());

        printCards();
    }

    public void stop() {
        printCards();
        if (21 - getPlayerBalance() < 21 - getCroupierBalance())
            System.out.println("Wygrales");
        else if (21 - getPlayerBalance() > 21 - getCroupierBalance())
            System.out.println("Krupier wygral");
        else
            System.out.println("REMIS");

    }

    public void printCards() {
        System.out.println("Twoje karty: " + getPlayerBalance());
        System.out.println("Karty krupiera: " + getCroupierBalance());
    }

    public boolean checkWin() {
        if (getCroupierBalance() == 21 || getPlayerBalance() > 21) {
            System.out.println("Krupier wygral");
            return true;
        }
        if (getPlayerBalance() == 21 || getCroupierBalance() > 21) {
            System.out.println("Wygrales");
            return true;
        }
        return false;
    }
}
