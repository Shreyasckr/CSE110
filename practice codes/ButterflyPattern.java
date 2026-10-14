import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int height = 2 * (n - 2) + 1;
        int width = 2 * n - 1;
        
        for (int row = 1; row <= height; row++) {
            if (row == (height + 1) / 2) {
                for (int i = 1; i <= n - 1; i++) {
                    System.out.print("*");
                }
                System.out.print("@");
                for (int i = 1; i <= n - 1; i++) {
                    System.out.print("*");
                }
            } else {
                for (int i = 1; i <= n - 1; i++) {
                    if (row <= height / 2) {
                        if (n > 3 && row % 2 == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print("-");
                        }
                    } else {
                        if (n > 3 && (height - row + 1) % 2 == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
                
                if (row <= height / 2) {
                    System.out.print("\\  /");
                } else {
                    System.out.print("/  \\");
                }
                
                for (int i = 1; i <= n - 1; i++) {
                    if (row <= height / 2) {
                        if (n > 3 && row % 2 == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print("-");
                        }
                    } else {
                        if (n > 3 && (height - row + 1) % 2 == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print("-");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}