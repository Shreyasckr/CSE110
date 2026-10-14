import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number of Herbs (H): ");
        int herbs = sc.nextInt();
        System.out.print("Please Enter number of Crystals (C): ");
        int crystals = sc.nextInt();
        
        int potions = 0;
        
        while(herbs >= 3 && crystals >= 2) {
            herbs -= 3;
            crystals -= 2;
            potions++;
            
            System.out.println("Potion-" + potions + " created");
            System.out.println("Remaining Herbs: " + herbs + ", Remaining Crystals: " + crystals);
        }
        
        System.out.println("Potions Created: " + potions);
        
        if(potions % 2 == 0) {
            System.out.println("Stable Elixir");
        } else {
            System.out.println("Volatile Brew");
        }
    }
}