package zoo.reptiles;

public class Lizard implements Reptile {
    @Override
    public void move(){
        System.out.println("Die Eidechse bewegt sich auf allen Vieren");
    }

    public String getName(){
        return "Eidechse";
    }
}
