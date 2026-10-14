import java.util.Scanner;
public class digitcount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        int digit = 0;
        for(;N>0;N/=10){
            digit++;
        }
        System.out.println("Total Digit = " + digit);
    }
}