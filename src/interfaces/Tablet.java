package interfaces;

public class Tablet implements MessageSender{
    private String model;
    private double screenWidth;
    private double screenHeight;

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    public Tablet(String model, double screenWidth, double screenHeight) {
        this.model = model;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(double screenWidth) {
        this.screenWidth = screenWidth;
    }

    public double getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(double screenHeight) {
        this.screenHeight = screenHeight;
    }
}
