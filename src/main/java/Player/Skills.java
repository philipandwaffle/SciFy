package Player;

import Helper.Format;

import java.text.Normalizer;
import java.util.Arrays;

public class Skills extends Attributes {
    public enum skill{
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

    public Skills(int[] attributes, int profBonus, skill[] skillProf) {
        super(attributes);
        skills = new int[skill.values().length];
        initSkills(skillProf, profBonus);
    }

    private void initSkills(skill[] skillProf, int profBonus){
        for (attribute a: attribute.values()) {
            skill[] aSkill = getSkillIndex(a);
            for (skill s: aSkill) {
                skills[s.ordinal()] = (attributes[a.ordinal()]-10 / 2);
            }
        }

        for (skill s: skillProf) {
            skills[s.ordinal()] += profBonus;
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
        s += "\n";
        s += Format.toDisplayTable(Arrays.asList(
                Format.toStringArray(skill.class),
                Format.toStringArray(skills)
        ));
        return s;
    }
}
