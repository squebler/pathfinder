package objectModel.test;

import objectModel.Box;
import static org.junit.Assert.*;

import objectModel.Card;
import objectModel.Deck;
import static objectModel.test.TestDeck.isShuffled;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by tomas on 10/8/2017.
 */
public class TestBox {

    @Test
    public void testDefaults() {
        Box b = new Box();

        assertEquals(0, b.getDecks().size());

        // shuffle should throw no exceptions, even with 0 decks.
        b.shuffle();
    }

    @Test
    public void testAdd_onePlusDecks_onePlusCards_decksReturnedByGetDecks() {
        Box b = new Box();

        Deck d0 = new Deck();
        b.add(d0);

        Deck d1 = new Deck();
        for (int i = 0; i < 5; i++) {
            d1.add(new Card("d1c" + i));
        }
        b.add(d1);

        Deck d2 = new Deck();
        d2.add(new Card("d2c0"));
        b.add(d2);

        assertEquals(3, b.getDecks().size());
        assertEquals(d0, b.getDecks().get(0));
        assertEquals(d1, b.getDecks().get(1));
        assertEquals(d2, b.getDecks().get(2));

        assertEquals(0, b.getDecks().get(0).getCards().size());

        assertEquals(5, b.getDecks().get(1).getCards().size());
        for (int i = 0; i < 5; i++) {
            assertEquals("d1c" + i, b.getDecks().get(1).getCards().get(i).getName());
        }

        assertEquals(1, b.getDecks().get(2).getCards().size());
        assertEquals("d2c0", b.getDecks().get(2).getCards().get(0).getName());
    }

    @Test
    public void testShuffle() {
        Box b = new Box();

        // This case of a 0 card deck is just to check that it doesn't throw an exception when shuffle is called.
        Deck d0 = new Deck();
        b.add(d0);

        Deck d1 = new Deck();
        ArrayList<Card> d1BeforeShuffle = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Card c = new Card("d1c" + i);
            d1.add(c);
            d1BeforeShuffle.add(c);
        }
        b.add(d1);

        // This case of a 1 card deck is just to check that it doesn't throw an exception when shuffle is called.
        Deck d2 = new Deck();
        ArrayList<Card> d2BeforeShuffle = new ArrayList<>();
        Card d2c0 = new Card("d2c0");
        d2.add(d2c0);
        d2BeforeShuffle.add(d2c0);
        b.add(d2);

        // shuffle up to 3 times, because theoretically, it's possible for the shuffle to result in the same order
        // as long as one of them comes shuffled - that's a pass.
        boolean isShuffled = false;
        for (int i = 0; i < 3; i++) {
            b.shuffle();
            if (isShuffled = isShuffled(d1, d1BeforeShuffle)) {
                break;
            }
        }
        assertTrue(isShuffled);
    }
}
