package zoo.mammals;

import zoo.Animal;

/** Mammals form an animal class. */
public interface Mammal extends Animal {
    /** Our mammals can run around by using the move method. */
    default void run() {
        move();
    }
}
