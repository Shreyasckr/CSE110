import java.util.Scanner;
public class ATtab4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int division = 0;
        int temp = a;
        while(temp >= b){
            temp = temp - b;
            division = division + 1;
        }
        int remainder = temp;
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(a + " % " + b + " = " + remainder);
    }
}