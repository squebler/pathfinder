package objectModel;

/**
 * Created by tomas on 11/4/2017.
 */
public class Location extends Card {

    private int advDeckNumber;
    private int numMonsters;
    private int numBarriers;
    private int numWeapons;
    private int numSpells;
    private int numArmors;
    private int numItems;
    private int numAllies;
    private int numBlessings;
    private String whileAbility;
    private String closingChallenge;
    private String permCloseEffect;
    // Actually, here, we probably want a list of "attributes", and abyssal is an attribute.
    private boolean isAbyssal;
    // Front side vs back side
    // Image
    // Lore

    public Location() {
        super("test-location");
    }

    public Location(String name, int advDeckNumber, int numMonsters, int numBarriers, int numWeapons, int numSpells, int numArmors,
                    int numItems, int numAllies, int numBlessings, String whileAbility, String closingChallenge,
                    String permCloseEffect, boolean isAbyssal) {
        super(name);

        this.advDeckNumber = advDeckNumber;
        this.numMonsters = numMonsters;
        this.numBarriers = numBarriers;
        this.numWeapons = numWeapons;
        this.numSpells = numSpells;
        this.numArmors = numArmors;
        this.numItems = numItems;
        this.numAllies = numAllies;
        this.numBlessings = numBlessings;
        this.whileAbility = whileAbility;
        this.closingChallenge = closingChallenge;
        this.permCloseEffect = permCloseEffect;
        this.isAbyssal = isAbyssal;
    }
}
