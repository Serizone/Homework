package ru.otus.java.homework.insides.transport;

public class Bike implements Transport{
    private int speed = 10;

    public Bike() {};
    public Bike(int speed, int fuel) {this.speed = speed;}

    public boolean move(Road road, int km) {
        return road != Road.SWAMP;
    }
}
