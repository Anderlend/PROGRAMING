package Lab6;

import java.util.Arrays;

public class Bouquet {
    Flower[] flowers;
    int countFlower = 0;
    Decoration[] decorations;
    int countDecoration = 0;

    public Bouquet(int namberOfFlower, int namberOfDecoration) {
        flowers = new Flower[namberOfFlower];
        decorations = new Decoration[namberOfDecoration];
    }

    public void addFlower(Flower flower) {
        flowers[countFlower] = flower;
        countFlower++;
    }

    public void addDecoration(Decoration decoration) {
        decorations[countDecoration] = decoration;
        countDecoration++;
    }

    public void costBouquet() {
        int costFlower = 0, costDecoretion = 0;
        for (int i = 0; i < flowers.length; i++) {
            costFlower += flowers[i].getCost();
        }
        for (int i = 0; i < decorations.length; i++) {
            costDecoretion += decorations[i].getCost();
        }
        System.out.println("Вартість квітів " + costFlower);
        System.out.println("Вартість прикрас " + costDecoretion);
        System.out.println("Вартість букета " + (costFlower + costDecoretion));
    }

    public void lengthWithRange(int minLength, int maxLengt) {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].length > minLength && flowers[i].length < maxLengt) {
                System.out.println(flowers[i]);
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(flowers) + " " + Arrays.toString(decorations);
    }

    public void sort() {
        Arrays.sort(flowers);
    }
}
