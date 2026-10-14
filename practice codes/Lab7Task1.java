import java.util.Scanner;

public class Lab7Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of size N
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) { // n dileo hoy arr.length er bodle
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        // Step 2: Print elements with indices
        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }

        // Step 3: Resize and add new element
        System.out.print("Enter another number: ");
        int newNum = sc.nextInt();  

        int[] newArr = new int[N + 1]; // Create new array with size + 1
        
        // Copy old elements
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        // Add new element at the end
        newArr[newArr.length - 1] = newNum;

        // Print resized array
        System.out.println("After resizing the array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}