package KI31.Kuchura.Lab7;

public class Box extends Volume{
    private final String type = "Box";

    public Box() {
        capacity = 15;

        switch ((int)(Math.random() * 3)) {
            case 0 -> {
                content = "snickers";
                price = 1100;
            }
            case 1 -> {
                content = "croissants";
                price = 1600;
            }
            case 2 -> {
                content = "toilet paper";
                price = 100;
            }
        }
    }

    @Override
    public void showInfo() {
        System.out.println(type + ", capacity - " + capacity + ", content - " + content + ", price - " + price);
    }
}
