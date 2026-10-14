import java.util.Arrays;
import java.util.Scanner;
public class selectionSortdescending{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {13, 43, 7, -3, 1, 99};
        for(int i = 0;i<arr.length-1;i++){
            int max_index = i;
            for(int j = i;j<arr.length;j++){
                if(arr[j]>arr[max_index]){
                    max_index = j;
                }
            }
            int temp = arr[max_index];
            arr[max_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}