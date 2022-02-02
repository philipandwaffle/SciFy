package Helper;

import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class Format {
    public static <T> String arrayToString(T[] a){
        String s = "";
        for (T item: a) {
            s+= item.toString() + "\n";
        }
        return s;
    }

    public static <E extends Enum<E>> String[] toStringArray(Class<E> eClass){
        String[] res = new String[eClass.getEnumConstants().length];
        for (int i = 0; i <eClass.getEnumConstants().length; i++) {
            res[i] = eClass.getEnumConstants()[i].name();
        }
        return res;
    }

    public static String toDisplayTable(List<String[]> data){
        String res = "";

        int max = 0;
        for (String[] col:data) {
            int curMax = Stream.of(col).map(String::length).max(Integer::compareTo).get();
            max = curMax > max ? curMax : max;
        }



        return res;
    }

    private static String centreText(String ){

    }
}
