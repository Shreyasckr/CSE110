import java.util.Scanner;
public class flowchartprac{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Current Balance: ");
        int balance = sc.nextInt();
        System.out.println("transaction Amount: ");
        int transaction = sc.nextInt();
        if(transaction<=0){
            System.out.println("Invalid Amount");
        }
        else{
            if(transaction<=balance){
                balance = balance - transaction;
                System.out.println("Transaction Successful");
                System.out.println("Current Balance: "+balance);
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
    }
}