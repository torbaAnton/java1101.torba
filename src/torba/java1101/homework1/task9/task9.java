package torba.java1101.homework1.task9;

import java.util.Scanner;

public class task9 {
    //Сделайте программу, которая будет проверять является ли число типа double целым.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число типа double: ");
        double n = scan.nextDouble();
        if(n%1 == 0){
            System.out.println("Число "+n+" целое");
        }else{
            System.out.println("Число "+n+" не целое");
        }
    }
}
