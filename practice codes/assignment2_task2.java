import java.util.Scanner;
public class assignment2_task2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Age : ");
        int age = sc.nextInt();
        System.out.println("Electricity consumed : ");
        Double ec = sc.nextDouble();
        Double totalCharge = ec * 15;
        if (age < 18){
            totalCharge = totalCharge * 0.8;
        }
        else if (age > 18 && age <= 60){
            totalCharge = totalCharge;
        }
        else{
            totalCharge = totalCharge * 0.9;
        }
        if( ec > 100){
            totalCharge = totalCharge * 1.05;
        }
        
        System.out.println("Final Bill: " + totalCharge + " Taka");
        
    }
}    