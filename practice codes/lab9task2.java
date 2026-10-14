import java.util.Scanner;
public class lab9task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseDigit(n);
    }
    
    public static void reverseDigit(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n%10);
            reverseDigit(n/10);
        }
    }
}