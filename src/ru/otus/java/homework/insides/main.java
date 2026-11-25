package ru.otus.java.homework.insides;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File folder = new File("src/ru/otus/java/homework");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
        //Чтение файла
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите файл");
        String chosenFile = scan.nextLine();
        File myFile = new File("src/ru/otus/java/homework/" + chosenFile);
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(myFile))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Запись в файл
        System.out.println("\nНапишите что-то");
        String sentence = scan.nextLine();
        try {
            FileWriter writer = new FileWriter(myFile, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("\n" + sentence);
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
