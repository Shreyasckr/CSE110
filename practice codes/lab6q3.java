import java.util.Scanner;
public class lab6q3{
    public static void main(String[] args){
        String text = "d3mgxHopperwasHere7bq";
        int start = 5;
        int end = 17;
        char ch;
        String newCode = "";
        for(int i = start ; i <= end ; i++){
            ch = text.charAt(i);
            newCode += ch;
        }
        System.out.print(newCode);
    }
}