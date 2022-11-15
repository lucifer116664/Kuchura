package KI31.Kuchura.Lab6;

import KI31.Kuchura.Lab5.Count;

import java.io.*;
import java.util.Scanner;

/**
 * Everything to work with txt and binary files
 */
public class WorkWithFiles {
    private final File txtFile = new File("src/KI31/Kuchura/Lab6/result.txt");
    private final File binaryFile = new File("src/KI31/Kuchura/Lab6/result.bin");

    /**
     * Save result to txt file
     * @param x
     * @throws FileNotFoundException
     */
    public void txtSave(double x) throws FileNotFoundException
    {
        PrintWriter printWr = new PrintWriter(txtFile);
        printWr.print(Count.count(x));
        printWr.close();
    }

    /**
     * Print result from txt file
     * @throws FileNotFoundException
     */
    public void txtShow() throws FileNotFoundException
    {
        Scanner scan = new Scanner(txtFile);
        System.out.println(scan.next() + " - result from .txt file");
        scan.close();
    }

    /**
     * Save result to binary file
     * @param x
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binarySave(double x) throws FileNotFoundException, IOException
    {
        DataOutputStream dtOutput = new DataOutputStream(new FileOutputStream(binaryFile));
        dtOutput.writeDouble(Count.count(x));
        dtOutput.close();
    }


    /**
     * Print result from binary file
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void binaryShow() throws FileNotFoundException, IOException
    {
        DataInputStream dtInput = new DataInputStream(new FileInputStream(binaryFile));
        System.out.println(dtInput.readDouble() + " - result from .bin file");
        dtInput.close();
    }

}
