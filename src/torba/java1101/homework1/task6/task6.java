package torba.java1101.homework1.task6;

import java.util.Scanner;

public class task6 {
    //Напишите метод, который будет увеличивать заданный элемент массива на 10%.
    public static void main(String[] args) {
        double []  arr = {4,7,14,19,21};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер элемента: ");
        int n = scan.nextInt();
        arr[n] = arr[n]*0.1+arr[n];
        System.out.println(arr[n]);
    }

}
