package KI31.Kuchura.Lab7;

public abstract class Volume {
    protected int price;
    protected int capacity;
    protected String content;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPrice() {
        return price;
    }

    public abstract void showInfo();
}
