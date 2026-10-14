import java.util.Scanner;
public class Question4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N>0){
                System.out.println(N*N);
            }
            else{
                break;
            }
        }
    }
}