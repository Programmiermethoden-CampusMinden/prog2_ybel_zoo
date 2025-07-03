package zoo.mammals.primates;

import zoo.Animal;

public class Monkey implements Primate{
    @Override
    public void move(){
        System.out.println("Der Affe schwingt von Baum zu Baum");
    }

    public String getName(){
        return "Affe";
    }
}
