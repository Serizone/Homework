package ru.otus.java.homework;

import ru.otus.java.homework.insides.Cat;
import ru.otus.java.homework.insides.Plate;

public class Main {
    Cat[] cats = {
            new Cat(),
            new Cat("Alex", 15),
            new Cat("Boot", 3),
            new Cat("Fluff", 8),
            new Cat("Garfield", 25),
            new Cat("Grumpy", 10),
            new Cat("Oswald", 9),
            new Cat("Big boy", 1),
    };

    Plate dish = new Plate(50);

    void main() {
        for (Cat cat : cats) {
            cat.eat(dish);
        }
        System.out.println("--------------");
        for (Cat cat : cats) {
            System.out.print(cat.getName() + ": ");
            cat.isSatiated();
        }
    }
}
