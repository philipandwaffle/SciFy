package Player;

import java.util.Arrays;

public class Skills extends Attributes {
    protected enum skill{
        //strength
        athletics,

        //dexterity
        acrobatics,
        slightOfHand,
        stealth,

        //charisma
        deception,
        intimidation,
        performance,
        persuasion,

        //intelligence
        arcana,
        history,
        investigation,
        nature,
        religion,

        //wisdom
        animalHandling,
        insight,
        medicine,
        perception,
        survival;

        private int value;

        public int getValue() {
            return value;
        }
    }
    protected int[] skills;
    public int[] getSkills(){
        return skills;
    }

    public Skills(int[] attributes) {
        super(attributes);
        skills = new int[skill.values().length];
        initSkills();
    }

    private void initSkills(){
        for (attribute a: attribute.values()) {
            skill[] aSkill = getSkillIndex(a);
            for (skill s: aSkill) {
                System.out.println("atrubute value" + a.ordinal());
                System.out.println("skill value" + s.ordinal());
                skills[s.ordinal()] = Math.floorDiv(attrubutes[a.ordinal()]-10, 2);
            }
        }
    }

    private skill[] getSkillIndex(attribute a){
        switch (a){
            case strength:
                return new skill[] {skill.athletics};
            case dexterity:
                return new skill[] {skill.acrobatics, skill.slightOfHand, skill.stealth};
            case charisma:
                return new skill[] {skill.deception,skill.intimidation, skill.performance, skill.persuasion};
            case intelligence:
                return new skill[] {skill.arcana, skill.history, skill.investigation, skill.nature, skill.religion};
            case wisdom:
                return new skill[] {skill.animalHandling, skill.insight, skill.medicine, skill.perception, skill.survival};
            default:
                return new skill[] {};
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Skills{" +
                "skills=" + Arrays.toString(skills) +
                '}';
        return s;
    }
}
