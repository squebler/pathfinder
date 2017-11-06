package objectModel;

import java.util.List;

/**
 * Created by Tomas on 9/22/2017.
 */
public class Card {

    private String name;
    private int advDeckNum;
    private List<String> attributes;

    public Card(String name) {
        this.name = name;
    }

    public Card(String name, int advDeckNum) {
        this.name = name;
        this.advDeckNum = advDeckNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
