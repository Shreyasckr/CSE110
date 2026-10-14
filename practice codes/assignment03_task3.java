import java.util.Scanner;
public class assignment03_task3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Energy (E): ");
        int E = sc.nextInt();
        System.out.println("Number of River (N): ");
        int N = sc.nextInt();
        for(int i = 1;i <= N; i++){
            System.out.println("Enter River Distance D" + i + ": ");
            int D = sc.nextInt();
            if(D < 5){
                E -= 2;
            }
            else{
                E -= (D/2);
            }
            if(E < 0){
            System.out.println("Tired at River " + i);
            }
        }
        System.out.println("All Done");
        System.out.println(E + " energy Left");
    }
}
