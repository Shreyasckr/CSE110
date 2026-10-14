import java.util.Scanner;
public class assignment03_task5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N-digit vault code: ");
        int code = sc.nextInt();
        int n = 0;
        int temp = code;
        while(temp > 0){
            n++;
            temp = temp / 10;
        }
        int divider = 1;
        while (n > 1){
            divider *= 10;
            n--;
        }
        while (divider > 0){
            int digit = code / divider;
            System.out.print(digit);
            code %= divider;
            divider = divider / 10;
            if (divider > 0) {
                System.out.print(", ");
            }
        }
    }
}