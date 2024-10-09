package Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
    protected final String name;
    protected final LocalDate dateBirth;
    protected String type;
    protected ArrayList<String> commands;
    static int count;

    public Animal(String name) {
        this(name, LocalDate.now());
    }
    public Animal(String name, LocalDate dateBirth) {
        this(name, dateBirth, new ArrayList<String>());
    }

    public Animal(String name, LocalDate dateBirth, ArrayList<String> commands) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.commands = commands;
        count++;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public void learnNewCommand(String command) {
        commands.add(command);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", дата рождения: " + dateBirth +
                ", тип " + type +
                ", список комманд: " + commands;
    }
}
