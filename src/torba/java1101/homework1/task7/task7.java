package torba.java1101.homework1.task7;

import java.util.Scanner;

public class task7 {
    /*Напишите программу которая определяет какое из чисел больше*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();
        if (a>b){
            System.out.println("Большее число: "+a);
        }else if(b>a){
            System.out.println("Большее число: "+b);
        }else{
            System.out.println("Числа равны");
        }
    }
}
