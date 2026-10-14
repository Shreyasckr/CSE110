import java.util.Scanner;

public class lab8task3 {
    public static boolean isTriangle(int a, int b, int c) {  // a
        if (a + b > c && b + c > a && c + a > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void triArea(int a, int b, int c) {
        // Calculate s as double
        double s = (a + b + c) / 2.0;
        
        // Call the method with parameters
        if (!isTriangle(a, b, c)) {
            System.out.println("Can't form triangle");
        } else {
            // Use * for multiplication and correct minus signs
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            // Correct printf syntax
            System.out.printf("%.3f\n", area);
        }
    }

    public static void main(String[] args) {
        boolean res = isTriangle(7, 5, 10);
        System.out.println(res);
        
        // Test the triArea method
        triArea(7, 5, 10);
    }
}