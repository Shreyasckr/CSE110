import java.util.Scanner;
public class assignment2_task1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if( value % 5 == 0 && value % 7 == 0){
            System.out.println("Invalid: Divisible by both");
        }
        else if (value % 5 == 0){
            System.out.println("Divisible by 5 only");
        }
        else if (value % 7 == 0){
            System.out.println("Divisible by 7 only");
        }
        else{
            System.out.println("No");
        }
    }
}    