package animalRegistry;

import java.util.Scanner;

public class ConsoleMenu {
    public void start() {
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
}
