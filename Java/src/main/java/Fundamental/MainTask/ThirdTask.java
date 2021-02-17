package Fundamental.MainTask;

/*3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку*/

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfRandomNumbers = scanner.nextInt();
        int[] NumbersList = new int[countOfRandomNumbers];
        for (int i = 0; i < countOfRandomNumbers; i++) {
            NumbersList[i] = 0 + (int) (Math.random() * 500);
        }
        for (int i = 0; i < NumbersList.length; i++) {
            System.out.println(NumbersList[i]);
        }
        for (int i = 0; i < NumbersList.length; i++) {
            System.out.print(NumbersList[i] + " ");
        }
    }
}
