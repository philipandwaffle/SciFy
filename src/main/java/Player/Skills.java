package Player;

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
        survival
    }
    protected int[] skills;

    public Skills(int[] attributes) {
        super(attributes);
        skills = new int[skill.values().length];
        calculateSkills();
    }

    private void calculateSkills(){
        for (attribute a: attribute.values()) {

        }
    }

    private skill[] getSkillIndex(attribute a){
        switch (a){
            case strength:
                return new skill[] {skill.athletics};
            case dexterity:
                return new skill[] {skill.acrobatics, skill.slightOfHand, skill.stealth};
            case charisma:
                return new skill[] {skill.deception,skill.insight, skill.performance, skill.persuasion};
            case intelligence:
                return new skill[] {skill.arcana, skill.history, skill.investigation, skill.nature, skill.religion};
            case wisdom:
                return new skill[] {skill.animalHandling, skill.insight, skill.medicine, skill.perception, skill.survival};
            default:
                return new skill[] {null};
        }
    }
}
