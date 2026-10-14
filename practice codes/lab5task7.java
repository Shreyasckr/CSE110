import java.util.Scanner;
public class lab5task7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                // Logic: First column OR Last column of this row OR Last row of shape
                if (col == 1 || col == row || row == n) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}