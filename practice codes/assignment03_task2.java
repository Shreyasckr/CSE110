import java.util.Scanner;
public class assignment03_task2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number of Herbs (H): ");
        int h = sc.nextInt();
        System.out.print("Please Enter number of Crystals (C): ");
        int c = sc.nextInt();
        int potion = 0;
        while (h >= 3 && c >= 2){
            h -= 3;
            c -= 2;
            potion++;
            System.out.println("Potion-" + potion + " created");
            System.out.println("Remaining Herbs: " + h + " Remaining Crystals: " + c);
        }
        System.out.println("Potions Created: " + potion);
        if(potion % 2 == 0){
            System.out.println("Stable Brew");
        } 
        else{
            System.out.println("Volatile Elixir");
        }
    }
}    
