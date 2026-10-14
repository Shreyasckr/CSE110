import java.util.Scanner;
public class lab9task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sumDigits(n);
        System.out.println(x);
    }
    
    public static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10) + sumDigits(n/10);
        }
    }
}