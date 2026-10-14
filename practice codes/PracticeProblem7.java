public class PracticeProblem7{
    public static void main(String[] args){
        int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
        System.out.println("Prime Numbers: ");
        for(int i = 0 ; i < arr.length ; i++){
            int div = 0;
            for(int j = 2 ; j < arr[i] ; j++){
                if(arr[i]%j==0){
                    div++;
                }
            }
            if(div == 0){
                System.out.println(i + ": " + arr[i]);
            }
        }
        System.out.println();
        System.out.println("Perfect Numbers: ");
        for(int i = 0 ; i < arr.length ; i++){
            int divSum = 0;
            for(int j = 1 ; j < arr[i] ; j++){
                if(arr[i]%j==0){
                    divSum += j;
                }
            }
            if(divSum==arr[i]){
                System.out.println(i + ": " + arr[i]);
            }
        }
    }
}