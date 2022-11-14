package KI31.Kuchura.Lab3;

/**
 * Describes fishes
 */
public class Fishes {
    int number;

    public Fishes() {
        Lab3.setLog("Fishes()");
        number = 10000;
    }

    /**
     * Get number of fishes
     * @return
     */
    public int getNumber() {
        Lab3.setLog("getNumber()");
        return number;
    }

    /**
     * Set number of fishes 1000 less
     */
    public void setNumber() {
        Lab3.setLog("setNumber()");
        number = number - 1000;
    }
}
