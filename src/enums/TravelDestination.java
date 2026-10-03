package enums;

public class TravelDestination {


    private String name;
    private String country;
    private DestinationType destinationType; // (playa, monta~na, natura, ciudad, fiesta, cruzero)


    public TravelDestination(String name, String country, DestinationType destinationType) {
        this.name = name;
        this.country = country;
        this.destinationType = destinationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }
}
