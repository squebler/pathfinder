package app;

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

        // make a list of cards in a certain identifiable order
        Deck deck = new Deck();
        deck.add(new Card("a"));
        deck.add(new Card("b"));
        deck.add(new Card("c"));
        deck.add(new Card("d"));
        deck.add(new Card("e"));

        print(deck);

        // shuffle the cards
        deck.shuffle();

        // print the list to show that it is shuffled
        print(deck);
    }

    public static void print(Deck cards) {
        for (Card c : cards.getCards()) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }
}
