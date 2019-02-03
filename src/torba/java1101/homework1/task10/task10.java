package torba.java1101.homework1.task10;

import java.util.Scanner;

public class task10 {
    //Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.(*)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.println("Ваше имя: "+name);
    }
}
