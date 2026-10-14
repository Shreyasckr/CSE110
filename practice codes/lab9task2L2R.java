import java.util.Scanner;
public class lab9task2L2R{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseDigit(n);
    }
    
    public static void reverseDigit(int n){
        if(n==0){
            return;
        }
        else{
            reverseDigit(n/10);
            System.out.println(n%10);
        }
    }
}


//alternative way(total digit count kore bhaag kora)


//import java.util.Scanner;
//public class lab9task2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        reverseDigit(n);
//    }
//    
//    public static void reverseDigit(int n) {
//        if (n == 0) {
//            System.out.println(0);
//            return;
//        }
//        int count = 0;
//        int temp = n;
//        // Count digits first
//        while (temp > 0) {
//            count++;
//            temp /= 10;
//        }
//        
//        // Now print digits from first to last
//        printDigits(n, count);
//    }
//    
//    public static void printDigits(int n, int count) {
//        if (count == 0) {
//            return;
//        }
//        
//        int divisor = (int) Math.pow(10, count - 1);
//        System.out.println(n / divisor);
//        printDigits(n % divisor, count - 1);
//    }
//}