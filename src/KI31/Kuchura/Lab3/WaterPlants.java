package KI31.Kuchura.Lab3;

/**
 * Describes water plants
 */
public class WaterPlants {
    int number;

    public WaterPlants() {
        Lab3.setLog("WaterPlants()");
        number = 10000;
    }

    /**
     * Get number of water plants
     * @return
     */
    public int getNumber() {
        Lab3.setLog("getNumber()");
        return number;
    }

    /**
     * Set number of water plants 1000 less
     */
    public void setNumber() {
        Lab3.setLog("setNumber()");
        number = number-1000;
    }
}
