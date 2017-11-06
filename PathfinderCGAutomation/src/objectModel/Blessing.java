package objectModel;

/**
 * Created by tomas on 11/5/2017.
 */
public class Blessing extends Boon {

    public Blessing() {
        super("test-blessing", 0);
    }

    public Blessing(String name, int advDeckNumber, String powers, String recharge) {
        super(name, advDeckNumber, powers, recharge);
    }
}
