import java.util.Scanner;
public class assignment6task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        int maxLength = 0;
        int power = 0;
        char c;
        System.out.println("Names of the spells:");
        while(true){
            String s2 = sc.nextLine();
            if(s2.equals("stop")){
                break;
            }
            String s3 = "";
            for(int i = 0;i<s2.length();i++){
                c = s2.charAt(i);
                if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                    if(c >= 'a' && c <= 'z') {
                        c = (char)(c - 32);
                    }
                    s3 += c;
                }
            }
            if(s3.length() > maxLength){
                maxLength = s3.length();
                s1 = s3;
                power = 0;
                for(int i = 0; i<s3.length(); i++) {
                    power += s3.charAt(i);
                }
            }
        }
        if(maxLength>0){
            System.out.println("Largest Spell : " + s1 + " Power Level : " + power);
        }
    }
}