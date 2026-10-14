import java.util.Arrays;
import java.util.Scanner;
public class arrprac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[6];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }
}