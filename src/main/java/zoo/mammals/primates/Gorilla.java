package zoo.mammals.primates;

import zoo.Animal;

public class Gorilla implements Primate{
    @Override
    public void move(){
        System.out.println("Der Gorilla bewegt sich mit allen Vieren");
    }

    public String getName(){
        return "Gorilla";
    }
}
