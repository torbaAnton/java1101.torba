package torba.java1101.oop.inheritance;

public class babka {
    static {
        System.out.println("Hello this is static from babka");
    }

    {
        System.out.println("Hello this is non-static 1 from babka");
    }

    {
        System.out.println("Hello this is non-static 2  from babka");
    }

    public babka() {
        System.out.println("This is babka constructor");
    }
}
