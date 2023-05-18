import java.util.Scanner;

class insertArrayFirst {
    public static void main(String[] args) {
        int i, n, m, v;
        System.out.println("Enter a Size of Array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Insert a Index Number");
        m = sc.nextInt();
        System.out.println("Enter a Index Number Value");
        v = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n + 1];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = v;
            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.println("Print Array");
        for (i = 0; i < n + 1; i++) {
            System.out.print(b[i]);
        }
    }
}