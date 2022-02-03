package Player;

import Helper.Format;

import java.util.Arrays;
import java.util.List;

public class Attributes {
    public enum attribute{
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
    protected int[] attributes;
    public int[] getAttributes(){
        return attributes;
    }

    protected int[] modifiers;
    public int[] getModifiers() {
        return modifiers;
    }

    public Attributes(int[] attributes){
        if (attributes.length != attribute.values().length){
            throw new IllegalArgumentException(String.format("There must be {0} attributes given", attribute.values().length));
        }
        this.attributes = attributes;
        initModifiers();
    }

    private void initModifiers(){
        modifiers = new int[attributes.length];
        for (attribute a: attribute.values()) {
            modifiers[a.ordinal()] = Math.floorDiv((attributes[a.ordinal()] - 10), 2);
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += Format.toDisplayTable(Arrays.asList(
                        Format.toStringArray(attribute.class),
                        Format.toStringArray(attributes)
        ));
        return res;
    }
}
