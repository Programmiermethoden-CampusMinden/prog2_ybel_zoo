package zoo.reptiles;

public class Turtle implements Reptile {
    @Override
    public void move(){
        System.out.println("Die Schildkröte bewegt sich auf allen Vieren aber langsame:)");
    }

    public String getName(){
        return "Schildkröte";
    }
}
