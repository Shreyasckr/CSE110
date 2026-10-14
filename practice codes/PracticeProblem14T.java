public class PracticeProblem14T {
    public static void main(String[] args) {
        int[] arr = {22, 7, 14, 33, 19};
        int result = myMethod(arr, 0);
        System.out.println(result);
    }
    public static int myMethod(int[] a, int idx) {
        if (idx == a.length - 1) {
            return a[idx];
        }
        int num = myMethod(a, idx + 1);
        System.out.println(a[idx] + num);
        if(a[idx] < num) {
            return a[idx];
        }
        else{
            return num;
        }
    }
}