import java.util.Scanner;
public class strWSq3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        String rev ="";
        for(int i = s.length()-1;i>=0;i--){
            c = s.charAt(i);
            rev += c;
        }
        if(s.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}