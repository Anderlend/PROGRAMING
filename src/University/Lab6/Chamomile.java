package Lab6;

public class Chamomile extends Flower {
    String name;

    public Chamomile(String name, String color, int length, int fresh, int cost) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.fresh = fresh;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " " + color + " " + length + " " + fresh + " " + cost;
    }
}
