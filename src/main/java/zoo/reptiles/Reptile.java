package zoo.reptiles;

import zoo.Animal;

/** Reptiles form an animal class. */
public interface Reptile extends Animal {
    /** Our reptiles can crawl by using the move method. */
    default void crawl() {
        move();
    }
}
