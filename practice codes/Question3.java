import java.util.Scanner;
public class Question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        int power = 40;
        int day;
        for(day = 1; day <= days; day++){
            if(day % 3 == 0 && day % 5 == 0){
                power -= 20;
            }
            else if(day % 3 == 0){
                power -= 45;
            } 
            else if(day % 5 == 0){
                power += 25;
            } 
            else{
                power += 10;
            }
            if(power > 500){
                power -= 50;
            }
            if(power < 0){
                System.out.println("Blackout on Day " + day);
                break;
            }
        }
        if(day > days){
            System.out.println("Final Power: " + power);
        }
    }
}