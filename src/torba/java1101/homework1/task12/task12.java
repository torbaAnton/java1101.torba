package torba.java1101.homework1.task12;

import java.util.Scanner;

public class task12 {
    //Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T). Вычислить скорость (км/ч), с которой нужно ехать.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите расстояние до места назначения(в километрах): ");
        float distance = scan.nextFloat();
        System.out.println("Введите время за которое нужно доехать(в часах): ");
        float time = scan.nextFloat();
        float speed = distance/time;
        System.out.println("Нужно ехать со скоростью: "+speed+"(км/ч)");
    }
}
