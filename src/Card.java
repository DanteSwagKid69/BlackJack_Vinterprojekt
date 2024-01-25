public class Card {


    int value;
    String rank;
    String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        this.value = getValue();
    }

    public int getValue() {
        return switch (rank) {
            case "Ace" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10", "Queen", "Knight", "King" -> 10;
            default -> throw new IllegalArgumentException("Invalid card rank: " + rank);
        };
    }

    String getRank() {
        return this.rank;
    }

    String getSuit() {
        return this.suit;
    }

    String getString() {
        return "Card: " + this.rank + " " + this.suit;
    }

    // TODO: Change ace from 1 to 11 depending on whats more beneficial for the player


}
