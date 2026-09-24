package ru.otus.java.homework.insides.transport;

public class Horse implements Transport{
    private int speed = 15;
    private int maxFood = 30;
    private int food = maxFood;

    public Horse() {};
    public Horse(int speed, int fuel) {
        this.speed = speed;
        food = fuel;
        maxFood = fuel;
    }

    public boolean move(Road road, int km) {
        if (road == Road.SWAMP) {
            return false;
        } else if (speed * food < km){
            food = 0;
            return false;
        }
        food -= km / speed;
        return true;
    }

    public void eat() {
        food = maxFood;
    }
}
