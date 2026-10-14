import java.util.Scanner;
public class assignment5task3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print("1");
            }
            else if(i==n){
                for(int a=1;a<=2*n-1;a++){
                    System.out.print(a);
                }
            }
            else{
                System.out.print("1");
                for(int k=1;k<=2*i-3;k++){
                    System.out.print(" ");
                }
                System.out.print(2*i - 1);
            }
            System.out.println();
        }
    }
}