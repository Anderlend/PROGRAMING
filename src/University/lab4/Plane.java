package lab4;

public class Plane {
    private String name;
    private int weight;
    private int number_of_passengers;
    private int cruising_altitude;
    private int cruising_speed;

    public Plane (String n, int w, int np, int ca, int cs){
        name = n;
        weight = w;
        number_of_passengers = np;
        cruising_altitude = ca;
        cruising_speed = cs;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Назва літака: " + name + "; Вага літака: " + weight + "; Максимальна кількість пасажирів літака: " + number_of_passengers + "; Крейсерська висота: " + cruising_altitude + "; Крейсерська швидкість: " + cruising_speed +".";
    }
}