package zoo.mammals.cats;

import zoo.Animal;

public class Tiger implements Cat {
    @Override
    public void move(){
        System.out.println("Der Tiger bewegt sich schnell auf allen Vieren");
    }
    public String getName(){
        return "Tiger";
    }
}
