package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public ArrayList<Airplane> add(Airplane airplane){
        this.airplaneList.add(airplane);
        return this.airplaneList;
    }

    public void displayAllAirplanes() {
        // add code
        for (Airplane a : airplaneList){
            System.out.println("ID of Airplane : " + a.getId() + ", Type of Airplane : " + a.getType());
        }
    }

    public void displayAllPassengerAirplanes() {
        // add code
        for (Airplane a : airplaneList){
        }
    }

    //  write method getAllCargoAirplanes()


    // write  addPassengerNameToAirplane( airplaneId, passengerName)


    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane){
        for(Airplane a : airplaneList){
            if(a.getId() == plane.getId()){
                return true;
            }
        }
        return false;
    }


    // write findAirplaneByPassengerName( passengerName )
//    public Airplane findAirplaneByPassengerName(String passengerName){
//        for(Airplane a : airplaneList){
//            if()
//        }
//    }

    // write displayAllAirplanesInOrderOfType( argument )


} // end of AirplaneManager


