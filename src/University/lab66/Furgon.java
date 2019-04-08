package lab66;
import java.util.Arrays;
import java.util.Comparator;
public class Furgon {
    private Types_of_coffee[] coffe;
    private int count;

    public Furgon(int size) {
        coffe = new Types_of_coffee[size];

    }

    public  void add(Types_of_coffee types_of_coffee) {
            coffe[count++] = types_of_coffee;
        }
    public void sortBy(){
       Arrays.sort(coffe, Comparator.comparing(Types_of_coffee::getCoffeQuality));
   }
    public void findProposition(int minQaluity,int maxQality) {

        for (int i = 0; i < coffe.length; i++) {
            if (coffe[i].getCoffeQuality() <= maxQality && coffe[i].getCoffeQuality() >= minQaluity) {
                System.out.println(coffe[i]);

            }
        }

       }
    @Override
    public String toString() {
        return Arrays.toString(coffe).replace("[","").replace("]","");
    }
}
