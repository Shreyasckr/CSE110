public class spring25FinalQ2{
    public static void main(String[] args){
        int[] arr = {2, 2, 1, 0, 1, 6, 2, 4};
        boolean found = false;
        for(int i = 1;i<arr.length-1;i++){
            int left_sum = 0;
            int right_sum = 0;
            for(int j = 0;j<i;j++){
                left_sum += arr[j];
            }
            for(int k = i+1;k<arr.length;k++){
                right_sum += arr[k];
            }
            if(arr[i]==left_sum && arr[i]==right_sum){
                System.out.println(i);
                found = true;
            }
        }
        if(found == false){
            System.out.println("Not applicable");
        }
    }
}