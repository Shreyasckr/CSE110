public class recursionPrac {
    public static void main(String[] args) {
        int[] arr = {10, 40, 60, 50, 20};
        System.out.println(largest(arr, 0));
    }

    public static int largest(int[] arr, int n) {
        // 1. Base Case: If we are at the last element, it is the largest of its "group"
        if (n == arr.length - 1) {
            return arr[n];
        }

        // 2. Recursive Step: Find the largest in the "rest" of the array
        int maxOfRest = largest(arr, n + 1);

        // 3. Comparison: Compare current element with the max of the rest
        if (arr[n] > maxOfRest) {
            return arr[n];
        } else {
            return maxOfRest;
        }
    }
}