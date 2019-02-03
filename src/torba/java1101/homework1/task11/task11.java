package torba.java1101.homework1.task11;

import java.util.Scanner;

public class task11 {
    //Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
