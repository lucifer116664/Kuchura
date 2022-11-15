package KI31.Kuchura.Lab4;

import java.util.Scanner;

/**
 * Class-driver
 */
public class Lab4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Sea sea = new Sea();

        while(true) {
            System.out.println("\tMenu:");
            System.out.println("1. Pour toxins into water");
            System.out.println("2. Take new barrel of toxins");

            byte command = scan.nextByte();

            switch (command) {
                case 1 -> sea.pourBarrelInTheWater();
                case 2 -> sea.takeNewBarrel();
                default -> System.out.println("You`ve entered wrong command.");
            }

            if (sea.getNumberOfWaterPlants() == 0 && sea.getNumberOfFishes() == 0 && sea.getNumberOfTourists() == 0 && sea.getNumberOfSerfers() == 0) {
                System.out.println("You have exterminated every alive organism in the body of water, and people run away. Keep it up. Good bye.");
                break;
            }
        }
    }
}
