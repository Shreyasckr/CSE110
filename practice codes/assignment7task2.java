import java.util.Scanner;
public class assignment7task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        int j = 0;
        for(int i = 0 ;i<arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(j = 0 ;j<arr.length;j++){
            if(arr[j]==x){
                found = true;
                break;
            }
        }
        if(found==true){
            System.out.println(x+" is at index "+j);
        }
        else{
            System.out.println("Element not found");
        }
    }
}