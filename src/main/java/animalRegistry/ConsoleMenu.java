package animalRegistry;

import Animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {
    private ListAnimalRegistry listAnimalRegistry;
    Scanner scanner;

    public ConsoleMenu() {
        this.listAnimalRegistry = new ListAnimalRegistry();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Добрый день! Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Добро пожаловать в программу 'Реестр животных'" + name + "!");
        boolean isWorkingRegistr = true;
        String command;
        while (isWorkingRegistr) {
            information();
            command = scanner.nextLine();
            switch (command) {
                case "create cat" -> createAnimal("cat");
                case "create dog" -> createAnimal("dog");
                case "create hamster" -> createAnimal("hamster");
                case "create horse" -> createAnimal("horse");
                case "create donkey" -> createAnimal("donkey");
                case "create camel" -> createAnimal("camel");
                case "stat" -> statistic();
                case "help" -> information();
                case "exit" -> isWorkingRegistr = false;
                default -> System.out.println("Вы ввели неверную команду!");


            }

        }
        System.out.println("Выполнение программы окончено, спасибо, что воспользовались нашей программой " + name + "!");
    }


    private void information() {
        System.out.println("Доступные программы:");
        System.out.println("Cоздать животное - \"create cat\" (dog, hamster, horse, donkey, camel)");
        System.out.println("Статистика по всем животным - \"stat\"");
    }


    private void createAnimal(String typeAnimal) {
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        LocalDate  localDate = createDateBirth();
//        ArrayList command = createCommands();
        switch (typeAnimal) {
            case "cat":
                System.out.println("Введите количество мышей, которое поймала кошка:");
                int numberOfMiceCaught = scanner.nextInt();
                listAnimalRegistry.addNewAnimal(new Cat(name, localDate,  numberOfMiceCaught));
                break;
            case "dog":
                System.out.println("Является ли собака охотничьей true - да, false - нет?");
                boolean isHunter = scanner.nextBoolean();
                listAnimalRegistry.addNewAnimal(new Dog(name, localDate, isHunter));
                break;
            case "hamster":
                System.out.println("Введите какой размер у хомяка:");
                int size = scanner.nextInt();
                listAnimalRegistry.addNewAnimal(new Hamster(name, localDate, size));
                break;
            case "horse":
                System.out.println("Введите максимальный вес седока:");
                int maxWeightRider = scanner.nextInt();
                listAnimalRegistry.addNewAnimal(new Horse(name, localDate, maxWeightRider));
                break;
            case "donkey":
                System.out.println("Говорит ли ослик? true - да, false - нет");
                boolean isSpeaker = scanner.nextBoolean();
                listAnimalRegistry.addNewAnimal(new Donkey(name, localDate, isSpeaker));
                break;
            case "camel":
                System.out.println("Введите какой размер у хомяка:");
                byte numberOfHumps = scanner.nextByte();
                listAnimalRegistry.addNewAnimal(new Camel(name, localDate, numberOfHumps));
                break;
        }
    }
//    private void createCat() {
//
//    }
//    private void createDog() {
//
//    }
//    private void createHamster() {
//
//    }
//
//    private void createHorse() {
//
//    }
//    private void createDonkey() {
//
//    }
//    private void createCamel() {
//
//    }


    private LocalDate createDateBirth() {
        System.out.println("Введите год рождения:");
        int year = scanner.nextInt();
        System.out.println("Введите месяц рождения:");
        int month = scanner.nextInt();
        System.out.println("Введите день рождения:");
        int day = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    private ArrayList createCommands() {
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Введите через пробел команды, которыми владеет животное:");
        String commands = scanner.nextLine();
        String[] commandArray = commands.split(" ");
        for (int i =0; i < commandArray.length; i++) {
             array.add(commandArray[i]);
        }
        return array;
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
