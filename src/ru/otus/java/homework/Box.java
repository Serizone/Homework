package ru.otus.java.homework;

public class Box {
    private int size;
    private String color;
    private boolean open;
    private String item;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка перекрашена");
    }

    public boolean isOpen() {
        return open;
    }

    public void open() {
        this.open = true;
        System.out.println("Коробка открыта");
    }

    public void close() {
        this.open = false;
        System.out.println("Коробка закрыта");
    }

    public String getItem() {
        return item;
    }

    public void putItem(String item) {
        if (!isOpen()) {System.out.println("Коробка закрыта");}
        else if (this.item != null) {System.out.println("В коробке уже лежит " + this.item);}
        else {this.item = item; System.out.println("В коробке положили " + item);}
    }

    public void takeItem() {
        if (!isOpen()) {System.out.println("Коробка закрыта");}
        else if (item == null) {System.out.println("Коробка пуста");}
        else {System.out.println("Из коробки убрали " + this.item); this.item = null;}
    }

    public void Info() {
        System.out.println("Размер: " + getSize() + " единиц кубических");
        System.out.println("Цвет: " + getColor());
        System.out.print("Коробка ");
        if (isOpen()) {System.out.print("открыта\n");}
        else {System.out.print("закрыта\n");}
        if (getItem() != null) {System.out.println("В коробке лежит " + getItem());}
        else {System.out.println("Коробка пуста");}
    }

    public Box() {
        size = 10;
        color = "Чёрный";
        open = true;
        item = null;
    }

    public Box(int size, String color, boolean open) {
        this.size = size;
        this.color = color;
        this.open = open;
        item = null;
    }
}
