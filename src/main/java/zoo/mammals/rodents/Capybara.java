package zoo.mammals.rodents;

public class Capybara implements Rodent {
    public String getName() {
        return this.getClass().getName();
    }

    public void move() {
        System.out.println("stehend");
    }
}
