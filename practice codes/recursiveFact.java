import java.util.Scanner;
public class recursiveFact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factR(n));  
    }
    
    public static int factR(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factR(n-1);
        }
    }
}