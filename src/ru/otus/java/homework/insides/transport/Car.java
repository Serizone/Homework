package ru.otus.java.homework.insides.transport;

public class Car implements Transport {
    private int speed = 50;
    private int maxFuel = 100;
    private int fuel = maxFuel;

    public Car() {};
    public Car(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
        maxFuel = fuel;
    }

    public boolean move(Road road, int km) {
        if (road != Road.PLAIN) {return false;}
        else if (speed * fuel < km){
            fuel = 0;
            return false;
        }
        fuel -= km / speed;
        return true;
    }

    public void refill() {
        fuel = maxFuel;
    }

}
