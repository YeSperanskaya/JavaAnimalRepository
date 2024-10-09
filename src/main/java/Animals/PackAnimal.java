package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimal extends Animal{

    private static int countPackAnimal;
    public PackAnimal(String name) {
        super(name);
    }

    public PackAnimal(String name, LocalDate dateBirth) {
        super(name, dateBirth);
    }

    public PackAnimal(String name, LocalDate dateBirth, ArrayList<String> commands) {
        super(name, dateBirth, commands);
        countPackAnimal++;
    }

    public static int getCountPackAnimal() {
        return countPackAnimal;
    }
}
