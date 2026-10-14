import java.util.Scanner;
public class assignment6task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String s = sc.nextLine();
        char c;
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        for(;i>=0;i--){
            c = s.charAt(i);
            if(c != ' '){
                n++;
            }
            else{
                break;
            }
        }
        System.out.println(n);
    }
}