package zoo.mammals.primates;

public class Tarsier implements Primate{
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("kletternd");
    }
}
