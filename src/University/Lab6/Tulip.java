package Lab6;

public class Tulip extends Flower{
    String name;

    public Tulip(String name, String color, int length, int fresh, int cost) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.fresh = fresh;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return "I love tulips!" + name + " " + color + " " + length + " " + fresh + " "+ cost;
    }
}
