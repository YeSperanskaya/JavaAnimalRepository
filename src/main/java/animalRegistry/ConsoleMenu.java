package animalRegistry;

import Animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMenu {
    public void start() {
        System.out.println("Добрый день! Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Добро пожаловать в программу 'Реестр животных'!");
        String command = scanner.nextLine();
        ListAnimalRegistry listAnimalRegistry = new ListAnimalRegistry();
        information();
        while (!command.equals("exit")) {
            information();
            command = scanner.nextLine();
            switch (command) {
                case "create cat" -> createCat();
                case "create dog" -> createDog();
                case "create hamster" -> createHamster();
                case "create horse" -> createHorse();
                case "create donkey" -> createDonkey();
                case "create camel" -> createCamel();
                case "statistic" -> statistic();
                case "help" -> information();
                default -> System.out.println("Вы ввели неверную команду!");


            }

        }
    }


    private void information() {
        System.out.println("Доступные программы:");
        System.out.println("создать животное");
    }

    private void createCat() {

    }
    private void createDog() {

    }
    private void createHamster() {

    }

    private void createHorse() {

    }
    private void createDonkey() {

    }
    private void createCamel() {

    }

    private String createName() {

    }
    private LocalDate createDateBirth() {

    }

    private ArrayList createCommands() {

    }



    private void statistic() {
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
