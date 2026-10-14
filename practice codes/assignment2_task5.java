import java.util.Scanner;
public class assignment2_task5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int amount_to_pay = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int amount_given = sc.nextInt();
        int change = amount_given - amount_to_pay;
        if (change < 0){
            System.out.println("Please pay " + (-change) + " taka more.");
        }
        else if (change == 0){
            System.out.println("The returned amount is 0 taka.");
        }
        else{
            System.out.println("The returned amount is " + change + " taka.");
            int note100 = change / 100;
            change = change % 100;
            System.out.println("100 taka note: " + note100);
            int note50 = change / 50;
            change = change % 50;
            System.out.println("50 taka note: " + note50);
            int note20 = change / 20;
            change = change % 20;
            System.out.println("20 taka note: " + note20);
            int note10 = change / 10;
            change = change % 10;
            System.out.println("10 taka note: " + note10);
            int coin5 = change / 5;
            change = change % 5;
            System.out.println("5 taka coin: " + coin5);
            int coin2 = change / 2;
            change = change % 2;
            System.out.println("2 taka coin: " + coin2);
            int coin1 = change / 1;
            System.out.println("1 taka coin: " + coin1);
        }
    }
}