package Player;

public class Player extends Skills{
    protected int profBonus;
    protected int level;

    public Player(int[] attributes, int level, skill[] skillProf) {
        super(attributes, calcProfBonus(level), skillProf);
        this.level = level;
        this.profBonus = calcProfBonus(level);
    }

    private static int calcProfBonus(int level){
        return (level / 4) + 2;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s;
    }
}
