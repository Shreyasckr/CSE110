import java.util.Scanner;
public class recursiveSum{
    public static void main(String[] args){
        System.out.println(sumR(500));  //resursion er method call
        sum(5);   //loop er method call
    }
    
    public static void sum(int n){   //same task loop er maddhome kora
        int total = 0;
        for(int i = 1 ; i <= n ; i++){
            total += i;
        }
        System.out.println(total);
    }
    
    public static int sumR(int n){
        if(n == 1){    //base case
            return 1;
        }
        else{      //recursive case
            return n + sumR(n-1);
        }
    }
}