import java.util.Scanner;
public class Lab5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int s = 1; s <= n - i; s++) System.out.print("0");
            // numbers 1 .. (2*i - 1)
            for (int num = 1; num <= 2 * i - 1; num++) System.out.print(num);
            System.out.println();
        }
    }
}
