package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tomas on 9/20/2017.
 */
public class CharacterShuffler {

    public static void main(String[] args) {

        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('e');

        List<Character> shuffled = shuffle(chars);

        System.out.print("Shuffled: ");
        for (Character c : shuffled) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }

    public static List<Character> shuffle(List<Character> src) {
        Random rand = new Random();

        List<Character> shuffled = new ArrayList<>(src.size());

        while (!src.isEmpty()) {
            int srcInd = rand.nextInt(src.size());
            Character c = src.remove(srcInd);
            shuffled.add(c);
        }

        return shuffled;
    }
}
