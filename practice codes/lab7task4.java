public class lab7task4 {
    public static void main(String[] args) {
        int[] arr = {23, 100, 23, 56, 100};

        System.out.print("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Create a temporary array to store unique elements
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            // Check if arr[i] is already in temp
            for (int j = 0; j < count; j++) {
                if (temp[j] == arr[i]) {
                    exists = true;
                    break;
                }
            }
            // If not found, add it
            if (!exists) {
                temp[count] = arr[i];
                count++;
            }
        }

        // Create the final exact-size array
        int[] newArr = new int[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = temp[i];
        }

        System.out.println("New array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}







//without boolean


//public class LabTask4 {
//    public static void main(String[] args) {
//        // Sample Input
//        int[] arr = {23, 100, 23, 56, 100};
//
//        System.out.print("Input array: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        // Temporary array to store unique elements
//        // We assume worst case: all elements are unique (size = arr.length)
//        int[] temp = new int[arr.length];
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int j;
//            // Check if current element (arr[i]) already exists in temp
//            for (j = 0; j < count; j++) {
//                if (arr[i] == temp[j]) {
//                    break; // Duplicate found, exit inner loop
//                }
//            }
//
//            // If j reached the end (count), it means no duplicate was found
//            if (j == count) {
//                temp[count] = arr[i];
//                count++;
//            }
//        }
//
//        // Create the final array with the exact size of unique elements
//        int[] newArr = new int[count];
//        for (int i = 0; i < count; i++) {
//            newArr[i] = temp[i];
//        }
//
//        // Print final result
//        System.out.println("New array:");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }
//    }
//}