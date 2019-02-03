package torba.java1101.homework1.task3;

import java.util.Scanner;

public class task3 {
    //В переменной n хранится вещественное число с ненулевой дробной частью.
    // Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вещественное число с ненулевой дробной частью: ");
        float n = scan.nextFloat();
        int x = (int)(n +0.5);
        System.out.println("Число "+n+" округлили до "+x);
    }
}
