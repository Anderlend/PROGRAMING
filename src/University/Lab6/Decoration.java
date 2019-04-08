package Lab6;

public class Decoration {
    String name;
    int cost;

    public Decoration(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " " + cost;

    }
}
