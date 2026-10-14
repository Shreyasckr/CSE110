import java.util.Scanner;

public class Lab7Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        // A. Out-of-Place (Using a new array)
        int[] reversedArr = new int[len];
        for (int i = 0; i < len; i++) {
            reversedArr[i] = arr[len - 1 - i]; //last index - 1
        }

        System.out.println("Reversed using a new array:");
        for (int i = 0; i < len; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println();

        // B. In-Place (Modifying the original array)
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }

        System.out.println("Reversed the original array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



//Example: arr = [1, 2, 3, 4, 5], len = 5
//
//Loop iterations:
//
//i = 0 (less than 5/2 = 2)
//
//temp = arr[0] ? temp = 1
//
//arr[0] = arr[5-1-0] ? arr[0] = arr[4] = 5
//
//arr[4] = temp ? arr[4] = 1
//
//Array becomes: [5, 2, 3, 4, 1]
//
//i = 1 (less than 2)
//
//temp = arr[1] ? temp = 2
//
//arr[1] = arr[5-1-1] ? arr[1] = arr[3] = 4
//
//arr[3] = temp ? arr[3] = 2
//
//Array becomes: [5, 4, 3, 2, 1]
//
//i = 2 (2 is NOT less than 5/2 = 2) ? loop ends
