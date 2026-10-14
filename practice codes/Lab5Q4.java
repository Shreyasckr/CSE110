import java.util.Scanner;
public class Lab5Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int start = n - i + 1;
            // leading spaces
            for (int s = 1; s <= start - 1; s++) {
                System.out.print(" ");
            }
            // numbers from start..n
            for (int num = start; num <= n; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
