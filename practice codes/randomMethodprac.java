import java.util.Scanner;
public class randomMethodprac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ngr = {4, 3, 9, 5, 12, 7, 8};
        System.out.println(balancedChecker(ngr));
    }
    public static boolean balancedChecker(int[] arr){
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                evenSum += arr[i];
            } 
            else{
                oddSum += arr[i];
            }
        }
        if(oddSum == evenSum){
            return true;
        }
        else{
            return false;
        }
    }
}