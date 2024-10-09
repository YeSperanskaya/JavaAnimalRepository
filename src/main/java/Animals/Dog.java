package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dog extends Pets{
    private boolean isHunter;
    static int countDog;

    public Dog(String name, boolean isHunter) {
        this(name, LocalDate.now(), isHunter);
    }

    public Dog(String name, LocalDate dateBirth, boolean isHunter) {
        this(name, dateBirth, new ArrayList<>(), isHunter);
    }


    public Dog(String name, LocalDate dateBirth, ArrayList<String> commands, boolean isHunter) {
        super(name, dateBirth, commands);
        this.isHunter = isHunter;
        super.type = "Собака";
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public String toString() {
        return super.toString() + ", Является охотничьей: " + isHunter  + '\n';
    }
}
