import java.util.Scanner;
public class SeriesSum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int N = sc.nextInt();
        double sum = 0.0;
        for(int i=1;i<=N;i++){
            sum += 1.0/i;
        }
        System.out.println(sum);//System.out.printf("%.6f",sum);
    }
}