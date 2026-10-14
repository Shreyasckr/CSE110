import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int first = 0;
        int second = 1;
        System.out.print(first+", "+second+", ");
        for(int i=0;i<N-2;i++){
            sum = first + second;
            System.out.print(sum + ", ");
            first = second;
            second = sum;
        }
    }
}