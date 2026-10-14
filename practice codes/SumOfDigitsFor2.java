import java.util.Scanner;
public class SumOfDigitsFor2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        int sum = 0;
        
        while(N != 0){
            int digit = N % 10;
            sum += digit;
            N = N / 10;
        }
        System.out.println(sum);
    }
}