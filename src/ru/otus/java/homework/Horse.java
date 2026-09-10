package ru.otus.java.homework;

public class Horse extends Animal{
    public Horse() {
        this.name = "Daisy";
        this.runSpeed = 8;
        this.swimSpeed = 1;
        this.maxStamina = 150;
        this.stamina = 150;
    }

    public Horse(String name, int runSpeed, int swimSpeed, int maxStamina, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.maxStamina = maxStamina;
        this.stamina = stamina;
    }

    @Override
    public float swim(int distance) {
        if (this.stamina - distance * 2 >= 0) {
            this.stamina -= distance * 2;
            return (float) distance / this.swimSpeed;
        } else {
            this.stamina = 0;
            System.out.println(this.name + " устал!");
            return -1;
        }
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
