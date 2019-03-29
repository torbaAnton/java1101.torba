package torba.java1101.oop.inheritance;

public class Vnuchka extends Dochka {

    static {
        System.out.println("Hello this is static from Vnuchka");
    }

    {
        System.out.println("Hello this is non-static 1 from Vnuchka");
    }

    {
        System.out.println("Hello this is non-static 2  from Vnuchka");
    }

    public Vnuchka() {
        System.out.println("This is Vnuchka constructor");
    }
}