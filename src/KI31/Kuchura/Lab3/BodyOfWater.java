package KI31.Kuchura.Lab3;

import java.util.Scanner;

/**
 * Describes body of water
 */
public class BodyOfWater {
    Fishes fishes = new Fishes();
    WaterPlants waterPlants = new WaterPlants();
    BarrelOfToxins barrelOfToxins = new BarrelOfToxins();

    /**
     * Pours toxins in the water
     */
    public void pourBarrelInTheWater() {
        Lab3.setLog("pourBarrelInTheWater()");
        if (barrelOfToxins.getCapacity() == 0) {
            System.out.println("You can`t pour toxins, the barrel is empty.");
        }
        else {
            int howManyToxins = barrelOfToxins.getCapacity() / 10;
            barrelOfToxins.pour();
            for (int i = 0; i < howManyToxins; i++) {
                if (waterPlants.getNumber() == 0)
                    break;
                waterPlants.setNumber();
            }
            for (int i = 0; i < howManyToxins; i++) {
                if (fishes.getNumber() == 0)
                    break;
                fishes.setNumber();
            }
            System.out.println("After pouring toxins in the body of water, there left:");
            showNumberOfAlive();
        }
    }

    /**
     * Shows how many organism are still alive
     */
    public void showNumberOfAlive() {
        Lab3.setLog("showNumberOfAlive()");
        System.out.println("\t" + fishes.getNumber() + " alive fishes and " + waterPlants.getNumber() + " alive water plants.");
    }

    /**
     * Set volume of barrel
     */
    public void takeNewBarrel() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the volume of new barrel:");
        barrelOfToxins.setCapacity(scan.nextInt());
    }
}
