package ru.antongrutsin.person;

public class Person {

    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return  age;
    }

    public void displayInfo(){
        System.out.printf("Сотрудник: %s\nДолжность: %s\nEmail: %s\nТелефон: %s\nЗарплата: %d\nВозраст: %d",
                          name, position, email, phoneNumber, salary, age);
        System.out.println();
    }
}
