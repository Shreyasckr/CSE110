import java.util.Arrays;
import java.util.Scanner;
public class lab7task5rough{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original");
        System.out.println(Arrays.toString(arr));
        System.out.println("sorted");
//        for(int i = 0;i<arr.length-1;i++){
//            for(int j = 0;j<arr.length-i-1;j++){
//                if(arr[j]<arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
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