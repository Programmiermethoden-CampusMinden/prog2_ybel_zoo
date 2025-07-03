package zoo.mammals.rodents;

public class Mouse implements Rodent{
    @Override
    public void move(){
        System.out.println("Die Maus ist flink auf allen Vieren");
    }
    public String getName(){
        return "Maus";
    }
}
