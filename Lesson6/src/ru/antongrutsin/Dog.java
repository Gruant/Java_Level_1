package ru.antongrutsin;

public class Dog extends Animal {

    Dog(String type, float runDistanceLimit, float jumpHeightLimit, float swimDistanceLimit) {
        super(type, runDistanceLimit, jumpHeightLimit);
        this.swimDistanceLimit = swimDistanceLimit;
    }

}
