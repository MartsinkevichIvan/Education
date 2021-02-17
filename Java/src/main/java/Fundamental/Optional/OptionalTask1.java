package Fundamental.Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество вводимых чисел: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        System.out.println("Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        System.out.printf("Самое длинное число: %d. Его длина = %d. \n", findLongestNumber(numbers), String.valueOf(findLongestNumber(numbers)).length());
        System.out.printf("Самое короткое число: %d. Его длина = %d \n", findShortestNumber(numbers), String.valueOf(findShortestNumber(numbers)).length());
        // 2. Вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.print("Числа в порядке возрастания значений их длины: ");
        System.out.println(Arrays.toString(sortArrayByNumbersLength(numbers)));
        // 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        System.out.print("Числа, длина которых больше средней длины по всем числам, а также длину: ");
        System.out.println(getArrayNumbersLongerAverage(numbers));
        System.out.println("Средняя длина чисел = " + getAverageLengthOfNumbers(numbers));
    }

    public static int findLongestNumber(int[] array) {
        int longestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).length() > String.valueOf(longestNumber).length()) {
                longestNumber = array[i];
            }
        }
        return longestNumber;
    }

    public static int findShortestNumber(int[] array) {
        int shortestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).length() < String.valueOf(shortestNumber).length()) {
                shortestNumber = array[i];
            }
        }
        return shortestNumber;
    }

    public static int[] sortArrayByNumbersLength(int[] array) {
        int[] newArray = array.clone();
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (String.valueOf(newArray[j]).length() > String.valueOf(newArray[j + 1]).length()) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
    }

    public static ArrayList<Integer> getArrayNumbersLongerAverage(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        double averageLength = getAverageLengthOfNumbers(array);
        for (int i = 0; i < array.length; i++) {
            if ((double) String.valueOf(array[i]).length() > averageLength) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public static double getAverageLengthOfNumbers(int[] array) {
        int sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfNumbers += String.valueOf(array[i]).length();
        }
        return (double) sumOfNumbers / array.length;
    }
}
