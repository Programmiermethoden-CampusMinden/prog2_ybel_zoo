package zoo.mammals.cats;

public class Tiger implements Cat{
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("Laufend auf vier Pfoten");
    }
}
