package ru.otus.java.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.randomNums();
        tree.printList();
        tree.getSortedList();
        tree.printList();
        tree.makeTree();
        Scanner scan = new Scanner(System.in);
        tree.find(scan.nextInt());
    }
}
