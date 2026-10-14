import java.util.Scanner;
public class quiz4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        divCheck(a, b);
    }
    
    public static void divCheck(int a, int b){
        if(a==b){
            if(a%5==0){
                System.out.print(a);
            }
            else{
                return;
            }
        }
        else{
            if(a%5==0){
                System.out.print(a+" ");
            }
            divCheck(a+1,b);
        }
    }
}