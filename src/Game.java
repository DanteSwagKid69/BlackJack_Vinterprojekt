import java.util.Scanner;

public class Game {

    Table table;
    Dealer dealer;


    public Game() {
        this.table = new Table(3);
        this.dealer = new Dealer(this.table);
        this.table.addPlayer(new Player("Dante", 100));
        run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        table.shuffle();
        dealer.dealHand(this.table.getPlayers().get(0));
        dealer.hit();
        while (true) {
            this.dealer.printInfo();
            this.table.getPlayers().get(0).printInfo();
            switch (answerHandlerInt("Hit or Stand?", new String[]{"Hit", "Stand"})) {
                case 1 -> this.dealer.dealCard(this.table.getPlayers().get(0));
                case 2 -> this.table.getPlayers().get(0).stand();
            }
            while(this.dealer.shouldHit()) {
                if (this.table.getPlayers().get(0).getIsStanding()) break;
                this.dealer.printInfo();
                this.dealer.hit();
            }

        }

    }

    public int answerHandlerInt(String question, String[] options) {

        if (options.length == 0) throw new IllegalArgumentException("There is no options");

        System.out.println(question);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

}
