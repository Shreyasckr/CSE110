import java.util.Scanner;
public class testStr1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = "";
        for(int i = 0;i<s2.length();i++){
            if(s2.charAt(i)==s1.charAt(i)){
                s3 += s2.charAt(i);
            }
            else{
                break;
            }
        }
        System.out.println(s3);
    }
}