import java.util.Scanner;

public class BastobChangeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pay, given, change;

        System.out.print("Enter the amount the customer needs to pay (Taka): ");
        pay = input.nextInt();

        System.out.print("Enter the amount the customer gave (Taka): ");
        given = input.nextInt();

        if (given > pay) {
            change = given - pay;
            System.out.println("The returned amount is " + change + " taka.");

            int note100 = 0, note50 = 0, note20 = 0, note10 = 0;
            int coin5 = 0, coin2 = 0, coin1 = 0;

            // Calculate notes
            if (change >= 100) {
                note100 = change / 100;
                change = change % 100;
            }
            if (change >= 50) {
                note50 = change / 50;
                change = change % 50;
            }
            if (change >= 20) {
                note20 = change / 20;
                change = change % 20;
            }
            if (change >= 10) {
                note10 = change / 10;
                change = change % 10;
            }

            // Calculate coins
            if (change >= 5) {
                coin5 = change / 5;
                change = change % 5;
            }
            if (change >= 2) {
                coin2 = change / 2;
                change = change % 2;
            }
            if (change >= 1) {
                coin1 = change;
                change = 0;
            }

            // Display notes and coins
            System.out.println("100 taka note: " + note100);
            System.out.println("50 taka note: " + note50);
            System.out.println("20 taka note: " + note20);
            System.out.println("10 taka note: " + note10);
            System.out.println("5 taka coin: " + coin5);
            System.out.println("2 taka coin: " + coin2);
            System.out.println("1 taka coin: " + coin1);

        } else if (given == pay) {
            System.out.println("The returned amount is 0 taka.");
        } else {
            int needMore = pay - given;
            System.out.println("Please pay " + needMore + " taka more.");
        }

        input.close();
    }
}
