package ru.otus.java.homework;
import java.util.Scanner;

public class Main {
    //Проверяет является ли массив 4X4
    public boolean matrixCheck(String[][] mat) {
        if(mat.length != 4) {return false;}
        else {
            for(int i = 0; i < 4; i++) {
                if(mat[i].length != 4) {return false;}
            }
        }
        return true;
    }

    public int sumArray(String[][] array) {
        int sum = 0;
        if(!(matrixCheck(array))) {throw new AppArraySizeException("Массив не правильного размера");}
        else {
            try {
                for(int i = 0; i < 16; i++) {
                    sum += Integer.parseInt(array[i/4][i%4]);
                }
            } catch (NumberFormatException e) {
                throw new AppArrayDataException("В массиве обнаружено не целое число: ", e.getMessage());
            }
        }
        return sum;
    }

    void main(String[] args) {
        String[][] a = {
                {"1", "2", "3" , "4"},
                {"1", "0", "-3", "225"},
                {"16", "25", "31", "1625"},
                {"-1", "0", "0", "5"}
        };
        String[][] b = {
               {"1", "2", "3" , "4"},
               {"1", "0", "-3"},
               {"16", "25", "31"},
               {"-1", "0", "0"}
        };
        String[][] c = {
               {"1", "2", "3" , "a"},
               {"1", "0", "b", "225"},
               {"16", "c", "31", "1625"},
               {"d", "0", "0", "5"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант теста:");
        System.out.println("1)Рабочий");
        System.out.println("2)Неверный размер массива");
        System.out.println("3)Неверный формат");
        int test = scanner.nextInt();
        switch(test) {
            case(1):
                System.out.println(sumArray(a));
                break;
            case(2):
                System.out.println(sumArray(b));
                break;
            case(3):
                System.out.println(sumArray(c));
                break;
            default:
                System.out.println("Non applicable");
                break;
        }
    }
}
