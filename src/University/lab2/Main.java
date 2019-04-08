package lab2;
/**
 * C5 = 4 Множення
 * C7 = 4 тип елементів матриці long
 * C11 = 3	Обчислити суму найбільших елементів кожного рядка матриці
 * */
public class Main {
    public static void main(String[] args) {
        long MatrixA[][] = {{1, 9, 11},
                {8, 2, 10},
                {3, 3, 3}};
        long MatrixB[][] = {{7, 8, 3},
                {2, 9, 2},
                {2, 1, 1}};
        int m = MatrixA.length;
        int n = MatrixB[0].length;

        int[][] MultipliedMatrix = new int[m][n];
        int i = 0;
        int j = 0;
        for (i=0; i < m; i++) {
            for (j=0; j < n; j++) {
                MultipliedMatrix[i][j] += MatrixA[i][j] * MatrixB[j][i];
            }
        }
        for (i=0; i < MultipliedMatrix.length; i++) {
            for (j=0; j < MultipliedMatrix[0].length; j++) {
                System.out.format("%6d ", MultipliedMatrix[i][j]);
            }
            System.out.println();
        }

        long max;
        long S = 0;
        for (i = 0; i < MultipliedMatrix.length; i++) {
                max = MultipliedMatrix[i][0];
            for (j = 1; j < MultipliedMatrix[i].length; j++) {
                if (max < MultipliedMatrix[i][j]) {
                    max = MultipliedMatrix[i][j];
                }
            }
            System.out.println(max);
            S += max;

        }
        System.out.println("Сума Максимальних елементів:" + S);
    }
}

