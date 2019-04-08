package lab3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Pleas, Enter text: ");
        String text = in.nextLine();
        String[] split = text.split("(?<=[?!.])");


    }
}
/**
 * C3 = 2 String
 * C17 = 3 В усіх питальних реченнях заданого тексту знайти та надрукувати без повторень слова заданої довжини.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Введите длину слова:");
        int len_ex_word = scanner.nextInt();
        String[] split = text.split("(?<=[?!.])");

        ArrayList<String> count = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].charAt(split[i].length()-1) == '?') {
                count.add(split[i]);
            }
        }

        String[] question = new String[count.size()];
        question = count.toArray(question);
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
        }

        String[][] quest_word = new String[question.length][];
        for (int i = 0; i < question.length; i++) {
                quest_word[i]=question[i].split(" ");
        }

        for (int i = 0; i < quest_word.length; i++) {
            for (int j = 0; j < quest_word[i].length; j++) {
                if((quest_word[i][j].length() - 1)>=0){
                    char last_char = quest_word[i][j].charAt(quest_word[i][j].length() - 1);
                    if((last_char=='?') || (last_char==',') || (last_char==':') || (last_char==';')){
                        quest_word[i][j]=quest_word[i][j].substring(0,(quest_word[i][j].length() - 1));
                        j=j-1;
                    }
                }
            }
        }

        ArrayList<String> ex_word = new ArrayList<>();
        for (int i = 0; i < quest_word.length ; i++) {
            for (int j = 0; j < quest_word[i].length ; j++){
                if(quest_word[i][j].length() == len_ex_word){
                    ex_word.add(quest_word[i][j]);
                }
            }
        }

        for (int i = 0; i < ex_word.size(); i++) {
            for (int j = i+1; j < ex_word.size() ; j++) {
                if (ex_word.get(i).equals(ex_word.get(j))){
                    ex_word.remove(j);
                    j=j-1;
                }
            }
        }

        for (int i = 0; i < ex_word.size() ; i++) {
            System.out.println(ex_word.get(i));
        }
    }
}*/


/**
public class Plane {
    public static void main(String[] args) {
        String a = ("Это частный вид систем управления сайтом, довольно простой в своём устройстве и функциональности, поскольку почти все действия по структурированию и обработке содержимого делаются пользователями вручную.Работа Википедии и других сайтов Фонда Викимедиа основана на движке MediaWiki.");
        String[] splitStrings = a.split("(\\.)");
        StringBuilder[] splitStrings2=new StringBuilder[splitStrings.length];
        for(int i=0;i<splitStrings.length;i++){
            splitStrings2[i]=new StringBuilder(splitStrings[i]);
        }
        int[] c = new int[splitStrings2.length];
        char s = ' ';
        for (int i = 0; i < splitStrings2.length; i++) {
            int sum = 0;
            for (int j = 0; j < splitStrings2[i].length(); j++) {
                if (splitStrings2[i].charAt(j) == s) {
                    sum++;
                }
            }
            c[i] = sum+1;
        }

        int i = 0;
        int tmp1 = 0;
        while (i < c.length - 1) {
            if (c[i + 1] < c[i]) {
                tmp1 = c[i];
                c[i] = c[i + 1];
                c[i + 1] = tmp1;
                StringBuilder tmp2 = splitStrings2[i];
                splitStrings2[i] = splitStrings2[i + 1];
                splitStrings2[i + 1] = tmp2;
                i = 0;
            } else i++;
        }
        i = 0;
        System.out.println("-----------");
        //вывод слов
        while (i < splitStrings2.length) {
            System.out.println(splitStrings2[i]);
            i++;

        }

    }}*/






