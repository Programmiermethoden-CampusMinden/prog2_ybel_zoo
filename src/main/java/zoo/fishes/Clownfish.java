package zoo.fishes;

public class Clownfish implements Fish{

    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public void move() {
        System.out.println("schwimmend");
    }
}
