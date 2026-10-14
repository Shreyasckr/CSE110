import java.util.Arrays;
public class lab7task3{
    public static void main(String[] args){
        int[] arr = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removeing duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After removeing duplicates: ");
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



//approach 2

//import java.util.Arrays;
//
//public class lab7task3 {
//    public static void main(String[] args) {
//        int[] arr = {9, -5, 7, 9, -5, 5, 7};
//        
//        System.out.println("Before removing duplicates: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        
//        System.out.println("After removing duplicates: ");
//        for (int i = 0; i < arr.length; i++) {
//            boolean foundBefore = false;
//            
//            // Check all elements before current index i
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    foundBefore = true;
//                    break;
//                }
//            }
//            
//            // If this value was found before, set current to 0
//            if (foundBefore) {
//                arr[i] = 0;
//            }
//        }
//        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//}