package Trening.TicketsOnThePlane;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size =  20;
        int[] places = new  int [size];
        while (true){
            System.out.println("Виберіть клас (1 = економ клас, 2 = бізнес клас, 3 = вивести вільні міся, 4 = завершити покупку білетів):");
            int variant = in.nextInt();
            if (variant==1){
                System.out.println("Виберіть місце з 5 по 20.");
                int place = in.nextInt();
                if (place>=5||place<=20){
                    if (places[place]!=1){
                        places [place] =1;
                        System.out.println("Ваше місця в економ класі під номером " + place);
                    }else{
                        System.out.println("Дане місце зайняте!");
                    }
                }else{
                    System.out.println("Ви ввели некоректне посадочне місце!");
                }
            }
            else if (variant==2){
                System.out.println("Виберіть місце з 1 по 4.");
                int place = in.nextInt();
                if (place>=1||place<=4){
                    if (places[place]!=1){
                        places [place] =1;
                        System.out.println("Ваше місця в бізнес класі під номером " + place);
                    }else{
                        System.out.println("Дане місце зайняте!");
                    }
                }else{
                    System.out.println("Ви ввели некоректне посадочне місце!");
                }
            }
            else if(variant == 3){
                System.out.println("Вільні міця на найближчий рейс: "  );

            }
            else if(variant == 4){
                System.out.println("Сеанс завершено!");
                break;
            }
            else {
                System.out.println("Некоректний вибір! Повторіть спробу!");
            }
        }
        System.out.println("Done!");
    }
}
