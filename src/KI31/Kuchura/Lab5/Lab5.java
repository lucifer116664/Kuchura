package KI31.Kuchura.Lab5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class-driver
 */
public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try(PrintWriter printW = new PrintWriter("src/KI31/Kuchura/Lab5/result.txt")) {
            System.out.print("Enter x: ");
            double x = scan.nextDouble();
            System.out.println("sin(x)/tg(4x) = " + Count.count(x));
            printW.print(Count.count(x));
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (InputMismatchException ime) {
            System.out.println("You can enter only decimals");
        } catch (IllegalArgumentException iae) {
            System.out.println("sin(x) is divided by zero");
        }
    }
}
