package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        MobilePhone phone1 = new MobilePhone("3310", "nokia", 0.5);



        Tablet tablet1 = new Tablet("ipad", 4.0, 5.0);

        notifyUser("Hola", "Bob", tablet1);
        notifyUser("Hola", "Bob", phone1);


        List<Flyable> flyables = new ArrayList<>();
        Bird bird = new Bird();
        flyables.add(bird);

        Airplane airplane = new Airplane();
        flyables.add(airplane);

    }


//    public static void notifyUserByPhone(String message, String username, interfaces.MobilePhone sender) {
//        System.out.println("Sending notification to " + username);
//        sender.sendMessage(message);
//    }
//
//    public static void notifyUserByTablet(String message, String username, interfaces.Tablet sender) {
//        System.out.println("Sending notification to " + username);
//        sender.sendMessage(message);
//    }
//
//    public static void notifyUserByLaptop(String message, String username, interfaces.Laptop sender) {
//        System.out.println("Sending notification to " + username);
//        sender.sendMessage(message);
//    }

    public static void notifyUser(String message, String username, MessageSender sender) {
        System.out.println("Sending notification to " + username);
        sender.sendMessage(message);
    }



}
