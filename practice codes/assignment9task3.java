public class assignment9task3{
    public static void main(String[] args){
        int[] arr = {5,6,2,1,8,7};
        int index = 2;
        print_element(arr, index);
    }
    public static void print_element(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        else{
            System.out.println(arr[idx]);
            print_element(arr, idx+1);
        }
    }
}