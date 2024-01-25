public class Player {

    Hand hand = new Hand();
    String name;
    double balance;
    double bet;
    boolean isStanding;
    boolean isWinner;


    public Player(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void hit(Dealer dealer) {
        this.isStanding = false;
        dealer.dealCard(this);

    }

    public void stand() {
        this.isStanding = true;
    }

    public void bet(double amount) {
        this.bet = amount;
    }

    public void push() {

    }

    public boolean getIsWinner() {
        return this.isWinner;
    }

    public void setIsWinner(boolean bool) {
        this.isWinner = bool;
    }

    public boolean getIsStanding() {
        return this.isStanding;
    }

    public void clearCards() {
        for(Card card: this.hand.getCards()) {
            this.hand.getCards().remove(card);
        }
    }

    public String getName() {
        return this.name;
    }

    public double getBet() {
        return this.bet;
    }

    public double getBalance() {
        return balance;
    }

    public Hand getHand() {
        return this.hand;
    }


    public void printInfo(){
        System.out.println("[Player: " + this.name + "] " + this.hand.getHandString());
    }
}

