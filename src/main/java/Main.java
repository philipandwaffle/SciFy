import Player.*;
import Helper.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        playerTest();
    }

    private static void menuTest(){
        Menu m = new Menu("Test", new String[] {"Choice 1", "Choice 2", "Choice 3"});
        m.display();
        int c = m.getChoice();
        System.out.println(c);
    }

    private static void playerTest(){
        Attributes a = new Attributes(new int[] {11, 8, 10, 10, 10, 20});
        System.out.println(Formatter.arrayToString(Arrays.stream(a.getModifiers()).boxed().toArray(Integer[]::new)));
    }
}
