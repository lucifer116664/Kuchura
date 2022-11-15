package KI31.Kuchura.Lab4;

import java.util.Scanner;

/**
 * Describes body of water
 */
public abstract class BodyOfWater {
    private Scanner scan = new Scanner(System.in);

    protected int numberOfFishes;
    protected int numberOfWaterPlants;
    protected int barrelCapacity;

    public BodyOfWater() {
        numberOfFishes = 10000;
        numberOfWaterPlants = 10000;
        barrelCapacity = 10;
    }

    /**
     * Pours toxins in the water
     */
    public void pourBarrelInTheWater() {
        if (barrelCapacity == 0) {
            System.out.println("You can`t pour toxins, the barrel is empty.");
        }
        else {
            int howManyToxins = barrelCapacity / 10;
            barrelCapacity = 0;
            for (int i = 0; i < howManyToxins; i++) {
                if (numberOfWaterPlants == 0)
                    break;
                numberOfWaterPlants -= 1000;
            }
            for (int i = 0; i < howManyToxins; i++) {
                if (numberOfFishes == 0)
                    break;
                numberOfFishes -= 1000;
            }
            System.out.println("After pouring toxins in the body of water, there left:");
            showNumberOfAlive();
        }
    }

    /**
     * Shows how many organism are still alive
     */
    public void showNumberOfAlive() {
        System.out.println("\t" + numberOfFishes + " alive fishes and " + numberOfWaterPlants + " alive water plants.");
    }

    /**
     * Set volume of barrel
     */
    public void takeNewBarrel() {
        System.out.println("Choose the volume of new barrel:");
        barrelCapacity = scan.nextInt();
    }
}
