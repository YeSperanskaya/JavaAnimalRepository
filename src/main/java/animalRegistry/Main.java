package animalRegistry;

import Animals.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", LocalDate.of(2024,01,01),  0);
        System.out.println(cat);
        Cat cat2 = new Cat("Tom");
        System.out.println(cat2);
        Dog dog2 = new Dog("Milk", true);
        System.out.println(dog2);
        Hamster hamster2 = new Hamster("Pipi", 30);
        System.out.println(hamster2);
        Horse horse = new Horse("Lipa");
        System.out.println(horse);
        Camel camel = new Camel("Wok");
        System.out.println(camel);
        Donkey donkey = new Donkey("Олег");
        System.out.println(donkey);




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
