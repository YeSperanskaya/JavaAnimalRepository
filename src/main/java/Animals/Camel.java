package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camel extends PackAnimal{
    private byte numberOfHumps;
    private static int countCamel;
    public Camel(String name) {
        this(name, LocalDate.now(), (byte) 1);
    }
    public Camel(String name, LocalDate dateBirth, byte numberOfHumps) {
        this(name, dateBirth, new ArrayList<>(), numberOfHumps);
    }
    public Camel(String name, LocalDate dateBirth, ArrayList<String> commands, byte numberOfHumps) {
        super(name, dateBirth, commands);
        this.numberOfHumps = numberOfHumps;
        super.type = "Верблюд";
        countCamel++;
    }

    public static int getCountCamel() {
        return countCamel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Количество горбов: " + numberOfHumps;
    }
}
