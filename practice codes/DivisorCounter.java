import java.util.Scanner;
public class DivisorCounter{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int num = 1; num <= N; num++){
            int divisor = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    divisor++;
                }
            }
            System.out.println(num + " has " + divisor);
        }
    }
}