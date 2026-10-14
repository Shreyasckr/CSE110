import java.util.Scanner;
public class stringpractice{
    public static void main(String [] args){
        Scanner abc = new Scanner(System.in);
        String myStr = abc.nextLine();
        char ch;
        for(int idx = 0; idx < myStr.length(); idx++){
            ch = myStr.charAt(idx);
            System.out.println(ch);
        }
    }
}