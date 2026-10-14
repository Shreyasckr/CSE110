import java.util.Scanner;
public class loopNotesProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        double avg = sum / n;
        System.out.println("Average = " + avg);
    }
}