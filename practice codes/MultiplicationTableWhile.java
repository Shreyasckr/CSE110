import java.util.Scanner;
public class MultiplicationTableWhile{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = sc.nextInt();
        int i = 1;
        while(i<=10){
            int sum = N * i;
            System.out.println(N + " x " + i + " = " + sum );
            i++;
        }
    }
}