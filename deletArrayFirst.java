import java.util.Scanner;

class deletArrayFirst {
    public static void main(String[] args) {
        int i, n, m, v;
        System.out.println("Enter a Size of Array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n - 1];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Insert a Index Number that want to delete");
        m = sc.nextInt();
        for (i = 0; i < a.length; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else {
                b[i - 1] = a[i];
            }
        }

        System.out.println("Print Array");
        for (i = 0; i < n - 1; i++) {
            System.out.print(b[i]);
        }
    }
}