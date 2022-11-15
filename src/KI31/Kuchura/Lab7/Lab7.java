package KI31.Kuchura.Lab7;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Truck<Volume> truck = new Truck<>();
        String command;
        boolean makeNextLoop = true;

        while (makeNextLoop) {
            System.out.println("\tMenu:");
            System.out.println("1 - Put new volume into the truck");
            System.out.println("2 - Put something out the truck");
            System.out.println("3 - Show everything in truck");
            System.out.println("4 - Show cheapest volume");
            System.out.println("0 - Quit");

            command = sc.next();

            switch (command) {
                case "1" -> {
                    System.out.println("What do you want to put inside?");
                    System.out.println("1 - Barrel");
                    System.out.println("2 - Box");
                    System.out.println("0 - Go back");
                    switch (sc.next()) {
                        case "1" -> truck.putInside(new Barrel());
                        case "2" -> truck.putInside(new Box());
                        case "0" -> System.out.println();
                        default -> System.out.println("You have entered wrong command");
                    }
                }
                case "2" -> truck.putAway();
                case "3" -> truck.showAll();
                case "4" -> truck.showTheCheapestOne();
                case "0" -> makeNextLoop = false;
                default -> System.out.println("You have entered wrong command");
            }
        }
        System.out.println("Good bye!");
    }
}
