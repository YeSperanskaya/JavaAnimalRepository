package animalRegistry;

import Animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Tom", LocalDate.of(2024,01,01),  0);
//        System.out.println(cat);
//        Cat cat2 = new Cat("Tom");
//        System.out.println(cat2);
//        Dog dog2 = new Dog("Milk", true);
//        System.out.println(dog2);
//        Hamster hamster2 = new Hamster("Pipi", 30);
//        System.out.println(hamster2);
//        Horse horse = new Horse("Lipa");
//        System.out.println(horse);
//        Camel camel = new Camel("Wok");
//        System.out.println(camel);
//        Donkey donkey = new Donkey("Олег");
//        System.out.println(donkey);
//
//        ArrayList commandCat = new ArrayList<>();
//        commandCat.add("Сидеть");
//        Cat cat3 = new Cat("Tom", LocalDate.of(1991, 10, 15), commandCat, 3);
//        System.out.println(cat3);
//        System.out.println(cat3.getCommands());



//        ListAnimalRegistry listAnimalRegistry = new ListAnimalRegistry();
//        ArrayList commandCat = new ArrayList<>();
//        commandCat.add("Сидеть");
//        Cat cat4 = new Cat("Tom", LocalDate.of(1991, 10, 15), commandCat, 3);
//        Cat cat5 = new Cat("Tom", LocalDate.of(1991, 10, 15), commandCat, 3);
//        listAnimalRegistry.addNewAnimal(cat4);
//        listAnimalRegistry.addNewAnimal(cat5);
//        Cat cat6 = new Cat("Tom", LocalDate.of(1991, 10, 16));
//        listAnimalRegistry.addNewAnimal(cat6);
//        System.out.println(listAnimalRegistry);
//





        ListAnimalRegistry listAnimalRegistry = new ListAnimalRegistry();
        ArrayList commandCat = new ArrayList<>();
        commandCat.add("Сидеть");
        Cat cat4 = new Cat("Tom", LocalDate.of(1991, 10, 15), commandCat, 3);
        Horse horse1 = new Horse("Iva");
        Donkey donkey = new Donkey("Vi", LocalDate.of(2001,01,01), true);
        Donkey donkey2 = new Donkey("Vi", LocalDate.of(2056,01,01), true);


        listAnimalRegistry.addNewAnimal(cat4);
        listAnimalRegistry.addNewAnimal(horse1);
        listAnimalRegistry.addNewAnimal(donkey);
        listAnimalRegistry.addNewAnimal(donkey2);
//        listAnimalRegistry.learnNewCommand(cat4, "Бежать!");
//        listAnimalRegistry.learnNewCommand(cat4, "Бежать!");
        Collections.sort(listAnimalRegistry.getAnimalRegistry());
        System.out.println(listAnimalRegistry.getAnimalRegistry());


        System.out.println();
        System.out.println("Количество животных: " + Animal.getCount());
        System.out.println("Количество домашних животных: " + Pets.getCountPets());
        System.out.println("Количество ездовых животных: " + PackAnimal.getCountPackAnimal());
        System.out.println("Количество кошек: " + Cat.getCountCat());
        System.out.println("Количество собак: " + Dog.getCountDog());
        System.out.println("Количество хомяков: " + Hamster.getCountHamster());
        System.out.println("Количество лошадей: " + Horse.getCountHorse());
        System.out.println("Количество верблюдов: " + Camel.getCountCamel());
        System.out.println("Количество ослов: " + Donkey.getCountDonkey());

    }
}
