package ru.otus.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете метод для исполнения");
        int method = scanner.nextInt();
        if (method == 1) {
            System.out.println(sumOfPositiveElements(generateMatrix()));
        } else if (method == 2) {
            square((int) (Math.random() * 10) + 1);
        } else if (method == 3) {
            int[][] xMatrix = generateMatrix();
            nullDiagonal(xMatrix);
            for (int i = 0; i < xMatrix.length; i++) {
                for (int k = 0; k < xMatrix[i].length; k++) {
                    if (xMatrix[i][k] >= 0) {
                        System.out.printf(" %d ", xMatrix[i][k]);
                    } else System.out.printf("%d ", xMatrix[i][k]);
                }
                System.out.print("\n");
            }
        } else if (method == 4) {
            System.out.println(findMax(generateMatrix()));
        } else if (method == 5) {
            System.out.println(sumSecondLine(generateMatrix()));
        } else System.out.println("Non applicable");
    }

    static int sumOfPositiveElements(int[][] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length; k++) {
             if (nums[i][k] > 0) result += nums[i][k];
            }
        }
        return result;
    }

    static void square(int size) {
        char[][] result = new char[size][size];
        Arrays.fill(result[0], '*');
        Arrays.fill(result[result.length - 1], '*');
        for (int i = 1; i < result.length - 1; i++) {
            result[i][0] = '*';
            Arrays.fill(result[i], 1, result.length - 1, ' ');
            result[i][result.length - 1] = '*';
        }
        for (char[] chars : result) {
            System.out.println(chars);
        }
    }

    static void nullDiagonal(int[][] nums) {
        //Main Diagonal
        for (int i = 0; i < Math.min(nums.length, nums[0].length); i++) {
            nums[i][i] = 0;
        }
        //Sub Diagonal
        for (int i = 0; i < Math.min(nums.length, nums[0].length); i++) {
            nums[i][nums[i].length - 1 - i] = 0;
        }
    }

    static int findMax(int[][] nums) {
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length; k++) {
                if (nums[i][k] > maxNum) maxNum = nums[i][k];
            }
        }
        return maxNum;
    }

    static int sumSecondLine(int[][] nums) {
        int sum = -1;
        if (nums.length >= 2) {
            sum += 1;
            for (int i = 0; i < nums[1].length; i++) {
                sum += nums[1][i];
            }
        }
        return sum;
    }

    static int[][] generateMatrix() {
        int[][] matrix = new int[(int) (Math.random() * 10) + 1][(int) (Math.random() * 10) + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = (int) (Math.random() * 19) - 9;
            }
        }
        return matrix;
    }

}
