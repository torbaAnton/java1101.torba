package torba.java1101.homework1.task1;
import java.util.Scanner;
public class task1 {
    /*В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.*/
    public static void main(String[] args) {

        int division;
        int exactDivision;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число33: ");
        int q = scan.nextInt();
        System.out.println("Введите второе число: ");
        int w = scan.nextInt();
        exactDivision = q / w;
        division = q % w;
        System.out.println("Ваш ответ: " + exactDivision + " и остаток: " + division);
    }
}
