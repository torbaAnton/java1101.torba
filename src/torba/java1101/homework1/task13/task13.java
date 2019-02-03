package torba.java1101.homework1.task13;

import java.util.Scanner;

public class task13 {
    //Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
    public static void main(String[] args) {
        int hours=24;
        int minutes=hours*60;
        int seconds=minutes*60;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество суток: ");
        int amountOfDays = scan.nextInt();
            System.out.println("Количество часов: "+hours*amountOfDays+" Количество минут: "+minutes*amountOfDays+" Количество секунд: "+ seconds*amountOfDays);

    }
}
