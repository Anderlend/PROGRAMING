package Trening;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibanachi {
    public static void main(String[] args) {
        System.out.println("Enter the order of the fibonacci number: ");
        Scanner in = new Scanner(System.in);
        int order = in.nextInt();
        int a = 0;
        int b = 1;
        int namberFibanachi;
        int[] massiv = new int[order];

        ArrayList<Double> nambFibanachi = new ArrayList<Double>();
        for (int i = 0; i < order; i++) {
            if(i<2){
                nambFibanachi.add((double) i);
            }
            else{
                nambFibanachi.add((nambFibanachi.get(i - 1) +nambFibanachi.get(i-2)));
            }

        }
        for (int i = 0; i < order ; i++) {
            System.out.println(nambFibanachi.get(i));

        }
    }
}
