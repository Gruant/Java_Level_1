package ru.antongrutsin;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {


        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static boolean checkWin(char symb) {
        int countX = 0;
        int countY = 0;
        int countXY = 0;
        int countYX = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map [i][j] == symb ){
                    countX++;
                    if (countX == DOTS_TO_WIN){
                        return true;
                    }
                } else {
                    countX = 0;
                }

                if (map [j][i] == symb ){
                    countY++;
                    if (countY == DOTS_TO_WIN){
                        return true;
                    }
                } else {
                    countY = 0;
                }
            }
            countX = 0;
            countY = 0;

            if (map[i][i] == symb){
                countXY++;
                if (countXY == DOTS_TO_WIN){
                    return true;
                }
            } else {
                countXY = 0;
            }


            if(map[i][(SIZE - 1) - i] == symb){
                countYX++;
                if (countYX == DOTS_TO_WIN){
                    return true;
                }
            } else {
                countYX = 0;
            }
        }
        countX = 0;
        countY = 0;
        return false;
    }


    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String aiTurn() {
        int x, y;
        int countX = 0;
        int countY = 0;
        int countXY = 0;
        int countYX = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                if (map [i][j] == DOT_X){
                    countX++;
                    if (countX > 1 && isCellValid(i, j+1)){
                        map[i][j+1] = DOT_O;
                        System.out.println("Компьютер походил в точку " + (i + 1) + " " + (j + 2));
                        return "";
                    }
                } else {
                    countX = 0;
                }

                if (map [j][i] == DOT_X){
                    countY++;
                    if (countY > 1 && isCellValid(j+1, i)){
                        map[j+1][i] = DOT_O;
                        System.out.println("Компьютер походил в точку " + (j + 2) + " " + (i+1));
                        return "";
                    }
                } else {
                    countY = 0;
                }
            }

            if (map[i][i] == DOT_X){
                countXY++;
                if (countXY > 1 && isCellValid(i+1, i+1)){
                    map[i+1][i+1] = DOT_O;
                    System.out.println("Компьютер походил в точку " + (i + 2) + " " + (i + 2));
                    return "";
                }
            } else {
                countXY = 0;
            }


            if (map[i][(SIZE - 1) - i] == DOT_X){
                countYX++;
                if (countYX > 1 && isCellValid(i + 1, SIZE - 2 - i)){
                    map[i+1][SIZE - 2 - i] = DOT_O;
                    System.out.println("Компьютер походил в точку " + (i + 2) + " " + (SIZE - 1 - i));
                    return "";
                }
            } else {
                countYX = 0;
            }

        }
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
        return "";
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }


}
