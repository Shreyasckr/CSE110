import java.util.Scanner;
public class LtoRdigit{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int tempN = N;
        while(tempN>0){
            count++;
            tempN /= 10;
        }
        int divisor = 1;
        for(int i = 1; i < count; i++){
            divisor *= 10;
        }
        for(int i = 1; i <= count; i++){
            int digit = N / divisor;
            System.out.print(digit+ " ");
            N = N % divisor;
            divisor /= 10;
        }
    }
}