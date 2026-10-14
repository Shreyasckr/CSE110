import java.util.Arrays;
import java.util.Scanner;
public class arrayBasic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter an element: ");
//            int el = sc.nextInt();  
//            arr1[i] = el;
            arr1[i] = sc.nextInt();    //aibhabe direct o kora jay
        }
        System.out.println(Arrays.toString(arr1));
    }
}