package KI31.Kuchura.Lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class-driver
 */
public class Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WorkWithFiles files = new WorkWithFiles();

        try{
            System.out.print("Enter x: ");
            double x = scan.nextDouble();
            files.txtSave(x);
            files.binarySave(x);
            files.txtShow();
            files.binaryShow();
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (InputMismatchException ime) {
            System.out.println("You can enter only decimals");
        } catch (IllegalArgumentException iae) {
            System.out.println("sin(x) is divided by zero");
        } catch (IOException ioe) {
            System.out.println("Problem with data input or data output");
        }
    }
}
