package ru.otus.java.homework.insides;

public class Plate {
    private int food = 10;
    private int capacity = 10;

    public Plate() {}

    public Plate(int food) {
        this.food = food;
        this.capacity = food;
    }

    public int getFood() {return food;}
    public int getCapacity() {return capacity;}

    public void putFood(int food) {
        if (this.food + food <= capacity) {
            this.food += food;
        } else System.out.println("На тарелке недостаточно места");
    }

    public boolean eatFood(int food) {
        if (this.food - food >= 0) {
            this.food -= food;
            return true;
        } else {
            System.out.println("На тарелке недостаточно еды");
            return false;
        }
    }

}
