package ru.otus.java.homework;

import java.util.Scanner;

public class Homework2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете метод для исполнения");
        int method = scanner.nextInt();
        if (method == 1) {
            String line = "Спасибо за выбор";
            int times = (int) (Math.random() * 10 + 1);
            printAgain(line, times);
        } else if (method == 2) {
            int listLength = (int) (Math.random() * 10 + 1);
            int[] numbers = new int[listLength];
            for (int i = 0; i < listLength; i++) {
                numbers[i] = (int) (Math.random() * 10 + 1);
            }
            addMassive(numbers);
        } else if (method == 3) {
            int listLength = (int) (Math.random() * 10 + 1);
            int[] numbers = new int[listLength];
            int theNumber = (int) (Math.random() * 10 + 1);
            fillMassive(theNumber, numbers);
            System.out.print("{");
            for (int i = 0; i < listLength - 1; i++) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.println(numbers[listLength - 1] + "}");
        } else if (method == 4) {
            int listLength = (int) (Math.random() * 10 + 1);
            int[] numbers = new int[listLength];
            int theNumber = (int) (Math.random() * 10 + 1);
            for (int i = 0; i < listLength; i++) {
                numbers[i] = (int) (Math.random() * 10 + 1);
            }
            System.out.print("До: {");
            for (int i = 0; i < listLength - 1; i++) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.print(numbers[listLength - 1] + "}\n");
            upgradeMassive(theNumber, numbers);
            System.out.print("После: {");
            for (int i = 0; i < listLength - 1; i++) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.print(numbers[listLength - 1] + "}");
        } else if (method == 5) {
            int listLength = (int) (Math.random() * 10 + 1);
            int[] numbers = new int[listLength];
            for (int i = 0; i < listLength; i++) {
                numbers[i] = (int) (Math.random() * 10 + 1);
            }
            compareHalves(numbers);
        } else System.out.println("Non applicable");
    }

    static void printAgain(String line, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(line);
        }
    }

    static void addMassive(int[] theNums) {
        int ans = 0;
        for (int theNum : theNums) {
            if (theNum > 5) {
                ans += theNum;
            }
        }
        System.out.println(ans);
    }

    static void fillMassive(int num, int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = num;
        }
    }

    static void upgradeMassive(int num, int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] += num;
        }
    }

    static void compareHalves(int[] list) {
       int lowerHalf = 0;
       int upperHalf = 0;
       for (int i = 0; i < list.length / 2; i++) {
           lowerHalf += list[i];
           upperHalf += list[list.length - i - 1];
       }
       if (upperHalf >= lowerHalf) System.out.println(upperHalf);
       else System.out.println(lowerHalf);
    }
}