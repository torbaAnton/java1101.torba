package torba.java1101.homework1.task16;

import java.util.Scanner;

public class task16 {
    //Дано значение температуры в градусах Цельсия. Вывести температуру  в градусах Фаренгейта.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах Цельсия: ");
        double temperatureC = scan.nextDouble();
        double temperatureF = temperatureC*9/5+32;
        System.out.println("Температура в градусах Фаренгейта: "+temperatureF);
    }
}
