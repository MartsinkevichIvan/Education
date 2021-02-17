package Fundamental.MainTask;

/* 4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.*/

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество вводимых чисел:");
        int countOfNumbers = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < countOfNumbers; i++) {
            int currentNumber = scanner.nextInt();
            sum += currentNumber;
        }
        System.out.println("Сумма чисел равна = " + sum);
    }
}
