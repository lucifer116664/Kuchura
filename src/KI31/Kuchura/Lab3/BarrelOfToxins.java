package KI31.Kuchura.Lab3;

/**
 * Describes barrel of toxins
 */
public class BarrelOfToxins {
    private int capacity;

    public BarrelOfToxins() {
        Lab3.setLog("BarrelOfToxines()");
        capacity = 10;
    }

    /**
     * Set volume of barrel
     * @param volume
     */
    public void setCapacity(int volume) {
        Lab3.setLog("setVolume(int volume)");
        this.capacity = volume;
    }

    /**
     * Get volume of barrel
     * @return volume
     */
    public int getCapacity() {
        Lab3.setLog("getVolume()");
        return capacity;
    }

    /**
     * Make barrel empty
     */
    public void pour() {
        Lab3.setLog("pour()");
        capacity = 0;
    }
}
