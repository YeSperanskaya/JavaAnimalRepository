package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimal extends Animal{

    private static int countPackAnimal;
    public PackAnimal(String name) {

        this(name, LocalDate.now());
    }

    public PackAnimal(String name, LocalDate dateBirth) {
        this(name, dateBirth, new ArrayList<>());
    }

    public PackAnimal(String name, LocalDate dateBirth, ArrayList<String> commands) {
        super(name, dateBirth, commands);
        countPackAnimal++;
    }

    public static int getCountPackAnimal() {
        return countPackAnimal;
    }
}
