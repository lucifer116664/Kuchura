package KI31.Kuchura.Lab5;

public class Count {

    /**
     * Counts my variant
     * @param x
     * @return sin(x)/tg(4x)
     * @throws IllegalArgumentException
     */
    public static double count(double x) throws IllegalArgumentException {
        if (Math.tan(4 * x) == 0) {
            throw new IllegalArgumentException();
        }
        else {
            return Math.sin(x)/Math.tan(4 * x);
        }
    }
}
