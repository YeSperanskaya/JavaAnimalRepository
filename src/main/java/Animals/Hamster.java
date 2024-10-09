package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hamster extends Pets{
    private int size;
    static int countHamster;

    public Hamster(String name, int size) {
        this(name, LocalDate.now(), size);
    }

    public Hamster(String name, LocalDate dateBirth, int size) {
        this(name, dateBirth, new ArrayList<>(), size);
    }


    public Hamster(String name, LocalDate dateBirth, ArrayList<String> commands, int size) {
        super(name, dateBirth, commands);
        this.size = size;
        super.type = "Хомяк";
        countHamster++;
    }

    public static int getCountHamster() {
        return countHamster;
    }

    @Override
    public String toString() {
        return super.toString() + ", Размер: " + size + "см.";
    }
}
