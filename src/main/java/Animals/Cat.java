package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat extends Pets{
    static int countCat;
    private int numberOfMiceCaught;


//    public Cat(String name, LocalDate dateBirth, int numberOfMiceCaught) {
//        super(name, dateBirth);
//        this.numberOfMiceCaught = numberOfMiceCaught;
//        super.type = "cat";
//        countCat++;
//    }

    public Cat(String name) {
        this(name, LocalDate.now());
    }
    public Cat(String name, LocalDate dateBirth) {
        this(name, dateBirth, 0);
    }
    public Cat(String name, LocalDate dateBirth, int numberOfMiceCaught) {
        this(name, dateBirth, new ArrayList<>(), numberOfMiceCaught);
    }
    public Cat(String name, LocalDate dateBirth, ArrayList<String> commands, int numberOfMiceCaught) {
        super(name, dateBirth, commands);
        super.type = "Кот";
        this.numberOfMiceCaught = numberOfMiceCaught;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество пойманных мышей: " + numberOfMiceCaught;
    }
}
