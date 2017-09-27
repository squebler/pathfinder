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
        if (c.deck != null) {
            c.deck.remove(c);
        }
        cards.add(c);
        c.deck = this;
    }

    public void remove(Card c) {
        cards.remove(c);
        if (c.deck == this) { // may have already been added to another deck
            c.deck = null;
        }
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

    /**
     * Created by Tomas on 9/22/2017.
     */
    public static class Card {

        private String name;

        /** Only Deck should be adjusting this. */
        private Deck deck;

        public Card(String name) {
            this.name = name;
        }

        public void move(Deck target) {
            deck.remove(this);
            target.add(this);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
