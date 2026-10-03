package interfaces;

public class MobilePhone implements MessageSender {

    private String model;
    private String manufacturer;
    private double ramMemoryInGB;


    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    public MobilePhone(String model, String manufacturer, double ramMemoryInGB) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramMemoryInGB = ramMemoryInGB;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getRamMemoryInGB() {
        return ramMemoryInGB;
    }

    public void setRamMemoryInGB(double ramMemoryInGB) {
        this.ramMemoryInGB = ramMemoryInGB;
    }
}
