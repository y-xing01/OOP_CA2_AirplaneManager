package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    private int MAX_NUM_PASSENGERS;
    ArrayList<String> passengersList = new ArrayList<>();

    PassengerAirplane(String type, int MAX_NUM_PASSENGERS) {
        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = MAX_NUM_PASSENGERS;
    }

    public void addPassenger(String name) {
        // code here
        if(this.passengersList.size() < this.MAX_NUM_PASSENGERS){
            this.passengersList.add(name);
        }
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                super.toString() +
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengersList=" + passengersList +
                '}';
    }
} // end of PassengerAirplane
