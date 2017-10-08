package objectModel.test;

import objectModel.Card;
import objectModel.Deck;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomas on 10/8/2017.
 */
public class TestDeck {

    @Test
    public void testDefaults() {
        Deck d = new Deck();

        List<Card> cards = d.getCards();

        assertEquals(0, cards.size());

        // shuffle should execute without exceptions, even with 0 cards.
        d.shuffle();
    }

    @Test
    public void testAdd_onePlusCards_cardsAreReturnedInOrderAdded() {
        Deck d = new Deck();

        // one card in the deck
        d.add(new Card("c0"));
        assertEquals("c0", d.getCards().get(0).getName());

        // multiple cards in the deck
        d.add(new Card("c1"));
        assertEquals("c0", d.getCards().get(0).getName());
        assertEquals("c1", d.getCards().get(1).getName());

        // I'm testing up to 500 cards, because it's unlikely for a deck to be more than that.
        for (int i = 2; i < 500; i++) {
            d.add(new Card("c" + i));
        }
        for (int i = 0; i < 500; i++) {
            assertEquals("c" + i, d.getCards().get(i).getName());
        }
    }

    @Test
    public void testShuffle_onePlusCards_cardsAreShuffled() {
        Deck d0 = new Deck();
        ArrayList<Card> cardsBeforeShuffle = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Card c = new Card("c" + i);
            d0.add(c);
            cardsBeforeShuffle.add(c);
        }
        assertTrue(isShuffled(d0, cardsBeforeShuffle));
    }

    public static boolean isShuffled(Deck d, ArrayList<Card> cardsBeforeShuffle) {
        if (d.getCards().size() < 2)
            return true;

        // shuffle 3 times, because theoretically, it's possible for the shuffle to result in the same order
        // as long as one of them comes shuffled - that's a pass.
        boolean isShuffled = false;
        for (int i = 0; i < 3; i++) {
            d.shuffle();
            boolean thisOneIsShuffled = false;
            for (int ci = 0; ci < cardsBeforeShuffle.size(); ci++) {
                if (!cardsBeforeShuffle.get(ci).getName().equals(d.getCards().get(ci).getName())) {
                    thisOneIsShuffled = true;
                    break;
                }
            }
            if (thisOneIsShuffled) {
                isShuffled = true;
                break;
            }
        }
        return isShuffled;
    }

    @Test
    public void testMoveCard_noShuffling_cardsAreReturnedInOrderAdded() {
        Deck d0 = new Deck();
        for (int i = 0; i < 5; i++) {
            d0.add(new Card("d0c" + i));
        }
        Deck d1 = new Deck();
        for (int i = 0; i < 5; i++) {
            d1.add(new Card("d1c" + i));
        }

        // move the first card of the deck
        d0.moveCard(0, d1);
        assertEquals(4, d0.getCards().size());
        for (int i = 1; i < 5; i++) {
            assertEquals("d0c" + i, d0.getCards().get(i-1).getName());
        }
        assertEquals(6, d1.getCards().size());
        for (int i = 0; i < 5; i++) {
            assertEquals("d1c" + i, d1.getCards().get(i).getName());
        }
        assertEquals("d0c0", d1.getCards().get(5).getName());

        // move a card in the middle of the deck
        d0.moveCard(1, d1); // moves d0c2 to d1
        assertEquals(3, d0.getCards().size());
        assertEquals("d0c1", d0.getCards().get(0).getName());
        assertEquals("d0c3", d0.getCards().get(1).getName());
        assertEquals("d0c4", d0.getCards().get(2).getName());
        assertEquals(7, d1.getCards().size());
        for (int i = 0; i < 5; i++) {
            assertEquals("d1c" + i, d1.getCards().get(i).getName());
        }
        assertEquals("d0c0", d1.getCards().get(5).getName());
        assertEquals("d0c2", d1.getCards().get(6).getName());

        // move a card at the end of the deck
        d0.moveCard(2, d1); // moves d0c4 to d1
        assertEquals(2, d0.getCards().size());
        assertEquals("d0c1", d0.getCards().get(0).getName());
        assertEquals("d0c3", d0.getCards().get(1).getName());
        assertEquals(8, d1.getCards().size());
        for (int i = 0; i < 5; i++) {
            assertEquals("d1c" + i, d1.getCards().get(i).getName());
        }
        assertEquals("d0c0", d1.getCards().get(5).getName());
        assertEquals("d0c2", d1.getCards().get(6).getName());
        assertEquals("d0c4", d1.getCards().get(7).getName());
    }
}
