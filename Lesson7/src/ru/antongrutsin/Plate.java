package ru.antongrutsin;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            return false;
        }
        food -= n;
        return true;
    }

    public int info() {
        return food;
    }

    public void addMeal(int value) {
        this.food += value;
    }

}
