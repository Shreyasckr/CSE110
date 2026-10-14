import java.util.Scanner;
public class Combination_recursion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total items: ");
        int n = sc.nextInt();
        System.out.print("Items chosen: ");
        int r = sc.nextInt();
        System.out.println(combination(n, r));
    }
    
    public static int combination(int n, int r){
        if(r == 0 || r == n){
            return 1;
        }
        else{
            return (n * combination(n-1, r-1)) / r;
        }
    }
}