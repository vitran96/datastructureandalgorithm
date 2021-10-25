package JavaBasic;

public class Flower {
    private String name;
    private int pedals;
    private float price;

    public Flower(String name, int pedals, float price) {
        this.name = name;
        this.pedals = pedals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Flower setName(String name) {
        this.name = name;
        return this;
    }

    public int getPedals() {
        return pedals;
    }

    public Flower setPedals(int pedals) {
        this.pedals = pedals;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Flower setPrice(float price) {
        this.price = price;
        return this;
    }
}
