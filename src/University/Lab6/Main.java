package Lab6;

public class Main {
    public static void main(String[] args) {
        int namberOfFlowers = 5;
        int namberOfDecoration = 1;
        int minLength = 2, maxLength = 7;
        Bouquet bouquet = new Bouquet(namberOfFlowers, namberOfDecoration);
        Rose rose0 = new Rose("first", "read", 10, 1, 10);
        Rose rose1 = new Rose("second", "blue", 6, 7, 4);
        Chamomile chamomile0 = new Chamomile("asd", "ghj", 8, 4, 8);
        Chamomile chamomile1 = new Chamomile("bnm", "rtu", 5, 2, 3);
        Tulip tulip0 = new Tulip("rty", "red", 2, 8, 7);
        Decoration decoration0 = new Decoration("ert", 5);
        bouquet.addFlower(rose0);
        bouquet.addFlower(rose1);
        bouquet.addFlower(chamomile0);
        bouquet.addFlower(chamomile1);
        bouquet.addFlower(tulip0);
        bouquet.addDecoration(decoration0);
        System.out.println(bouquet);
        bouquet.costBouquet();
        bouquet.sort();
        System.out.println(bouquet);
        bouquet.lengthWithRange(minLength, maxLength);


    }
}
