import java.util.Arrays;
public class bubbleSortingAscending{
    public static void main(String[] args){
        int[] arr = {34, 3, 77, 7, 10, -3, 0};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("iteration done");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}