import java.util.Scanner;
public class assignment6task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String msg = sc.nextLine();
        int maxPin = 0;
        int Num = 0;
        int digit = 0;
        char c;
        for(int i = 0;i<msg.length();i++){
            c = msg.charAt(i);
            if(c>='0' && c<='9'){
                Num = Num * 10 + (c - 48);
                digit++;
                if(digit == 2){
                    if(Num > maxPin){
                        maxPin = Num;
                    }
                    Num = c - 48;
                    digit = 1;
                }
            }
            else{
                Num = 0;
                digit = 0;
            }
        }
        System.out.println("2-Digit PIN: " + maxPin);
    }
}