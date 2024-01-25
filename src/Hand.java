import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards = new ArrayList<>();
    int value;

    public Hand() {

    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void clear() {
        cards.removeAll(new Hand().getCards());
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public int getHandAmount() {
        return this.cards.size();
    }

    public Card getCard(int index) {
        if (index > this.cards.size()) throw new IllegalArgumentException("Index is larger than amount od cards in hand");
        return this.cards.get(index);
    }

    public int getHandValue() {
        int value = 0;
        if (this.cards.isEmpty()) return value;
        for(Card card: cards) {
            value += card.getValue();
        }
        return value;
    }

    public Boolean checkCharlie() {
        return this.cards.size() >= 7;
    }

    public Boolean checkBlackjack() {
        return this.getHandValue() == 21;
    }

    public Boolean checkBust() {
        return this.getHandValue() > 21;
    }

    public String getHandString() {
        StringBuilder handString = new StringBuilder("Hand:");
        for(Card card: cards) {
            handString.append(" | ").append(card.getRank()).append(" of ").append(card.getSuit());
        }
        handString.append(" | ").append("Value: ").append(getHandValue());
        return handString.toString();
    }

}
