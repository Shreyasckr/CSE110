import java.util.Scanner;
public class GoShaGu{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        int k;
        if (x < y){
            k = x;
        }
        else{
            k = y;
        }
        while (x % k != 0 || y % k != 0) {
            k--;
        }
        System.out.println(k);
    }
}