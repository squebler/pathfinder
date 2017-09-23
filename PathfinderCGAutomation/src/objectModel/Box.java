package objectModel;

import java.util.ArrayList;
import java.util.List;

/**
 * The Box is not all the cards in the physical box, it's just the ones you regularly shuffle and draw, e.g., monsters
 * , weapons, but not locations or scourges.
 */
public class Box {

    List<Deck> decks = new ArrayList<>();

    public void add(Deck d) {
        decks.add(d);
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public void shuffle() {
        for (Deck d : decks) {
            d.shuffle();
        }
    }
}
