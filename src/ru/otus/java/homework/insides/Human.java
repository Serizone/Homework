package ru.otus.java.homework.insides;

import ru.otus.java.homework.insides.transport.Road;
import ru.otus.java.homework.insides.transport.Transport;

public class Human{
    private String name = "Bob";
    private Transport currentTransport = null;
    private int speed = 5;
    private int endurance = 5;

    public Human() {};
    public Human(String name, int speed, int endurance) {
        this.name = name;
        this.speed = speed;
        this.endurance = endurance;
    }

    public void getIn(Transport vehicle) {currentTransport = vehicle;}
    public void getOut() {currentTransport = null;}

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public boolean move(Road road, int km) {
        return km <= speed * endurance;
    }
}
