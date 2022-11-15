package KI31.Kuchura.Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Truck<T extends Volume> {
    private List<T> volumes;

    public Truck() {
        volumes = new ArrayList<>();
    }

    public void putInside(T volume) {
        volumes.add(volume);
    }

    public void putAway() {
        if (!volumes.isEmpty()) {
            System.out.println("Enter the number of volume you wanna put away:");
            Scanner scan = new Scanner(System.in);
            showAll();
            try {
                volumes.remove(scan.nextInt() - 1);
            } catch (InputMismatchException ime) {
                System.out.println("You should enter number of thing");
            } catch (IndexOutOfBoundsException iob) {
                System.out.println("No such barrel exists");
            }
        } else
            System.out.println("Truck is empty");
    }

    public void showAll() {
        if (volumes.isEmpty())
            System.out.println("Truck is empty");
        else {
            for (int i = 0; i < volumes.size(); i++) {
                System.out.print(i + 1 + ". ");
                volumes.get(i).showInfo();
            }
        }
    }

    public void showTheCheapestOne() {
        try {
            T mostExpensive = volumes.get(0);
            for (T clothe : volumes) {
                if (clothe.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = clothe;
                }
            }
            if (!volumes.isEmpty())
                System.out.print("The cheapest volume is ");
            mostExpensive.showInfo();
        } catch (IndexOutOfBoundsException iob) {
            System.out.println("Truck is empty");
        }
    }
}
