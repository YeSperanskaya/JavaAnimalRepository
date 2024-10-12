package animalRegistry;

import Animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMenu {

    private final LocalDate MAX_LOCAL_DATE = LocalDate.now();
    private final LocalDate MIN_LOCAL_DATE = LocalDate.now().minusYears(25);
    private ListAnimalRegistry listAnimalRegistry;
    Scanner scanner;

    public ConsoleMenu() {
        this.listAnimalRegistry = new ListAnimalRegistry();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Добрый день! Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Добро пожаловать в программу 'Реестр животных' " + name + "!");
        boolean isWorkingRegistr = true;
        String command;
        information();
        while (isWorkingRegistr) {
            command = scanner.nextLine();
            switch (command) {
                case "create cat" -> createAnimal("cat");
                case "create dog" -> createAnimal("dog");
                case "create hamster" -> createAnimal("hamster");
                case "create horse" -> createAnimal("horse");
                case "create donkey" -> createAnimal("donkey");
                case "create camel" -> createAnimal("camel");
                case "stat" -> statistic();
                case "sort" -> listAnimalRegistry.sort();
                case "command" -> allAnimalCommand();
                case "exit" -> isWorkingRegistr = false;
                case "list" -> System.out.println(getListAnimalRegistry());
                case "learn" -> learn();
                case "count" -> System.out.println(listAnimalRegistry.getAnimalRegistry().size());
                default -> information();
            }
        }
        System.out.println("Выполнение программы окончено, спасибо, что воспользовались нашей программой, " + name + "!");
    }


    private void information() {
        System.out.println("Доступные программы:");
        System.out.println("Cоздать животное - \"create cat\" (dog, hamster, horse, donkey, camel)");
        System.out.println("Статистика по всем животным - \"stat\"");
        System.out.println("list - список всех животных");
        System.out.println("learn - выучить новую команду");
        System.out.println("sort - Вывести спосок животных сортированных по дате рождения");
        System.out.println("command - посмотреть команды определенного животного");
        System.out.println("count - количество добавленных животных в список");

        System.out.println("exit - выход");
    }


    private void createAnimal(String typeAnimal) {
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        LocalDate localDate = createDateBirth();
//        ArrayList command = createCommands();
        switch (typeAnimal) {
            case "cat":
                System.out.println("Введите количество мышей, которое поймала кошка:");
                int numberOfMiceCaught = scanner.nextInt();
                listAnimalRegistry.addNewAnimal(new Cat(name, localDate, numberOfMiceCaught));
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
                System.out.println("Введите количество горбов у верблюда:");
                byte numberOfHumps = scanner.nextByte();
                listAnimalRegistry.addNewAnimal(new Camel(name, localDate, numberOfHumps));
                break;
        }
    }

    public ListAnimalRegistry getListAnimalRegistry() {
        return listAnimalRegistry;
    }

    private LocalDate createDateBirth() {
        while (true) {
            try {
                System.out.println("Введите год рождения:");
                int year = scanner.nextInt();
                System.out.println("Введите месяц рождения:");
                int month = scanner.nextInt();
                System.out.println("Введите день рождения:");
                int day = scanner.nextInt();
                if (LocalDate.of(year, month, day).isAfter(MAX_LOCAL_DATE) ||
                        LocalDate.of(year, month, day).isBefore(MIN_LOCAL_DATE)) {
                    System.out.println("Неверно указана дата рождения!");
                } else {
                    return LocalDate.of(year, month, day);
                }
            } catch (Exception e) {
                System.out.println("Неверно указана дата рождения!");
            }
        }
    }


    private ArrayList createCommands() {
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Введите через пробел команды, которыми владеет животное:");
        String commands = scanner.nextLine();
        String[] commandArray = commands.split(" ");
        for (int i = 0; i < commandArray.length; i++) {
            array.add(commandArray[i]);
        }
        return array;
    }

    private Animal createForFindAnimal() {
        System.out.println("Введите имя животного:");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения животного:");
        LocalDate localDate = createDateBirth();
        System.out.println("Введите тип животного на английском языке:");
        String type = scanner.nextLine();

        Animal animal;
        while (true) {
            switch (type) {
                case "cat":
                    animal = new Cat(name, localDate);
                    return animal;
                case "dog":
                    animal = new Dog(name, localDate, true);
                    return animal;
                case "hamster":
                    animal = new Hamster(name, localDate, 52);
                    return animal;
                case "horse":
                    animal = new Horse(name, localDate, 50);
                    return animal;
                case "donkey":
                    animal = new Donkey(name, localDate, false);
                    return animal;
                case "camel":
                    animal = new Camel(name, localDate, (byte) 1);
                    return animal;
                default:
                    System.out.println("Вы ввели неверный тип животного");
                    System.out.println("Введите тип животного на английском языке:");
                    type = scanner.nextLine();

            }
        }


    }


    private void learn() {
        Animal animal = createForFindAnimal();
        System.out.println("Введите новую команду:");
        String command = scanner.nextLine();
        for (int i = 0; i < listAnimalRegistry.getAnimalRegistry().size(); i++) {
            if (listAnimalRegistry.getAnimalRegistry().get(i).equals(animal)) {
                listAnimalRegistry.learnNewCommand(animal, command);
            } else {
                System.out.println("Такого животного нет, команда не выучена!");
            }
        }
    }

    private void allAnimalCommand() {
        Animal animal = createForFindAnimal();
        for (int i = 0; i < listAnimalRegistry.getAnimalRegistry().size(); i++) {
            if (listAnimalRegistry.getAnimalRegistry().get(i).equals(animal)) {
                System.out.println(listAnimalRegistry.getCommansAnimal((Animal) listAnimalRegistry.getAnimalRegistry().get(i)));
            } else {
                System.out.println("Такого животного нет!");
            }
        }
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
