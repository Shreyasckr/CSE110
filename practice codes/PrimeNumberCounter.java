import java.util.Scanner;
public class PrimeNumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int num = 2; num <= N; num++) {
            int divisor = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 0) {
                System.out.println(num + " is a prime number");
            }
        }
    }
}