import java.util.Scanner;
public class assignment8task3{
    public static void main(String[] args){
       calcYearlyTax();
    }
    
    public static double calcTax(int a, int b){
        double tax = 0.0;
        if(a<18){
            tax = 0.0;
        }
        else{
            if(b<10000){
                tax = 0.0;
            }
            else if(b<=20000 && b>=10000){
                tax = b*0.07;
            }
            else{
                tax = b*0.14;
            }
        }
        return tax;
    }
    
    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double tt = 0.0;
        for(int i = 1;i<=12;i++){
            int income = sc.nextInt();
            double t = calcTax(age,income);
            tt += t;
            System.out.printf("Month%d tax: %.1f\n", i, t);
        }
        System.out.printf("Total Yearly Tax: %.1f\n", tt);
    }
}