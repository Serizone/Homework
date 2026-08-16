package ru.otus.java.homework.one;

import java.util.Scanner;

public class homework_1 {
    static void main(String[] args) {
        System.out.println("Введите число от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int method = scanner.nextInt();
        if (method == 1) {
            greetings();
        } else if (method == 2) {
            int a = (int) (100 * Math.random() - 50);
            int b = (int) (100 * Math.random() - 50);
            int c = (int) (100 * Math.random() - 50);
            checkSign(a, b, c);
        } else if (method == 3) {
            selectColor();
        } else if (method == 4) {
            comperNumbers();
        } else if (method == 5) {
            int initValue = (int) (100 * Math.random() - 50);
            int delta = (int) (100 * Math.random() - 50);
            boolean increment = !(Math.random() <= 0.5);
            addOrSubtractAndPrint(initValue, delta, increment);
        } else {
            System.out.println("Non applicable");
        }
    }

    static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма Положительна");
        } else {
            System.out.println("Сумма Отриацательна");
        }
    }

    static void selectColor() {
        int data = (int) (30 * Math.random() + 1);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    static void comperNumbers() {
        int a = (int) (100 * Math.random() + 1);
        int b = (int) (100 * Math.random() + 1);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println(result);
    }
}
