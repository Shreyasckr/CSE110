import java.util.Scanner;
public class Question7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour(H): ");
        int H = sc.nextInt();
        System.out.print("Enter Water Unit(W): ");
        int W = sc.nextInt();
        int h;
        for(h = 1; h <= H; h++){
            if(h % 2 == 0){
                W -= 5*4;
            }
            else{
                W -= 5*3;
            }
            if(W < 0){
                System.out.println("Stopped at Hour " + h);
                break;
            }
        }
        if(h > H){
            System.out.println("All watered");
            System.out.println(W + " Water Unit Left");
        }
    }
}

