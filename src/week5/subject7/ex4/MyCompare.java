package week5.subject7.ex4;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }
}
