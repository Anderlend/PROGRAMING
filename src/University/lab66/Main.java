package lab66;

public class Main {
    public static void main(String[] args) {
        Furgon furgon= new Furgon(3);
        furgon.add(new Grounded(32, 62,45,9999));
        furgon.add(new Soluble_in_jars(85,95,78,5468));
        furgon.add(new Grounded(75,24,75,8000));
        System.out.println(furgon);
        furgon.sortBy();
        System.out.println(furgon);
        System.out.println("_________________________");
        furgon.findProposition(23,67);


    }
}
