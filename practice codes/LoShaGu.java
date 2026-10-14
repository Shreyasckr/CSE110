import java.util.Scanner;
public class LoShaGu{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        int k = 0;
        if(x>y){
            k = x;
        }
        else{
             k = y;
        }
        while(k % x != 0 || k % y != 0){
            k++;
        }
        System.out.println(k);
    }
}