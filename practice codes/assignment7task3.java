import java.util.Scanner;
public class assignment7task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = arr[0];
        double min = arr[0];
        int maxIdx = 0;
        int minIdx = 0;
        double sum = 0;
        for(int i = 0;i<n;i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
        }
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];  //a
                maxIdx = i;
            }
            if(arr[i] < min){
                min = arr[i];  //b
                minIdx = i;
            }
            sum += arr[i];     //c
        }
        double avg = sum / n;  //d 
        System.out.println("Maximum element " + max + " found at index " + maxIdx);
        System.out.println("Minimum element " + min + " found at index " + minIdx);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + avg);
    }
}