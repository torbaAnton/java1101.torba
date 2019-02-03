package torba.java1101.homework1.task5;

import java.util.Scanner;

public class task5 {
    //Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш вес");
        double weight = scan.nextDouble();
        double weightOnMoon=weight*0.17;
        //0.17 = 17% притяжение на Луне от земного
        System.out.println("Ваш вес на Луне равен: "+weightOnMoon);
    }
}
