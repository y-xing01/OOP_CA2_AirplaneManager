package dkit.oop;

public class CargoAirplane extends Airplane {

    // fields (ref. Q1)
    private int MAX_LOAD_KILOS;
    private int currentLoad;

    // constructor
    CargoAirplane(String type, int MAX_LOAD_KILOS) {
        super(type);

        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }

    CargoAirplane(String type, int MAX_LOAD_KILOS, int currentLoad) {
        super(type);

        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
        this.currentLoad = currentLoad;
    }

    // toString()
    @Override
    public String toString() {
        return "CargoAirplane{" +
                super.toString() +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                '}';
    }


} // END of CargoAirplane class.

