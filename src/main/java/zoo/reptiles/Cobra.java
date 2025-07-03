package zoo.reptiles;

public class Cobra implements Reptile {
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("kriechend & schlängelnd");
    }
}
