package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends PackAnimal{
    private int maxWeightRider;
    private static int countHorse;
    public Horse(String name) {
        this(name, LocalDate.now(), 75);
    }

    public Horse(String name, LocalDate dateBirth, int maxWeightRider) {
        this(name, dateBirth, new ArrayList<>(), maxWeightRider);
    }

    public Horse(String name, LocalDate dateBirth, ArrayList<String> commands, int maxWeightRider) {
        super(name, dateBirth, commands);
        this.maxWeightRider = maxWeightRider;
        countHorse++;
    }

    public static int getCountHorse() {
        return countHorse;
    }

    @Override
    public String toString() {
        return "Максимальный вес седока равен: " + maxWeightRider +'.';
    }
}
