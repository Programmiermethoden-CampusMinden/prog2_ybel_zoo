package zoo.fishes;

import zoo.Animal;

/** Fish form an animal class. */
public interface Fish extends Animal {
    /** Our fish can swim by using the move method. */
    default void swim() {
        move();
    }
}
