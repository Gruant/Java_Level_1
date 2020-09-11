package ru.antongrutsin;

import ru.antongrutsin.person.Person;

public class Main {
    private static int age = 40;


    public static void main(String[] args) {
        Person[] personArray = new Person[5];

        personArray[0] = new Person("Евгений Петров", "Коммерческий директор", "evgeniy@mail.ru",
                "+7-977-134-56-78", 174_561, 47);
        personArray[1] = new Person("Виталий Сергеевич", "Повар", "povar@yandex.ru",
                "+7-545-434-43-43", 43_000, 54);
        personArray[2] = new Person("Сергей Витальевич", "Программист", "dev@yandex.ru",
                "+7-855-434-76-76", 143_000, 34);
        personArray[3] = new Person("Елена Петровна", "Бухгалтер", "dengi@yandex.ru",
                "+7-838-657-87-90", 80_000, 35);
        personArray[4] = new Person("Инесса Викторовна", "Менеджер по продажам", "sale@yandex.ru",
                "+7-904-434-56-78", 60_000, 24);


        System.out.printf("Сотрудники старше %d лет:\n", age);
        System.out.println();

        for(Person x: personArray){
            if(x.getAge() > age){
                x.displayInfo();
                System.out.println();
            }
        }
    }
}
