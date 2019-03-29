package torba.java1101.oop.Lists;

import java.util.ArrayList;
import java.util.List;

public class CheckLists  {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList();

            long start = System.currentTimeMillis();

            for(int i =0; i< 1000000; i++){
                list.add(i);
            }
            list.add(500001,3008);
            long end = System.currentTimeMillis();
            long result = end-start;
            System.out.println("Time for adding 1 million integer elements " + result);
        }

        //Time for adding 1 million integer elements 205
        //Time for adding 1 million integer elements 30


    }