package ru.antongrutsin.person;

public class Person {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private final int age;

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

    public void changeName(String name){
        this.name = name;
    }

    public void changePosition(String position){
        this.position = position;
    }

    public void changeEmail(String email){
        this.email = email;
    }

    public void changeSalary(int salary){
        this.salary = salary;
    }

    public void changePhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo(){
        System.out.printf("Сотрудник: %s\nДолжность: %s\nEmail: %s\nТелефон: %s\nЗарплата: %d\nВозраст: %d",
                          name, position, email, phoneNumber, salary, age);
        System.out.println();
    }
}
