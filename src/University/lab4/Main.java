package lab4;
import java.util.Comparator;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {

        Plane[] parameters = new Plane[5];
        parameters[0] = new Plane("Боінг", 10000, 5000, 500, 400);
        parameters[1] = new Plane("Воінг", 9000, 4000, 400, 300);
        parameters[2] = new Plane("Хоінг", 9100, 4400, 460, 370);
        parameters[3] = new Plane("Роінг", 9090, 4900, 480, 380);
        parameters[4] = new Plane("Гоінг", 8000, 3000, 300, 200);
        Arrays.sort(parameters,Comparator.comparing(Plane::getName));
        for (Plane parameter : parameters) {
            System.out.println(parameter);

        }

        System.out.println("ВТОРОЙ РЯД*************");
        Arrays.sort(parameters,Comparator.comparing(Plane::getWeight).reversed());
        for (Plane parameter : parameters) {
            System.out.println(parameter);


        }


    }
    }
