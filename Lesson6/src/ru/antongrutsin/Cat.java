package ru.antongrutsin;

public class Cat extends Animal {

    Cat(String type, float runDistanceLimit, float jumpHeightLimit) {
        super(type ,runDistanceLimit, jumpHeightLimit);
        this.swimDistanceLimit = 0;
    }

    Cat(String type, float runDistanceLimit, float jumpHeightLimit, float swimDistanceLimit){
        super(type, runDistanceLimit, jumpHeightLimit);
        this.swimDistanceLimit = swimDistanceLimit;

    }

    @Override
    void swim(float value){
        if (swimDistanceLimit == 0){
            System.out.println("Кошка не умеет плавать");
        }
        else {
            super.swim(this.swimDistanceLimit);
        }
    }


}
