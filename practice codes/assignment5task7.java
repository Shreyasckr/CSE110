import java.util.Scanner;
public class assignment5task7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i-=2){
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=3;i<=n;i+=2){
            for(int j=0;j<(n-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ 
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

