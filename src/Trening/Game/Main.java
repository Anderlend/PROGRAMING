package Trening.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Якщо бажаєте зіграти, натисніть 1, якщо ні , то натисніть 0.");
        int BANK = 100;
        Scanner in = new Scanner(System.in);
        int variant = in.nextInt();
        if (variant == 1) {
            System.out.print("Ваш BANK складає 100. Ведіть вашу ставку - ");
            int rate = in.nextInt();
            int secondDice = ((int) (Math.random() * 5) + 1);
            int firstDice = ((int) (Math.random() * 5) + 1);
            int firstSumma = firstDice + secondDice;
            System.out.println("Сума гральних кісток: " + firstSumma + '.');
            if (firstSumma == 7 || firstSumma == 11) {
                System.out.println("Ви виграли!");
            } else if (firstSumma == 2 || firstSumma == 3 || firstSumma == 12) {
                System.out.println("Крепс! Ви ПРОГРАЛИ! BANK виграв!");
            } else {
                while (true) {
                    System.out.println("Ваш BANK складає - " + BANK+ "\nВИ бажаєте продовжити гру? Якщо так, то натисніть 1." );
                    int variant1 = in.nextInt();
                    if (variant1 == 1) {
                        System.out.print("Ваш BANK складає 100. Ведіть вашу ставку - ");
                        int rate1 = in.nextInt();
                        BANK += rate1;
                        int secondDiceS = ((int) (Math.random() * 5) + 1);
                        int firstDiceS = ((int) (Math.random() * 5) + 1);
                        int summa = firstDiceS + secondDiceS;
                        System.out.println("Сума гральних кісток: " + summa + '.');
                        System.out.println("Ваш Банк складає: " + BANK + '.');
                        if (summa == firstSumma) {
                            System.out.println("Ви виграли!");
                            break;
                        } else if (summa == 7) {
                            System.out.println("Ви ПРОГРАЛИ!");
                            break;
                        }
                    }
                }
                if (variant == 0) {
                    System.out.println("Ви не бажаєте грати в Гру!");
                } else {
                    System.out.println("Введіть правильний варіант!");
                }
            }

        }
    }
}