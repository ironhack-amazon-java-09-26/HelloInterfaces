package enums;

public class Main {

    static void main() {
        TravelDestination travelDestination = new TravelDestination("Madrid", "Spain", DestinationType.CITY);
        TravelDestination travelDestination2 = new TravelDestination("Milan", "Italy", DestinationType.CITY);
        TravelDestination travelDestination3 = new TravelDestination("Paris", "France", DestinationType.CITY);
        TravelDestination travelDestination1 = new TravelDestination("Aci Trezza", "Italy", DestinationType.BEACH);


        if(travelDestination.getDestinationType() == DestinationType.CITY) {
            // ...
        }


    }
}
