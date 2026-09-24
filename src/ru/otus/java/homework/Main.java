package ru.otus.java.homework;

import ru.otus.java.homework.insides.Human;
import ru.otus.java.homework.insides.transport.*;

public class Main {
    static void main(String[] args) {
        Human bob = new Human();
        Transport car = new Car();
        Transport bike = new Bike();
        Transport rover = new Rover();
        Transport horse = new Horse();

        try {
            System.out.println(bob.getCurrentTransport().move(Road.PLAIN, 10));
        } catch (NullPointerException e) {
            System.out.println(bob.move(Road.PLAIN, 10));
        }

        bob.getIn(car);
        try {
            System.out.println(bob.getCurrentTransport().move(Road.SWAMP, 50));
        } catch (NullPointerException e) {
            System.out.println(bob.move(Road.SWAMP, 50));
        }

        bob.getOut();
        bob.getIn(rover);
        try {
            System.out.println(bob.getCurrentTransport().move(Road.SWAMP, 50));
        } catch (NullPointerException e) {
            System.out.println(bob.move(Road.SWAMP, 50));
        }
    }
}
