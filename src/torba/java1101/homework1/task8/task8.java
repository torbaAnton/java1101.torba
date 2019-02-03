package torba.java1101.homework1.task8;

import java.util.Scanner;

public class task8 {
    //Напишите программу которая определяет число четное или не четное
    public static void main(String[] args) {
        int b=2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        if(a%b==0){
            System.out.println("Введенное число четное");
        }else {
            System.out.println("Введенное число нечетное");
        }
    }
}
