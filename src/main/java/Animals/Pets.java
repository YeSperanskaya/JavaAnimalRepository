package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pets extends Animal{
    static int countPets;


    public Pets(String name, LocalDate dateBirth, ArrayList<String> commands) {
        super(name, dateBirth, commands);
        countPets++;
    }

    public static int getCountPets() {
        return countPets;
    }
}
