package Animals;

import java.time.LocalDate;
import java.util.ArrayList;

public class Donkey extends PackAnimal{
    private boolean isSpeaker;
    private static int countDonkey;

    public Donkey(String name) {
        this(name, LocalDate.now(), false);
    }
    public Donkey(String name, LocalDate dateBirth, boolean isSpeaker) {
        this(name, dateBirth, new ArrayList<>(), isSpeaker);
    }
    public Donkey(String name, LocalDate dateBirth, ArrayList<String> commands, boolean isSpeaker) {
        super(name, dateBirth, commands);
        this.isSpeaker = isSpeaker;
        super.type = "Осел";
        countDonkey++;
    }

    public static int getCountDonkey() {
        return countDonkey;
    }

    @Override
    public String toString() {
        return super.toString() + ", Является говорящим: " + isSpeaker;
    }
}
