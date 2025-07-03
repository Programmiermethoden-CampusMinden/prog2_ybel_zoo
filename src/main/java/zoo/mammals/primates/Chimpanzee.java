package zoo.mammals.primates;

public class Chimpanzee implements Primate{
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("laufend und kletternd");
    }
}
