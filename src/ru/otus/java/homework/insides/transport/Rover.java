package ru.otus.java.homework.insides.transport;

public class Rover implements Transport{
    private int speed = 35;
    private int maxFuel = 90;
    private int fuel = maxFuel;

    public Rover() {};
    public Rover(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
        maxFuel = fuel;
    }

    public boolean move(Road road, int km) {
        if (speed * fuel < km){
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
