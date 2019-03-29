package torba.java1101.oop.anotheruniverse.marvel;

import torba.java1101.oop.anotheruniverse.SuperHero;
import torba.java1101.oop.anotheruniverse.SuperPower;

public class Wolverine extends SuperHero implements SuperPower  {
@Override
public void fightWithVillain(){
    System.out.println("And i kill that badasses");
}
    @Override
    public void sayWhatIsYourSuperPower() {
        System.out.println("I can survive");
    }

    @Override
    public void useSuperPower() {
        System.out.println("I use this shit");
    }
}
