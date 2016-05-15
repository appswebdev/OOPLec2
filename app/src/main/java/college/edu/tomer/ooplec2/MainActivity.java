package college.edu.tomer.ooplec2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View card1, card2;
    Deck d = new Deck();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d.shuffle();

    }
    int currentCard = 1;
    void drawCard(){
        Card card = d.drawCard();
        TextView suitTop, suitBottom, suitMiddle;
        TextView rankTop, rankBottom;

        if (currentCard == 1){
            card1 = findViewById(R.id.card2);
            suitTop = (TextView) card1.findViewById(R.id.suitTop);
            suitBottom = (TextView) card1.findViewById(R.id.suitBottom);
            suitMiddle = (TextView) card1.findViewById(R.id.suitMiddle);
            rankTop = (TextView) card1.findViewById(R.id.rankTop);
            rankBottom = (TextView) card1.findViewById(R.id.rankBottom);

            suitTop.setText(card.getSuit());
            suitBottom.setText(card.getSuit());
            suitMiddle.setText(card.getSuit());

            rankBottom.setText(card.getRank());
            rankTop.setText(card.getRank());

        }
    }

    public void drawCard(View view) {
        drawCard();
    }
}
