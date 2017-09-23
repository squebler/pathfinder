package app;

import objectModel.Box;
import objectModel.Card;
import objectModel.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tomas on 9/22/2017.
 */
public class CardShuffler {

    public static void main(String[] args) {

        // make a list of decks
        List<Deck> decks = new ArrayList<>();

        // add cards in a certain identifiable order, to each deck
        Deck deck1 = new Deck();
        deck1.add(new Card("1a"));
        deck1.add(new Card("1b"));
        deck1.add(new Card("1c"));
        deck1.add(new Card("1d"));
        deck1.add(new Card("1e"));
        decks.add(deck1);
        Deck deck2 = new Deck();
        deck2.add(new Card("2a"));
        deck2.add(new Card("2b"));
        deck2.add(new Card("2c"));
        deck2.add(new Card("2d"));
        deck2.add(new Card("2e"));
        decks.add(deck2);
        Deck deck3 = new Deck();
        deck3.add(new Card("3a"));
        deck3.add(new Card("3b"));
        deck3.add(new Card("3c"));
        deck3.add(new Card("3d"));
        deck3.add(new Card("3e"));
        decks.add(deck3);

        System.out.println("Regular Decks");
        print(decks);

        // make the Box list of decks
        Box box = new Box();
        Deck boxDeck1 = new Deck();
        boxDeck1.add(new Card("B1a"));
        boxDeck1.add(new Card("B1b"));
        boxDeck1.add(new Card("B1c"));
        boxDeck1.add(new Card("B1d"));
        boxDeck1.add(new Card("B1e"));
        box.add(boxDeck1);
        Deck boxDeck2 = new Deck();
        boxDeck2.add(new Card("B2a"));
        boxDeck2.add(new Card("B2b"));
        boxDeck2.add(new Card("B2c"));
        boxDeck2.add(new Card("B2d"));
        boxDeck2.add(new Card("B2e"));
        box.add(boxDeck2);
        Deck boxDeck3 = new Deck();
        boxDeck3.add(new Card("B3a"));
        boxDeck3.add(new Card("B3b"));
        boxDeck3.add(new Card("B3c"));
        boxDeck3.add(new Card("B3d"));
        boxDeck3.add(new Card("B3e"));
        box.add(boxDeck3);

        System.out.println("Box Decks");
        print(box);

        // shuffle the decks
        for (Deck d : decks) {
            d.shuffle();
        }
        box.shuffle();

        // print the decks to show they're shuffled
        System.out.println();
        System.out.println("Regular decks");
        print(decks);
        System.out.println("Box Decks");
        print(box);
    }

    public static void print(Deck cards) {
        for (Card c : cards.getCards()) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }

    public static void print(List<Deck> decks) {
        for (Deck d : decks) {
            print(d);
        }
    }

    public static void print(Box box) {
        for (Deck d : box.getDecks()) {
            print(d);
        }
    }
}
