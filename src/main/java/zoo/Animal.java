package zoo;

/** Describes the shared features of every animal. */
public interface Animal {
    /**
     * Every creature has a name.
     *
     * @return the name of the animal
     */
    String getName();

    /** Creatures can move around. */
    void move();
}
