package ru.otus.java.homework;

public class Main {
    public static class fillArray implements Runnable {
        @Override
        public void run() {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[100000000];
        Thread t = new Thread(() -> {
            for (int i = 0; i < array.length; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        System.out.println("Один поток");
        long start = System.nanoTime();
        t.start();
        t.join();
        long duration = System.nanoTime() - start;
        System.out.printf("Время: %.1f", duration / 1_000_000_000.0);
        System.out.print(" сек\n");

        double[] fasterArray = new double[100000000];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < fasterArray.length / 4; i++) {
                fasterArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = fasterArray.length / 4; i < fasterArray.length / 2; i++) {
                fasterArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = fasterArray.length / 2; i < fasterArray.length / 4 * 3; i++) {
                fasterArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = fasterArray.length / 4 * 3; i < fasterArray.length; i++) {
                fasterArray[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        System.out.println("Четыре потока");
        start = System.nanoTime();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        duration = System.nanoTime() - start;
        System.out.printf("Время: %.1f", duration / 1_000_000_000.0);
        System.out.print(" сек");
    }
}
