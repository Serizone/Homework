package ru.otus.java.homework;

public class Main {
    public void main(String[] args) {
        PhoneBook myBook = new PhoneBook();
        myBook.add("8-800-555-35-35", "Vova");
        myBook.add("8-555-222-11-66", "Vlad");
        myBook.add("8-000-000-00-00", "Anatoliy");
        myBook.add("8-498-498-49-84", "Vova");
        myBook.add("8-765-432-10-98", "Nastya");
        myBook.add("8-765-432-10-98", "Dima");
        myBook.find("Vova");
        myBook.containsPhoneNumber("8-000-000-00-00");
        myBook.containsPhoneNumber("8-765-432-10-98");
        myBook.containsPhoneNumber("6-111-444-02-32");
    }
}
