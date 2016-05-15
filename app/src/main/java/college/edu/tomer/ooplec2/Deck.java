package college.edu.tomer.ooplec2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by master on 15/05/16.
 */
public class Deck {
    //properties
    private ArrayList<Card> cards = new ArrayList<>();


    //constructors:

    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"♥", "♦", "♣", "♠"};

    public Deck() {
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                Card c = new Card(ranks[i], suits[j]);
                cards.add(c);
            }
        }
    }

    public void shuffle() {
        Random randGen = new Random();

        ArrayList<Card> shuffled = new ArrayList<>();
        for (int i = 0; i < cards.size(); ) {
            int rand = randGen.nextInt(cards.size());
            Card c = cards.remove(rand);
            shuffled.add(c);
        }
        cards = shuffled;
    }

    public void shuffleEasy() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.size() > 0)
            return cards.remove(0);
        return null;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
