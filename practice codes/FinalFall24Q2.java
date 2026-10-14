import java.util.Arrays;
public class FinalFall24Q2{
    public static void main(String[] args){
        int[] array = {5, 3, 8, 6, 7, 2, 1, 4};
        int odd = 0;
        int even = 0;
        for(int  i = 0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        int[] evenAr = new int[even];
        int[] oddAr = new int[odd];
        int oddIdx = 0;
        int evenIdx = 0;
        for(int  i = 0;i<array.length;i++){
            if(array[i]%2==0){
                evenAr[evenIdx] = array[i];
                evenIdx++;
            }
            else{
                oddAr[oddIdx] = array[i];
                oddIdx++;
            }
        }
        System.out.println(Arrays.toString(evenAr));
        System.out.println(Arrays.toString(oddAr));
    }
}