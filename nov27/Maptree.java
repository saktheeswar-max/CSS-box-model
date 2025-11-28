
package nov27;

import java.util.Map;
import java.util.TreeMap;

public class Maptree {

    public static void main(String[] args) {

        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(3, "BMW");
        map1.put(1, "Audi");
        map1.put(2, "Mercedes");
        map1.put(1, "Volvo"); 
        System.out.println("Iterating TreeMap...");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        TreeMap<Integer, String> tm = new TreeMap<>();
        System.out.println("Initial list of elements: " + tm);

        tm.put(10, "Apple");
        tm.put(20, "Samsung");
        tm.put(30, "OnePlus");

        System.out.println("After invoking put() method");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        tm.putIfAbsent(40, "Google");
        System.out.println("After invoking putIfAbsent() method");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        TreeMap<Integer, String> newMap = new TreeMap<>();
        newMap.put(50, "Nokia");
        newMap.putAll(tm);

        System.out.println("After invoking putAll() method");
        for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
