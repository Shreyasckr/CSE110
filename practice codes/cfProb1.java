import java.util.Scanner;
public class cfProb1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = n/2;
        if(m%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}