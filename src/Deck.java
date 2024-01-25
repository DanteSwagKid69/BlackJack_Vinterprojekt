import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {


    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knight", "Queen", "King"};

    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> trashedCards = new ArrayList<>();

    public Deck() {
        InitializeDeck();
    }


    private void InitializeDeck() {
        for (String suit : suits) {
            for (String rank : ranks) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void printCards() {
        for (Card card: this.cards) {
            System.out.println(card.getString());
        }
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public Card getTopCard() {
        Card pickedCard = this.cards.get(0);
        this.cards.remove(this.cards.get(0));
        trashedCards.add(pickedCard);

        return pickedCard;
    }



}
