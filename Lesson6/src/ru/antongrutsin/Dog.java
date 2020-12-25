package ru.antongrutsin;

public class Dog extends Animal {

    Dog(float runDistanceLimit, float jumpHeightLimit, float swimDistanceLimit) {
        super(runDistanceLimit, jumpHeightLimit);
        super.type = "Собака";
        this.swimDistanceLimit = swimDistanceLimit;
    }

}
