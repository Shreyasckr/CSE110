import java.util.Scanner;
public class lab5task6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=1;i<=x;i++){
            if(i==1 || i==x) {
                for (int j= 1;j<=y;j++)
                    System.out.print(j);
            } 
            else{
                System.out.print(1);
                for (int k = 1; k <=y - 2; k++) 
                    System.out.print(" ");
                if (y >= 2) 
                    System.out.print(y);
            }
            System.out.println();
        }
    }
}
