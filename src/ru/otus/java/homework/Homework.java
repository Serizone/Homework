package ru.otus.java.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Homework {
    public void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите метод для выполнения");
        int method = scan.nextInt();
        switch(method) {
            case(1):
                printArray(arrayFill((int) (Math.random() * 10), (int) (Math.random() * 20) + 10));
                break;
            case(2):
               ArrayList<Integer> myArray = new ArrayList<>();
               randomizeArray(myArray);
               printArray(myArray);
               System.out.println("Сумма чисел больше 5: " + arraySumMoreThenFive(myArray));
               break;
            case(3):
                myArray = new ArrayList<>();
                randomizeArray(myArray);
                printArray(myArray);
                replaceArray((int) (Math.random() * 30), myArray);
                printArray(myArray);
                break;
            case(4):
                myArray = new ArrayList<>();
                randomizeArray(myArray);
                printArray(myArray);
                addArray((int) (Math.random() * 30), myArray);
                printArray(myArray);
                break;
            case(5):
                ArrayList<Employee> employed = new ArrayList<>();
                employed.add(new Employee());
                employed.add(new Employee("Sasha", 48));
                employed.add(new Employee("Tanya", 20));
                employed.add(new Employee("Katya", 25));
                ArrayList<String> names = employeeList(employed);
                ArrayList<String> old = employeeOlder(employed, 29);
                Employee youngest = youngestEmployee(employed);
                System.out.print("Сотрудники: ");
                printNames(names);
                System.out.print("Сотрудники старше 30: ");
                printNames(old);
                employeeAverage(employed, 31);
                System.out.println("Младший сотрудник: " + youngest.getName());
                break;
            default:
                System.out.println("Non applicable");
        }
    }

    public ArrayList<Integer> arrayFill(int min, int max) {
        ArrayList<Integer> filledList = new ArrayList<Integer>();
        for(int i = min; i < max + 1; i++)  {
            filledList.add(i);
        }
        return filledList;
    }

    public int arraySumMoreThenFive(ArrayList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        for (int listNum: list) {
            if (listNum > 5) {sum += listNum;}
        }
        return sum;
    }

    public void replaceArray(int num, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
    }

    public void addArray(int num, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
    }

    //Массив случайных чисел
    public void randomizeArray(ArrayList<Integer> list) {
        int size = (int) (Math.random() * 12 + 3);
        for(int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 30));
        }
    }

    //Вывод в консоль массива
    public void printArray(ArrayList<Integer> list) {
        System.out.print("[ ");
        for(int listNum: list) {
            System.out.print(listNum + " ");
        }
        System.out.print("]\n");
    }

    //Вывод для имён
    public void printNames(ArrayList<String> list) {
        for(String listStr: list) {
            System.out.print(listStr + " ");
        }
        System.out.print("\n");
    }

    public ArrayList<String> employeeList(ArrayList<Employee> list) {
        ArrayList<String> nameList = new ArrayList<>();
        for (Employee unit: list) {
            nameList.add(unit.getName());
        }
        return nameList;
    }

    public ArrayList<String> employeeOlder(ArrayList<Employee> list, int minAge) {
        ArrayList<String> nameList = new ArrayList<>();
        for (Employee unit: list) {
            if (unit.getAge() >= minAge) {
                nameList.add(unit.getName());
            }
        }
        return nameList;
    }

    public void employeeAverage(ArrayList<Employee> list, int minAverageAge) {
        double averageAge = 0.0;
        for (Employee unit: list) {
            averageAge += unit.getAge();
        }
        averageAge /= list.size();
        if (averageAge >= minAverageAge) {
            System.out.println("В среднем возраст сотрудников превышает " + minAverageAge + " лет");
        } else {
            System.out.println("В среднем возраст сотрудников меньше " + minAverageAge + " лет");
        }
    }

    public Employee youngestEmployee(ArrayList<Employee> list) {
        Iterator<Employee> iter = list.iterator();
        int youngAge = list.getFirst().getAge();
        Employee young = list.getFirst();
        while(iter.hasNext()) {
            Employee e = iter.next();
            if(e.getAge() < youngAge) {
                youngAge = e.getAge();
                young = e;
            }
        }
        return young;
    }
}
