package zoo.mammals.rodents;

public class Hamster implements Rodent {
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("laufend, manchmal kletternd");
    }
}
