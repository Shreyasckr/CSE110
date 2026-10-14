public class largestNumRec{
    public static void main(String[] args){
        int[] arr = {1,9,2,8,3,7,4,6,5};
        System.out.println(largest(arr, 0));
    }
    
    public static int largest(int[] A, int n){
        if(n==A.length-1){
            return A[n];
        }
        else{
            int max = largest(A, n+1);
            if(A[n]>max){
                return A[n];
            }
            else{
                return max;
            }
        }
    }
}