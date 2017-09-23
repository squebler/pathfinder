package app;

import objectModel.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tomas on 9/22/2017.
 */
public class CardShuffler {

    public static void main(String[] args) {

        // make a list of cards in a certain identifiable order
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("a"));
        cards.add(new Card("b"));
        cards.add(new Card("c"));
        cards.add(new Card("d"));
        cards.add(new Card("e"));

        print(cards);

        // shuffle the cards
        cards = shuffle(cards);

        // print the list to show that it is shuffled
        print(cards);
    }

    public static void print(List<Card> cards) {
        for (Card c : cards) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }

    public static List<Card> shuffle(List<Card> src) {
        Random rand = new Random();

        List<Card> shuffled = new ArrayList<>(src.size());

        while (!src.isEmpty()) {
            int srcInd = rand.nextInt(src.size());
            Card c = src.remove(srcInd);
            shuffled.add(c);
        }

        return shuffled;
    }
}
