import java.util.Scanner;
public class recursivePrintintRev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        printHobbe(n);
    }
    
    public static void printHobbe(int n){
        if(n == 1){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            printHobbe(n-1);
        }
    }
}