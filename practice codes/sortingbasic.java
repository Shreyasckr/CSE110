import java.util.Arrays;
import java.util.Scanner;
public class sortingbasic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {43, 5, 84, 2, -8, 1};
        Arrays.sort(arr);     //ascending order a ashbe
        System.out.println(Arrays.toString(arr));
    }
}