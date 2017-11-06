package objectModel;

import java.util.List;

/**
 * A Bane or Boon card.
 *
 * Created by tomas on 11/5/2017.
 */
public class BaneBoon extends Card {

    /**
     * A check to defeat or acquire.
     */
    public class CheckToDefeatAcquire {
        private String checkType;
        private int number;
    }

    private List<CheckToDefeatAcquire> checks;

    public BaneBoon(String name, int advDeckNumber) {
        super(name, advDeckNumber);
    }
}
