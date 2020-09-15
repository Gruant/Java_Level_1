package ru.antongrutsin;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Кошка",20, 30);
        Cat cat2 = new Cat("Кошка", 20, 30, 5);
        Dog dog1 = new Dog("Собака",599, 1, 20);

        cat1.jump(200);
        cat1.run(50);
        cat1.swim(20);

        System.out.println();

        cat2.jump(200);
        cat2.run(50);
        cat2.swim(20);

        System.out.println();

        dog1.jump(1000);
        dog1.run(300);
        dog1.swim(10);

    }

}
