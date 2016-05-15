package college.edu.tomer.ooplec2;

import java.util.Hashtable;

/**
 * Created by master on 15/05/16.
 */
public enum  Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9),
    JACK(10), QUEEN(10), KING(10), ACE(11);

    private int value;

    @Override
    public String toString() {
        Hashtable<Rank, String> vals = new Hashtable<>();
        vals.put(ACE, "Ace");
        vals.put(KING, "King");
        vals.put(QUEEN, "Queen");
        vals.put(JACK, "Jack");

        if (this.value < 10)
            return value +"";
        return vals.get(this);
    }

    Rank(int value) {
        this.value = value;
    }
}
