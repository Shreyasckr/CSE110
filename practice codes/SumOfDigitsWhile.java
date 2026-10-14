import java.util.Scanner;
public class SumOfDigitsWhile{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=10;i++){
            if(N==0){
                break;
            }
            else{
                int digit = N%10;
                sum += digit;
                N = N / 10;
            }
        }
        System.out.println(sum);
    }
}