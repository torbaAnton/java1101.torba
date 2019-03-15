package torba.java1101.homework4.ArrayList;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String>actors = new ArrayList<String>();
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
        actors.set(3, "Jennifer Lawrence");
        System.out.println(actors);
        actors.clear();
        System.out.println(actors);
    }
}
