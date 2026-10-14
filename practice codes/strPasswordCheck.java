import java.util.Scanner;
public class strPasswordCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean up = false, low = false, digit = false , spc = false;
        char c;
        for(int i = 0 ; i<s.length();i++){
            c = s.charAt(i);
            if(c >= 'A' && c<='Z'){
                up = true;
            }
            else if(c >= 'a' && c<='z'){
                low = true;
            }
            else if(c >= '0' && c<='9'){
                digit = true;
            }
            else{
                spc = true;
            }
        }
        if(up && low && digit && spc){
            System.out.println("Strong");
        }
        else{
            System.out.println("Weak");
        }
    }
}