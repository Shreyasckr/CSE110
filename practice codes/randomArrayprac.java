import java.util.Scanner;
public class randomArrayprac{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 7, 1, 9, 4};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                int currentSum = arr[i] + arr[j];
                if(currentSum > max1){
                    max2 = max1;
                    max1 = currentSum;
                } else if(currentSum > max2 && currentSum != max1){
                    max2 = currentSum;
                }
            }
        }
        System.out.println("Second maximum pair sum: "+max2);
    }
}