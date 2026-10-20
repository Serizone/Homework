package ru.otus.java.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
    private String name;
    private int age;

    public Employee() {
        name = "Ivan";
        age = 30;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
