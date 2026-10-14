import java.util.Scanner;
public class lab9task4{
    public static void main(String[] args){
        System.out.println(reverse_string("Nigger", 0));
    }
    
    public static String reverse_string(String s, int idx){
        if(idx == s.length()){
            return "";
        }
        else{
            return reverse_string(s, idx + 1) + s.charAt(idx);
        }
    }
}