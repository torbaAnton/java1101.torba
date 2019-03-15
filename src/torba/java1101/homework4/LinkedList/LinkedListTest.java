package torba.java1101.homework4.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String>actors = new LinkedList<String>();
        actors.add("Johnny Depp");
        actors.add("Brad Pitt");
        actors.add("Tom Cruise");
        actors.add("Jennifer Lawrence");
        actors.add("Henry Cavill");
        actors.add("Chris Hemsworth");
        actors.add("Bradley Cooper");
        System.out.println(actors);
        actors.remove(3);
        System.out.println(actors);
        System.out.println(actors.get(3));
        if(actors.contains("Tom Cruise")){
            actors.remove("Tom Cruise");
        }
        System.out.println(actors);
        actors.clear();
        System.out.println(actors);
    }
}
