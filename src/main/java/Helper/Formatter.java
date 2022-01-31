package Helper;

public class Formatter {
    public static <T> String arrayToString(T[] a){
        String s = "";
        for (T item: a) {
            s+= item.toString() + "\n";
        }
        return s;
    }
}
