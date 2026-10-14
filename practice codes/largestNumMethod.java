public class largestNumMethod{
    public static void main(String[] args){
        int[] arr = {1,9,2,8,3,7,4,6,5};
        System.out.println(largest(arr));
    }
    
    public static int largest(int[] A){
        int max = A[0];
        for(int i = 1;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
}