package Fundamental.MainTask;

import java.util.Scanner;

/* 1. Приветствовать любого пользователя при вводе его имени через командную строку.*/

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello %s!", scanner.next());
    }
}
