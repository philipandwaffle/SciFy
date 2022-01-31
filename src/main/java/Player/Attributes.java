package Player;

public class Attributes {
    protected enum attribute{
        strength,
        dexterity,
        constitution,
        intelligence,
        charisma,
        wisdom
    }
    protected int[] attrubutes;

    public Attributes(int[] attributes){
        if (attributes.length != attribute.values().length){
            throw new IllegalArgumentException(String.format("There must be {0} attributes given", attribute.values().length));
        }
        this.attrubutes = attributes;
    }

    public int[] getModifiers(){
        int[] modifiers = new int[attrubutes.length];

        for (int i = 0; i < attrubutes.length; i++) {
            modifiers[i] = Math.floorDiv((attrubutes[i] - 10), 2);
        }

        return modifiers;
    }
}
