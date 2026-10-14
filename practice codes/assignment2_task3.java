import java.util.Scanner;
public class assignment2_task3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double Maximum;
        Double Minimum;
        if (a >= b && a >= c) {
            Maximum = a;
        } else if (b >= a && b >= c) {
            Maximum = b;
        } else {
            Maximum = c;
        }
        System.out.println("Maximum Number is " + Maximum);
        if (a <= b && a <= c) {
            Minimum = a;
        } else if (b <= a && b <= c) {
            Minimum = b;
        } else {
            Minimum = c;
        }
        System.out.println("Minimum Number is " + Minimum);
    }
}    


