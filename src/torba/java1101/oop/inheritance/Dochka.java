package torba.java1101.oop.inheritance;

public class Dochka extends babka {

    static {
        System.out.println("Hello this is static from Dochka");
    }

    {
        System.out.println("Hello this is non-static 1 from Dochka");
    }

    {
        System.out.println("Hello this is non-static 2  from Dochka");
    }

    public Dochka() {
        System.out.println("This is Dochka constructor");
    }
}
