package interfaces;

public class Bird implements Flyable{
    private String name;

    @Override
    public void fly() {
        System.out.println("interfaces.Bird flying");
    }
}
