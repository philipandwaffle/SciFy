import Player.*;
import Helper.*;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        playerTest();
        //formatTest();
    }

    private static void formatTest(){
        String[] col1 = new String[]{"a1", "b1", "c1"};
        String[] col2 = new String[]{"a2", "b2", "c2"};
        String[] col3 = new String[]{"a3", "b3", "c3"};
        String s = Format.toDisplayTable(Arrays.asList(col1, col2, col3));
        System.out.println(s);
    }

    private static void menuTest(){
        Menu m = new Menu("Test", new String[] {"Choice 1", "Choice 2", "Choice 3"});
        m.display();
        int c = m.getChoice();
        System.out.println(c);
    }

    private static void playerTest(){
        int[] att = new int[] {12, 8, 14, 16, 7, 20};
        int level = 1000;
        Skills.skill[] skillProf = new Skills.skill[]{ Skills.skill.arcana};
        Player p = new Player(att, level, skillProf);
//        System.out.println(Format.arrayToString(Arrays.stream(p.getAttributes()).boxed().toArray(Integer[]::new)));
//        System.out.println(Format.arrayToString(Arrays.stream(p.getModifiers()).boxed().toArray(Integer[]::new)));
//        System.out.println(Format.arrayToString(Arrays.stream(p.getSkills()).boxed().toArray(Integer[]::new)));
//        System.out.println(p.toString());
//        Attributes a = new Attributes(new int[] {11, 8, 10, 10, 10, 20});
//        System.out.println(Formatter.arrayToString(Arrays.stream(a.getModifiers()).boxed().toArray(Integer[]::new)));
        System.out.println(p.toString());
    }
}
