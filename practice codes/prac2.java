//32456 dile ashbe 3 2 4 5 6
import java.util.Scanner;
public class prac2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digit = 0;
        for(temp = n;temp>0;temp=temp/10){
            digit++;
        }
        int div = 1;
        for(int i = 1; i < digit; i++) {
            div = div * 10;
        }
        temp = n;
        for(; div > 0; div = div / 10) { 
            int currentDigit = temp / div;  
            temp = temp % div;              
            System.out.print(currentDigit+"...");
        }
    }
}