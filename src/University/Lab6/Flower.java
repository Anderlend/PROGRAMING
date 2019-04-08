package Lab6;

public class Flower implements Comparable<Flower> {
    int length;
    int fresh;
    int cost;
    String color;

    public int getCost() {
        return cost;
    }

    @Override
    public int compareTo(Flower o) {
        if (this.fresh > o.fresh) {
            return 1;
        } else if (this.fresh < o.fresh) {
            return -1;
        }
        return 0;
    }
}
