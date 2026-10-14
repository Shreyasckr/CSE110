import java.util.Scanner;
public class lcProb1romanTointSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int integer = 0;
        for (int i = 0; i < str.length(); i++) {  // Fixed: < instead of <=
            char c1 = str.charAt(i);
            char c2 = (i + 1 < str.length()) ? str.charAt(i + 1) : ' ';  // Safe lookup
            
            // Process I, X, C with their subtractive cases first
            if (c1 == 'I') {
                if (c2 == 'V') {
                    integer += 4;
                    i++;  // Skip next character
                } else if (c2 == 'X') {
                    integer += 9;
                    i++;
                } else {
                    integer += 1;
                }
            } 
            else if (c1 == 'X') {
                if (c2 == 'L') {
                    integer += 40;
                    i++;
                } else if (c2 == 'C') {
                    integer += 90;
                    i++;
                } else {
                    integer += 10;
                }
            }
            else if (c1 == 'C') {
                if (c2 == 'D') {
                    integer += 400;
                    i++;
                } else if (c2 == 'M') {  // Fixed: else if instead of if
                    integer += 900;
                    i++;
                } else {
                    integer += 100;
                }
            }
            // Handle other single symbols
            else if (c1 == 'V') {
                integer += 5;
            }
            else if (c1 == 'L') {
                integer += 50;
            }
            else if (c1 == 'D') {
                integer += 500;
            }
            else if (c1 == 'M') {
                integer += 1000;
            }
        }
        System.out.println(integer);
        sc.close();
    }
}