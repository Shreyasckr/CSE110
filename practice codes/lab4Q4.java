import java.util.Scanner;
public class lab4Q4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Weeks, W: ");
        int w = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=w;i++){
            for(int j=1;j<=i;j++){
                sum -= j;
            }
        }
        System.out.println("STRL = " + sum);
    }
}