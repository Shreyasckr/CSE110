import java.util.Scanner;
public class assignment8task1{
    public static boolean isPrime(int n){  //a
        if(n<=1){
            return false;
        }
        else{
            int div = 0;
            for(int i = 2;i<n;i++){
                if(n%i==0){
                    div++;
                }
            }
            if(div==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static boolean isPerfect(int n){  //b
        if(n<=1){
            return false;
        }
        else{
            int divSum = 0;
            for(int i = 1;i<n;i++){
                if(n%i==0){
                    divSum += i;
                }
            }
            if(divSum==n){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    public static int special_sum(int n){  //c
        int sum = 0;
        for(int i = 2;i<n;i++){
            if(isPrime(i)){
                sum += i;
            }
            if(isPerfect(i)){
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        boolean check1 = isPrime(7);
        System.out.println(check1); 
        boolean check2 = isPerfect(33);
        System.out.println(check2);
        int result = special_sum(8);
        System.out.println(result);
    }
}