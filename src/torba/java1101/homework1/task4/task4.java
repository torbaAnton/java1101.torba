package torba.java1101.homework1.task4;

import java.util.Scanner;

public class task4 {
    /*В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
    public static void main(String[] args) {
        System.out.println("Введите натуральное трехзначное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 100 && n <= 999) {
            int sum=n/100+(n%100)/10+n%10;
            System.out.println("Сумма цифр трехзначного числа: "+sum);
        }else{
            System.out.println("Вы ввели не натуральное или не трехзначное число, попробуйте еще раз");
        }
    }
}
