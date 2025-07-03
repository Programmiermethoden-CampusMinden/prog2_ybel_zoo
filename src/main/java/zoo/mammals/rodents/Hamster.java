package zoo.mammals.rodents;

public class Hamster implements Rodent{
    @Override
    public void move(){
        System.out.println("Der Hamster ist mittelschnell auf allen Vieren");
    }
    public String getName(){
        return "Hamster";
    }
}
