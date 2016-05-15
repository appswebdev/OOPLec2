package college.edu.tomer.ooplec2;

/**
 * Created by master on 15/05/16.
 */
public enum Suit {
    HEART("♥"), DIAMOND("♦"), CLUBS("♣"), SPADES("♠");

    private String shape;

    Suit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
