package ru.antongrutsin;

public abstract class Animal {

    protected String type;
    protected float runDistanceLimit;
    protected float jumpHeightLimit;
    protected float swimDistanceLimit;

    public Animal(String type, float runDistanceLimit, float jumpHeightLimit) {
        this.type = type;
        this.runDistanceLimit = runDistanceLimit;
        this.jumpHeightLimit = jumpHeightLimit;
    }

    void run(float value){
        if(isValid( value, this.runDistanceLimit)) {
            System.out.println(type + " пробежала: " + (int)value + "м.");
        } else {
            System.out.println(type + " столько не бегает, всего: " + (int)this.runDistanceLimit + " м.");
        }
    }

    void jump(float value){
        if(isValid( value, this.jumpHeightLimit)) {
            System.out.println(type + " прыгнула: " + value + "м.");
        } else {
            System.out.println(type + " так высоко не прыгает, всего: " + this.jumpHeightLimit + " м.");
        }
    }

    void swim(float value){
        if(isValid( value, this.swimDistanceLimit)) {
            System.out.println(type + " уплыла на: " + (int)value + "м.");
        } else {
            System.out.println(type + " так далеко не плавает, всего: " + (int)this.swimDistanceLimit);
        }
    }

    boolean isValid(float value, float comparedValue) {
        return value <= comparedValue;
    }
}
