package Helper;

import java.lang.reflect.Array;

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
}
