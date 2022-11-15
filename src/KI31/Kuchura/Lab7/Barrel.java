package KI31.Kuchura.Lab7;

public class Barrel extends Volume{
    private final String type = "Barrel";

    public Barrel() {
        capacity = 10;

        switch ((int)(Math.random() * 3)) {
            case 0 -> {
                content = "beer";
                price = 1300;
            }
            case 1 -> {
                content = "wine";
                price = 1700;
            }
            case 2 -> {
                content = "pepsi";
                price = 800;
            }
        }
    }

    @Override
    public void showInfo() {
        System.out.println(type + ", capacity - " + capacity + ", content - " + content + ", price - " + price);
    }
}
