import java.util.Comparator;

public class Animal {
    private String name;
    private int weight;
    private int height;
    private int topSpeed;

    public Animal(String name, int weight, int height, int topSpeed) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() { return name + " " + topSpeed; }
}
