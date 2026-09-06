package ru.otus.java.homework;

import java.util.Scanner;

public class Main {
    User[] people = {
            new User(),
            new User("Anya", "Suvorova", "Petrovna", 1950, "-"),
            new User("Tasha", "Hrychova", "Arkadievna", 2014, "-"),
            new User("Vitaliy", "Novikov", "Matveevich", 2000, "mymail@mail"),
            new User("Alexandra", "Glacier", "-", 1989, "glacier@mail"),
            new User("Pavel", "Ormund", "Valentinov", 1970, "ojormund70@mail"),
            new User("Arkadiy", "Hrychov", "Arkadievna", 1984, "thml14@mail"),
            new User("Ruslan", "Rublev", "Pavlov", 1969, "xalsoef@mail"),
            new User("Dora", "Bistrova", "-", 1999, "fastest@mail"),
            new User("Clarisse", "Klachova", "Timotheevna", 2002, "Cl2002se@mail"),
    };

    void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (2026 - people[i].getBirthYear() > 40) {
                people[i].userInfo();
            }
        }
        System.out.println("---------");
        Box myBox = new Box();
        myBox.boxInfo();
        System.out.println("---------");
        myBox.setColor("Красный");
        myBox.putItem("Шарик");
        myBox.close();
        myBox.boxInfo();
    }
}
