import java.util.Scanner;

public class CashierChangeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int amountToPay = input.nextInt();
        
        System.out.println("Enter the amount, customer gave(Taka)");
        int amountGiven = input.nextInt();
        
        // Calculate change
        int change = amountGiven - amountToPay;
        
        // Check if customer needs to pay more
        if (change < 0) {
            System.out.println("Please pay " + (-change) + " taka more.");
        }
        // Check if exact amount given
        else if (change == 0) {
            System.out.println("The returned amount is 0 taka.");
        }
        // Calculate notes and coins
        else {
            System.out.println("The returned amount is " + change + " taka.");
            
            // Calculate 100 taka notes
            int note100 = change / 100;
            change = change % 100;
            System.out.println("100 taka note: " + note100);
            
            // Calculate 50 taka notes
            int note50 = change / 50;
            change = change % 50;
            System.out.println("50 taka note: " + note50);
            
            // Calculate 20 taka notes
            int note20 = change / 20;
            change = change % 20;
            System.out.println("20 taka note: " + note20);
            
            // Calculate 10 taka notes
            int note10 = change / 10;
            change = change % 10;
            System.out.println("10 taka note: " + note10);
            
            // Calculate 5 taka coins
            int coin5 = change / 5;
            change = change % 5;
            System.out.println("5 taka coin: " + coin5);
            
            // Calculate 2 taka coins
            int coin2 = change / 2;
            change = change % 2;
            System.out.println("2 taka coin: " + coin2);
            
            // Calculate 1 taka coins
            int coin1 = change / 1;
            System.out.println("1 taka coin: " + coin1);
        }
        
        input.close();
    }
}