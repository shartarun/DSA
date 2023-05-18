import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        int m, n, i, j;
        System.out.println("Enter m no. of array");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.println("Enter N no. of Array");
        n = sc.nextInt();
        int[][] a = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print Array");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] = " ");
            }
            System.out.println();
        }

    }
}
