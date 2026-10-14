import java.util.Scanner;
public class strWSq1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        for(int i = s.length()-1;i>=0;i--){
        c = s.charAt(i);
        System.out.print(c);
        }
    }
}