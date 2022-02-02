package Player;

import java.util.Arrays;

public class Attributes {
    protected enum attribute{
        strength,
        dexterity,
        constitution,
        intelligence,
        charisma,
        wisdom;

        private int value;

        public int getValue() {
            return value;
        }
    }
    protected int[] attrubutes;
    public int[] getAttrubutes(){
        return attrubutes;
    }

    protected int[] modifiers;
    public int[] getModifiers() {
        return modifiers;
    }

    public Attributes(int[] attributes){
        if (attributes.length != attribute.values().length){
            throw new IllegalArgumentException(String.format("There must be {0} attributes given", attribute.values().length));
        }
        this.attrubutes = attributes;
        initModifiers();
    }

    private void initModifiers(){
        modifiers = new int[attrubutes.length];
        for (attribute a: attribute.values()) {
            modifiers[a.ordinal()] = Math.floorDiv((attrubutes[a.ordinal()] - 10), 2);
        }
    }

    @Override
    public String toString() {
        
    }
}
