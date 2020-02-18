package part1.task2;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        System.out.println("ВВедите размерность");
        System.out.println("ВВедите количество строк в матрице:");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("ВВедите количество столбцов в матрице:");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ВВедите элемент a[" + (i + 1) + "]["+(j+1)+"]: ");
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + (i + 1) + "]["+(j+1)+"]= " + arr[i][j]);
            }
        }
    }
}
