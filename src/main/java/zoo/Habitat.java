package zoo;

import java.util.ArrayList;
import java.util.List;

public class Habitat<T extends Animal> {
    private final String name;
    private final List<T> animals;

    public Habitat(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void add(T animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
            System.out.println(animal.getName() + " wurde dem Gehege \"" + name + "\" hinzugefuegt.");
        } else {
            System.out.println(animal.getName() + " ist bereits im Gehege \"" + name + "\".");
        }
    }

    public void remove(T animal) {
        if (animals.remove(animal)) {
            System.out.println(animal.getName() + " wurde aus dem Gehege \"" + name + "\" entfernt.");
        } else {
            System.out.println(animal.getName() + " ist nicht im Gehege \"" + name + "\".");
        }
    }

    public String getName() {
        return name;
    }
}
