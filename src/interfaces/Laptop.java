package interfaces;

public class Laptop extends Computer implements MessageSender, Chargeable {


    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }


    @Override
    public void charge() {
        System.out.println("interfaces.Laptop charged");
    }
}
