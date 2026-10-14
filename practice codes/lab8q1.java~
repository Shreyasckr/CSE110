import java.util.Scanner;
public class lab8q1{
    public static void evenChecker(int n){ //a
        if(n%2==0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
    public static boolean isEven(int n){ //b
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPos(int n){  //c
        if(n>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void sequence(int n){  //d
        if(isPos(n)){
            for(int j = 0;j<=n;j++){
                if(isEven(j)){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        else{
            for(int j = 0;j>=n;j--){
                if(isEven(j)==false){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        evenChecker(10);
        boolean result1 = isEven(10);
        System.out.println( result1 );
        boolean result2 = isPos(-5);
        System.out.println( result2 );
        sequence(10);
        sequence(-7);
    }
}