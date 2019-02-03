package torba.java1101.homework1.task15;
import java.util.Scanner;

import static java.lang.Math.*;
public class task15 {
    //Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первый катет: ");
        double side1 = scan.nextDouble();
        System.out.println("Введите второй катет: ");
        double side2 = scan.nextDouble();
        double S=0.5*side1*side2;
double hypotenuse = sqrt((side1*side1)+(side2*side2));
double p = side1+side2+hypotenuse;
        System.out.println("Площадь треугольника равна: "+S+" Гипотенуза равна: "+hypotenuse+" Периметр равен: "+p);
    }
}
