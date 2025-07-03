package zoo.fishes;

public class Trout implements Fish {
    @Override
    public void move(){
        System.out.println("Die Forelle bewegt sich wellenartig");
    }

    public String getName(){
        return "Forelle";
    }
}
