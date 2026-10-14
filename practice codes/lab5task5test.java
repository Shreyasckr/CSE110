import java.util.Scanner;
public class lab5task5test{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(k%10==0){
                continue;
                }
                else if(k>10){
                    int l = k-10;
                    System.out.print(l);
                }
                else{
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}