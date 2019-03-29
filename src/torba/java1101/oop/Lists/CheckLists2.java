package torba.java1101.oop.Lists;

import java.util.LinkedList;
import java.util.List;

public class CheckLists2 {
    public static void main(String[] args) {
        List<Integer> list2 = new LinkedList();

        long start2 = System.currentTimeMillis();

        for(int i =0; i< 1000000; i++){
            list2.add(i);
        }
        list2.add(500001,3008);
        long end2 = System.currentTimeMillis();
        long result2 = end2-start2;
        System.out.println("Time for adding 1 million integer elements " + result2);
    }
}
