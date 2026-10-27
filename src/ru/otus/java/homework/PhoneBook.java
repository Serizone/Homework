package ru.otus.java.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> book;

    public PhoneBook() {
         book = new HashMap<>();
    }

    public void add(String phone, String name) {
        if (!(book.containsKey(name))) {
            ArrayList<String> keys = new ArrayList<>();
            keys.add(phone);
            book.put(name, keys);
        }else {
            book.get(name).add(phone);
        }

    }

    public void find(String name) {
        System.out.println(book.get(name));
    }

    public void containsPhoneNumber(String phone) {
        Set<String> keys = book.keySet();
        Iterator<String> iter = keys.iterator();
        boolean found = false;
        while (iter.hasNext()) {
            String s = iter.next();
            if (book.get(s).contains(phone)) {
                System.out.println("Телефон найден: " + s);
                found = true;
            }
        }
        if (!(found)) {System.out.println("Телефон не найден");}
    }
}
