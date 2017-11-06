package objectModel;

/**
 * Created by tomas on 11/5/2017.
 */
public class Boon extends BaneBoon {

    private String powers;
    private String recharge;

    public Boon(String name, int advDeckNumber) {
        super(name, advDeckNumber);
    }

    public Boon(String name, int advDeckNumber, String powers, String recharge) {
        super(name, advDeckNumber);

        this.powers = powers;
        this.recharge = recharge;
    }
}
