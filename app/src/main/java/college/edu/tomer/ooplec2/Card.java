package college.edu.tomer.ooplec2;

/**
 * Created by master on 15/05/16.
 */
public class Card {

    //properties:
    private String rank; //1, 2, 3, 4... Jack, Queen, King, Ace
    private String suit; // ♥♦♣♠

    //constructor
    public Card(String rank, String suit) {
        setRank(rank);
        setSuit(suit);
    }

    //setters for validation
    void setRank(String rank) {
        this.rank = rank;
    }

    void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        //return rank + " of " + suit;

        return String.format("%s of %s", rank, suit);

    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
