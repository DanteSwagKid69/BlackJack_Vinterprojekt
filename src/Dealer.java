public class Dealer {

    private Table table;
    private Hand hand = new Hand();
    private Boolean isStanding;
    private Boolean isWinner;


    public Dealer(Table table) {
        this.table = table;


    }

    public void dealHand(Player player) {
        player.getHand().addCard(table.getTopCard());
        player.getHand().addCard(table.getTopCard());
    }

    public void dealCard(Player player) {
        player.getHand().addCard(table.getTopCard());
    }

    public boolean shouldHit() {
        return this.hand.getHandValue() < 17;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void hit() {
        hand.addCard(table.getTopCard());
    }

    public Boolean getIsWinner() {
        return this.isWinner;
    }

    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
    }

    public Boolean getIsStanding() {
        return this.isStanding;
    }

    public void clearCards() {
        for (Card card : this.hand.getCards()) {
            this.hand.getCards().remove(card);
        }
    }

    public void printInfo() {
        System.out.println("[Dealer] " + this.hand.getHandString());
    }
}
