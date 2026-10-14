public class ArraySorter {

    // Function to sort the array using Bubble Sort
    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        // Implement Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] inputArray = {5, 3, 8, 2, 1};

        System.out.print("Input array: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

        // Call the sortArray function
        int[] sortedArray = sortArray(inputArray);

        System.out.print("\nSorted array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}

