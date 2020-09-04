package ru.antongrutsin;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] array = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Привет игрок ! В какую игру будем играть?");
        System.out.println("Игра #1: Угадать число от 0 до 9");
        System.out.println("Игра #2: Угадать продукт");
        System.out.println("Твой выбор? 1 или 2");
        int choice = checkNumberRange(1, 2);
        switch (choice){
            case 1:
                guessTheNumber(9);
                break;
            case 2:
               guessTheMeal(array);
               break;
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    /* Задание 1
    Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
    угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем
    число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
    1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void guessTheNumber(int max) {
        Random random = new Random();

        System.out.println("Угадайте число с 3-х попыток ! Поехали.");

        int choice = 1;
        int attempt = 3;
        do {
            int randomValue = random.nextInt(10);
            while (true) {
                int number;
                System.out.printf("Введите число от 0 до %s: \n", max);
                number = checkNumberRange(0, 9);

                if (number == randomValue) {
                    System.out.printf("Вы угадали ! Загаданное число: %s\n", randomValue);
                    System.out.println();
                    System.out.println("Повторить игру еще раз: 1 – да / 0 – нет");
                    choice = checkNumberRange(0, 1);
                    attempt = 3;
                    break;
                } else {
                    System.out.println();
                    System.out.printf("Вы не угадали. Оставшееся кол-во попыток: %s\n", --attempt);
                    System.out.println();
                    if (attempt == 0){
                        System.out.println("Попытки закончились");
                        System.out.println();
                        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                        choice = checkNumberRange(0, 1);
                        attempt = 3;
                        break;
                    }
                }
            }
        } while (choice == 1);
    }

    // функция будет запрашивать ввод, пока не будет возвращено целое число
    public static int getNumberFromScanner() {
        while (!scanner.hasNextInt()){
            if (!scanner.hasNextInt()) {
                System.out.println("Необходио ввести целое число. Повторите ввод:");
            }
            scanner.next();
        }
        return scanner.nextInt();
    }
    // функция проверяе диапазон вводимого числа и возвращает значение, если оно входит в диапазон
    public static int checkNumberRange (int min, int max) {
        do {
            int number = getNumberFromScanner();
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.printf("Вы ввели неверное число. Введите число от %d до %s\n", min, max);
            }
        } while (true);
    }

    /* Задание 2
    Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
    "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
    "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
     */
    public static void guessTheMeal (String[] array) {
        Random random = new Random();
        String word = array[random.nextInt(array.length)];
        while (true) {
            String inputWord = getWordFromScanner();
            System.out.println();

            if (word.equals(inputWord)) {
                System.out.println("Вы угадали !");
                break;
            } else {
                System.out.println("Вы не угадали");
                System.out.println("Подсказка: " + returnWrongAnswer(word, inputWord));
            }

        }
    }

    // Метод считывания слова со сканера. Возвращает строку.
    public static String getWordFromScanner (){
        System.out.println();
        System.out.print("Введите слово: ");
        return scanner.next().toLowerCase();
    }

    /* Метод возвращает подсказку в виде 15 символов "a**************" и указывает на совпадающие символы
       Перебор символов производиться по индексам наименьшего из сравниваемых слов
     */
    public static String returnWrongAnswer(String word, String inputWord) {
        String answer = "***************";
        char [] answerChars = answer.toCharArray();
        if (word.length() >= inputWord.length()) {
            for (int i = 0; i < inputWord.length(); i++) {
                if (word.charAt(i) == inputWord.charAt(i)) {
                    answerChars[i] = word.charAt(i);
                }
            }
            answer = String.valueOf(answerChars);
            return answer;
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == inputWord.charAt(i)) {
                    answerChars[i] = word.charAt(i);
                }
            }
        }
        answer = String.valueOf(answerChars);
        return answer;

    }

}


