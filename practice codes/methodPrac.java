import java.util.Scanner;
public class methodPrac{
    public static void printEvenNum(int[] a1){
        for(int i = 0; i<a1.length;i++){
            if(a1[i]%2==0){
            System.out.println(a1[i]);
            }
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printEvenNum(arr);
    }
}