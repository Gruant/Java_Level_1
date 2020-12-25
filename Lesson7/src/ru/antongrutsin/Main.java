package ru.antongrutsin;

public class Main {

    public static void main(String[] args) {
        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Risena", 15);
        catsArray[1] = new Cat("Baton", 10);
        catsArray[2] = new Cat("Raduga", 5);
        catsArray[3] = new Cat("Dunya", 20);
        catsArray[4] = new Cat("Arbuz", 10);

        Plate plate = new Plate(40);

        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eat(plate);
            System.out.println("Сытость кошки по имени " + catsArray[i].catInfo() + ": "
                    + catsArray[i].isSatiety());
        }

        System.out.println();
        
        plate.addMeal(10);
        System.out.println("Добавили еды. Сейчас в тарелке: " + plate.info());


    }
}


//        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку