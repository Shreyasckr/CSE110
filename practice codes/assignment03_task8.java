import java.util.Scanner;
public class assignment03_task8{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = sc.nextInt();
        int p = 0;
        int n = 0;
        for(int i = 1; i <= N; i++){
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if(num >= 0){
                p++;
            } 
            else{
                n++;
            }
        }
        System.out.println(p + " Non-negative Numbers");
        System.out.println(n + " Negative Numbers");
    }
}