import java.util.Scanner;
public class assignment9task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }
    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}