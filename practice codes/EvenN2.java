import java.util.Scanner;
public class EvenN2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int N = sc.nextInt();
        for(int i=2;i<=N;i+=2){
            System.out.print(i + " ");
        }
    }
}