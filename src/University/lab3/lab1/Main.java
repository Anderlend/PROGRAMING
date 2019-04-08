package lab1;
/**
 * C2 = 1 O1 = "-"
 * C3 = 2 C = 2
 * C5 = 4 O2 = "-"
 * C7 = 5 тип індексів i та j = float

public class Main {
    public static void main(String[] args) {

        float S = 0;
        int a = 1;
        int n = 20;
        int b = 10;
        int m = 20;
        final int c = 2;
        int ind = 0;



        /*for(int i = a;i < n; i++){
            if((i-c)==0){
                ind=1;
            }
        }
        if(ind == 1){
            System.out.println("Перевірте свої значення");
        }
        /*else {

        for (int i = a; i < n; i++) {
            for (int j = b; j < m; j++) {

                    S += (float) (i - j) / (i - c);
                }
            }
            System.out.println(S);
       // }
    }
}


public class Main {
    public static void main(String[] args) {
//        String a = ("Это частный вид систем управления сайтом, довольно простой в своём устройстве и функциональности, поскольку почти все действия по структурированию и обработке содержимого делаются пользователями вручную.Работа Википедии и других сайтов Фонда Викимедиа основана на движке MediaWiki.");
        String a = ("Это частный. Работа.");
        String[] splitStrings = a.split("(\\. )|(\\.)");
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
        while (i < splitStrings2.length) {
            System.out.println(splitStrings2[i]);
            i++;

        }

    }
}
*/

/**
 * C3 = 2 String
 * C17 = 3 В усіх питальних реченнях заданого тексту знайти та надрукувати без повторень слова заданої довжини.*/

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mother");
        StringBuilder stringBuilder2 = new StringBuilder("mother");
        System.out.println(stringBuilder.equals(stringBuilder2));
        System.out.println(stringBuilder == stringBuilder2);

        String string = new String("mother ");
        String string2 = "mother  ";
        System.out.println(string.equals(string2));
        System.out.println(string.equalsIgnoreCase(string2));
        System.out.println(string == string2);
        System.out.println(string.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(string.length());

        String[] splitStrings = "Привет. Я здесь.".split("(\\. )|\\.");
        for (int i = 0; i < splitStrings.length; i++) {
            System.out.println(splitStrings[i]);
            System.out.println(splitStrings[i].length());
        }



        /*int a[] = {1, 2, 3, 4, 5};
        int[] a = new int[] {1, 2, 3, 4, 5};*/
        stringBuilder.append("Papa mama brother");
        System.out.println(stringBuilder.charAt(1));
        System.out.println(stringBuilder.indexOf(" ", 5));
        System.out.println(stringBuilder);
        stringBuilder.delete(0, 2);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();

        // Aaaa a. B a a. B a.
        // Папа мама --- Паа маа

    }
}

