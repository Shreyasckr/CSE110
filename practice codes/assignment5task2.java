import java.util.Scanner;
public class assignment5task2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.println(n);
            }
            else if(i==n){
                for(int k=1;k<=n;k++){
                    System.out.print(k);
                }
                System.out.println();
            }
            else{
                System.out.print(n-i+1);
                for(int k=1;k<=i-2;k++){
                    System.out.print(" ");
                }
                System.out.println(n);
            }
        }
    }
}