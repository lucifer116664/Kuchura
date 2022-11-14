package KI31.Kuchura.Lab3;

/**
 * Describes barrel of toxins
 */
public class BarrelOfToxins {
    private int volume;

    public BarrelOfToxins() {
        Lab3.setLog("BarrelOfToxines()");
        volume = 10;
    }

    /**
     * Set volume of barrel
     * @param volume
     */
    public void setVolume(int volume) {
        Lab3.setLog("setVolume(int volume)");
        this.volume = volume;
    }

    /**
     * Get volume of barrel
     * @return
     */
    public int getVolume() {
        Lab3.setLog("getVolume()");
        return volume;
    }

    /**
     * Make barrel empty
     */
    public void pour() {
        Lab3.setLog("pour()");
        volume = 0;
    }
}
