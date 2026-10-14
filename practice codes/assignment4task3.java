import java.util.Scanner;
public class assignment4task3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();
        for (int i=1;i<=days;i++) {
            System.out.println("Enter sales for Day " + i + ": ");
            int total_sale = 0;
            for (int j=1;j<= 3;j++){
                int sales = sc.nextInt();
                total_sale += sales;
            }
            double tax = 0.0;
            if (total_sale>= 500) {
                tax = total_sale * 0.10;
            } else if (total_sale>= 200) {
                tax = total_sale * 0.05;
            } else if (total_sale>= 100) {
                tax = total_sale * 0.02;
            }
            double final_sale = total_sale + tax;
            System.out.println("Day " + i + ": Total Sales with Tax: " + final_sale);
        }
    }
}