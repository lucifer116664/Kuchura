package KI31.Kuchura.Lab4;

public class Sea extends BodyOfWater implements Tourists{

    int numberOfTourists;
    int numberOfSerfers;

    public Sea() {
        super();
        numberOfTourists = 1000;
        numberOfSerfers = 100;
    }

    @Override
    public void pourBarrelInTheWater() {
        setNumberOfSerfers();
        setNumberOfTourists();
        super.pourBarrelInTheWater();
        System.out.println("There also are " + numberOfTourists + " tourists and " + numberOfSerfers + " serfers.");
    }

    @Override
    public void setNumberOfTourists() {
        for (int i = 0; i < barrenVolume/10; i++) {
            if (numberOfTourists == 0)
                break;
            numberOfTourists -= 100;
        }
    }

    @Override
    public void setNumberOfSerfers() {
        for (int i = 0; i < barrenVolume/10; i += 10) {
            if (numberOfSerfers == 0)
                break;
            numberOfSerfers -= 10;
        }
    }

    public int getNumberOfSerfers() {
        return numberOfSerfers;
    }

    public int getNumberOfTourists() {
        return numberOfTourists;
    }

    public int getNumberOfFishes() {
        return numberOfFishes;
    }

    public int getNumberOfWaterPlants() {
        return numberOfWaterPlants;
    }
}
