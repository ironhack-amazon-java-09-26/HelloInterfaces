package interfaces;

public class Airplane implements Flyable{


    @Override
    public void fly() {
        System.out.println("interfaces.Airplane flying");
    }
}
