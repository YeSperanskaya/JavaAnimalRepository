package animalRegistry;

import Animals.Animal;
import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class ListAnimalRegistry {
    private ArrayList<Animal> animalRegistry;

    public ListAnimalRegistry() {
        this.animalRegistry = new ArrayList<>();
    }
    public ListAnimalRegistry(ArrayList animalRegistry) {
        this.animalRegistry = animalRegistry;
    }

    public ArrayList getAnimalRegistry() {
        return animalRegistry;
    }

    public void addNewAnimal(Animal animal) {
        if(isExistAnimal(animal)) {
            System.out.println("Такое животное уже есть!");
        } else {
            animalRegistry.add(animal);
            System.out.println("Животное " + animal + "успешно добавлено в реестр!");
        }
    }

    private boolean isExistAnimal(Animal animal) {
        return animalRegistry.contains(animal);

    }

    public void learnNewCommand(Animal animal, String command) {
        if (isExistAnimal(animal)) {
            for (int i = 0; i < animalRegistry.size(); i++) {
                if (animalRegistry.get(i).equals(animal)) {
                    animalRegistry.get(i).learnNewCommand(command);
                }
            }
        } else {
            System.out.println("Такого животного нет, команда не выучена!");
        }
    }


    public void sort() {
        Collections.sort(animalRegistry);
        System.out.println(animalRegistry);
    }

public ArrayList getCommansAnimal(Animal animal) {
        return animal.getCommands();
}


    @Override
    public String toString() {
        return "Список животных: " + animalRegistry;
    }




}
