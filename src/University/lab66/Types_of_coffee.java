package lab66;

public class Types_of_coffee {
    private int coffePricePerKilogram;
    private int coffeQuality;
    private int cofeeVolume;
    private int sumCoffe;


    public Types_of_coffee(int cofeePrice, int coffeQuality,int cofeeVolume,int sumCoffe) {
        this.coffePricePerKilogram = cofeePrice;
        this.coffeQuality = coffeQuality;
        this.cofeeVolume = cofeeVolume;
        this.sumCoffe=sumCoffe;
    }

    public int getCoffeQuality() {
        return coffeQuality;

    }
    public int Cost(){
        return Math.round(sumCoffe/coffePricePerKilogram);
    }
    @Override
    public String toString(){
        return getClass().getSimpleName()+"{"+ "coffePricePerKilogram:"+coffePricePerKilogram+","+ "CoffeQuality:"+coffeQuality+","+ "CoffeVolume:"+cofeeVolume+" "+"QuantityPerKiligrams"+":"+Cost()+"}";
    }

}