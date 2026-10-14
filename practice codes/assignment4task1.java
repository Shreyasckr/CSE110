import java.util.Scanner;
public class assignment4task1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            int temp = i;
            int digits = 0;
            while(temp != 0){
                digits++;
                temp /= 10;
            }
            temp = i;
            int sum = 0;
            while(temp != 0){
                int digit = temp % 10;
                int power = 1;
                for(int j=1;j<=digits;j++){
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
