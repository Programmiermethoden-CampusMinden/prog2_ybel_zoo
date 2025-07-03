package zoo.mammals.cats;

public class Puma implements Cat{
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("Auf vier Pfoten laufend");
    }
}
