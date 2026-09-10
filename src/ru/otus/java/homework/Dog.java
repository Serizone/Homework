package ru.otus.java.homework;

public class Dog extends Animal {

    public Dog() {
        this.name = "Bob";
        this.runSpeed = 5;
        this.swimSpeed = 2;
        this.maxStamina = 100;
        this.stamina = 100;
    }

    public Dog(String name, int runSpeed, int swimSpeed, int maxStamina, int stamina) {
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
