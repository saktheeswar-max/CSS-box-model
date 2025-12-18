package nov27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collective {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList : ");
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------");

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println("LinkedList : ");
        System.out.println(ll);

        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------------------");

        long startTime = System.currentTimeMillis();
        ArrayList<Integer> test1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            test1.add(i);
        }
        System.out.println("Time taken by ArrayList: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        LinkedList<Integer> test2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            test2.add(i);
        }
        System.out.println("Time taken by LinkedList: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
