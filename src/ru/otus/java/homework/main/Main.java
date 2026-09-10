package ru.otus.java.homework.main;

import ru.otus.java.homework.Animal;
import ru.otus.java.homework.Cat;
import ru.otus.java.homework.Dog;
import ru.otus.java.homework.Horse;
import java.util.Scanner;

public class Main {
    void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal horse = new Horse();
        cat.Info();
        dog.Info();
        horse.Info();
        System.out.println("Бег 50 метров");
        System.out.println(cat.getName() + " " +  cat.run(50) + " секунд");
        System.out.println(dog.getName() + " " +  dog.run(50) + " секунд");
        System.out.println(horse.getName() + " " +  horse.run(50) + " секунд");
        System.out.println("-------");
        cat.Info();
        dog.Info();
        horse.Info();
        System.out.println("Плавание 30 метров");
        System.out.println(cat.getName() + " " + cat.swim(30) + " секунд");
        System.out.println(dog.getName() + " " + dog.swim(30) + " секунд");
        System.out.println(horse.getName() + " " + horse.swim(30) + " секунд");
        System.out.println("-------");
        cat.Info();
        dog.Info();
        horse.Info();
    }
}
