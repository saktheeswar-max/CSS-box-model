package nov27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Apple");
        set1.add("Date");
        set1.add("Banana");

        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(10);
        set2.add(5);
        set2.add(20);
        set2.add(15);
        set2.add(25);

        System.out.println(set2);

        TreeSet<Character> set3 = new TreeSet<>();
        set3.add('Z');
        set3.add('A');
        set3.add('M');
        set3.add('B');
        set3.add('C');

        System.out.println(set3);
    }
}
