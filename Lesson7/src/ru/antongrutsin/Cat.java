package ru.antongrutsin;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            this.satiety = true;
        }
    }

    public String catInfo(){
        return this.name;
    }

    public boolean isSatiety(){
        return this.satiety;
    }

}
