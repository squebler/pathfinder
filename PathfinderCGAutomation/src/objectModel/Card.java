package objectModel;

/**
 * Created by Tomas on 9/22/2017.
 */
public class Card {

    private String name;

    public Card(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
