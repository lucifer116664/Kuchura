package KI31.Kuchura.Lab3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Class-driver
 */
public class Lab3 {
    private static String log = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BodyOfWater water = new BodyOfWater();

        while(true) {
            System.out.println("\tMenu:");
            System.out.println("1. Pour toxins into water");
            System.out.println("2. Take new barrel of toxins");

            byte command = scan.nextByte();

            switch (command) {
                case 1 -> water.pourBarrelInTheWater();
                case 2 -> water.takeNewBarrel();
                default -> System.out.println("You`ve entered wrong command.");
            }

            try(PrintWriter printWr = new PrintWriter("src/KI31/Kuchura/Lab3/Log.txt")){
                printWr.print(log);
            }
            catch(FileNotFoundException ex) {
                System.out.println("File not found");
            }

            if (water.waterPlants.getNumber() == 0 && water.fishes.getNumber() == 0) {
                System.out.println("You have exterminated every alive organism in the body of water. Keep it up. Good bye.");
                break;
            }
        }
    }

    /**
     * Add info to log field
     * @param log
     */
    public static void setLog(String log) {
        Lab3.log += log + "\n";
    }
}
