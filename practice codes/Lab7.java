import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour (H): ");
        int hours = sc.nextInt();
        System.out.print("Enter Water Units (W): ");
        int water = sc.nextInt();
        
        final int PLANTS = 5;
        int hour;
        
        for(hour = 1; hour <= hours; hour++) {
            int waterUsed;
            if(hour % 2 == 0) {
                waterUsed = PLANTS * 4;
            } else {
                waterUsed = PLANTS * 3;
            }
            
            // Check if we have enough water for this hour
            if(water >= waterUsed) {
                water -= waterUsed;
            } else {
                break;  // Stop the loop if not enough water
            }
        }
        
        // After the loop, check why we stopped
        if(hour <= hours) {
            System.out.println("Stopped at Hour " + hour);
        } else {
            System.out.println("All Watered");
            System.out.println(water + " Water Unit Left");
        }
    }
}