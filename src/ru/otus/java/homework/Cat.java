package ru.otus.java.homework;

public class Cat extends Animal{
    public Cat() {
        this.name = "Josh";
        this.runSpeed = 5;
        this.swimSpeed = 0;
        this.maxStamina = 80;
        this.stamina = 80;
    }

    public Cat(String name, int runSpeed, int maxStamina, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = 0;
        this.maxStamina = maxStamina;
        this.stamina = stamina;
    }

    @Override
    public float swim(int distance) {
        System.out.println("Кошки не умеют плавать!");
        return -1;
    }

    @Override
    public float run(int distance) {
        if (this.stamina - distance >= 0) {
            this.stamina -= distance;
            return (float) distance / this.runSpeed;
        } else {
            this.stamina = 0;
            System.out.println(this.name + " устал!");
            return -1;
        }
    }
}
