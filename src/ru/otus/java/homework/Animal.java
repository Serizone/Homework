package ru.otus.java.homework;

public abstract class Animal {
    String name;
    int runSpeed;
    int swimSpeed;
    int maxStamina;
    int stamina;

    public void Info() {
        System.out.println("Имя: " + this.name);
        System.out.println("Скорость бега: " + this.runSpeed + "м/с");
        System.out.println("Скорость плавания: " + this.swimSpeed + "м/с");
        System.out.println("Выносливость: " + this.stamina + "/" + this.maxStamina);
    }

    public abstract float swim(int distance);
    public abstract float run(int distance);

    public void sleep() {
        this.stamina = this.maxStamina;
        System.out.println(this.name + "полностью востановился!");
    };

    public String getName() {
        return this.name;
    }
}
