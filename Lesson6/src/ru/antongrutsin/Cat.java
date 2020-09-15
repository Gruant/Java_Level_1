package ru.antongrutsin;

public class Cat extends Animal {

    Cat(float runDistanceLimit, float jumpHeightLimit) {
        super(runDistanceLimit, jumpHeightLimit);
        super.type = "Кошка";
        this.swimDistanceLimit = 0;
    }

    Cat(float runDistanceLimit, float jumpHeightLimit, float swimDistanceLimit){
        super(runDistanceLimit, jumpHeightLimit);
        super.type = "Кошка";
        this.swimDistanceLimit = swimDistanceLimit;

    }


    @Override
    void swim(float value){
        if (swimDistanceLimit == 0){
            System.out.println("Кошка не умеет плавать");
            super.type = "Кошка";
        }
        else {
            super.swim(this.swimDistanceLimit);
        }
    }


}
