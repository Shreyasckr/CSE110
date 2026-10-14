import java.util.Arrays;
import java.util.Scanner;
public class selectionSortascending{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {13, 43, 7, -3, 1, 99};
        for(int i = 0;i<arr.length-1;i++){
            int min_index = i;
            for(int j = i;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}