package ru.otus.java.homework;

public class User {
    private String name;
    private String surname;
    private String middleName;
    private int birthYear;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
        this.name = "Ivan";
        this.surname = "Ivanov";
        this.middleName = "Ivanovich";
        this.birthYear = 2000;
        this.email = "Ivanov00@mail.com";
    }

    public User(String name, String surname, String middleName, int birthYear, String email) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void Info() {
        System.out.println("ФИО: " + getName() + " " + getSurname() + " " + getMiddleName());
        System.out.println("Год рождения: " + getBirthYear());
        System.out.println("e-mail: " + getEmail());
    }
}
