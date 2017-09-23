package objectModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tomas on 9/22/2017.
 */
public class Deck {

    private List<Card> cards = new ArrayList<>();

    public void add(Card c) {
        cards.add(c);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Random rand = new Random();

        List<Card> shuffled = new ArrayList<>(cards.size());

        while (!cards.isEmpty()) {
            int srcInd = rand.nextInt(cards.size());
            Card c = cards.remove(srcInd);
            shuffled.add(c);
        }

        cards = shuffled;
    }
}
