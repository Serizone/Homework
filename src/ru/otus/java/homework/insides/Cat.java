package ru.otus.java.homework.insides;

public class Cat {
    private String name = "Bob";
    private int appetite = 5;
    private boolean satiated = false;

    public Cat() {}

    public String getName() {return name;}
    public int getAppetite() {return appetite;}

    public void isSatiated() {
        if (satiated) {
            System.out.print("Кот сыт\n");
        } else {
            System.out.print("Кот голоден\n");
        }
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate dish) {
        if (dish.eatFood(appetite)) {
            satiated = true;
        } else {
            System.out.println("Кот остался голодным");
            satiated = false;
        }
    }
}
