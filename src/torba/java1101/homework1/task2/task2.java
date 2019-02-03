package torba.java1101.homework1.task2;

import java.util.Scanner;

public class task2 {
    /*В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
    public static void main(String[] args) {
        System.out.println("Введите натуральное двузначное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n>=10&&n<=99){
            int sum=n/10+(n%10);
            System.out.println("Сумма цифр двузначного числа: "+sum);
        }else{
            System.out.println("Вы ввели не натуральное или не двузначное число, попробуйте еще раз");
        }
    }
}
