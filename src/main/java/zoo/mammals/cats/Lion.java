package zoo.mammals.cats;

import zoo.Animal;

public class Lion implements Cat {
    @Override
    public void move(){
        System.out.println("Der Löwe bewegt sich schnell auf allen Vieren");
    }
    public String getName(){
        return "Löwe";
    }
}
