import java.util.Scanner;

class arrayFirst {
    public static void main(String[] args) {
        int i, n;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Print Array");
        for (i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}