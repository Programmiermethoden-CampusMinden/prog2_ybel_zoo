package zoo.fishes;

public class Seahorse implements Fish{

    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public void move() {
        System.out.println("schwimmend: nach oben, unten, vorne und hinten");
    }
}
