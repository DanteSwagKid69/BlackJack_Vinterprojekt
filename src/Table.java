import java.util.ArrayList;
import java.util.Collections;

public class Table extends Deck {
    private int amountOfDecks;

    ArrayList<Player> players = new ArrayList<>();

    public Table(int amountOfDecks) {
        this.amountOfDecks = amountOfDecks;
        InitializeTableCards();
    }

    private void InitializeTableCards() {
        for (int i = 0; i < amountOfDecks; i++) {
            cards.addAll(new Deck().getCards());
        }
    }

    @Override
    public void printCards() {
        super.printCards();
    }

    @Override
    public Card getTopCard() {
        return super.getTopCard();
    }

    @Override
    public ArrayList<Card> getCards() {
        return super.getCards();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    public void printPlayersInfo() {
        for (Player player: this.players) {
            player.printInfo();
        }
    }


}
