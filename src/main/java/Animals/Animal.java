package Animals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

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
        if (isExistComand(command)) {
            System.out.println("Команда уже известна!");
        } else {
            commands.add(command);
            System.out.println("Теперь известна новая команда: " + command);
        }
    }
    private boolean isExistComand(String command) {
        return commands.contains(command);
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(dateBirth, animal.dateBirth) && Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateBirth, type);
    }
}
