import java.util.Scanner;
public class assignment6task4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fan message: ");
        String msg = sc.nextLine();
        char c;
        String lowermsg = "";
        for(int i = 0;i<msg.length();i++){
            c = msg.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                lowermsg +=(char)(c + 32);
            } 
            else{
                lowermsg += c;
            }
        }
        int madrid = 0;
        for(int i=0;i<lowermsg.length()-5; i++){
            if (lowermsg.charAt(i) == 'm' && lowermsg.charAt(i+1) == 'a' && lowermsg.charAt(i+2) == 'd' && lowermsg.charAt(i+3) == 'r' && lowermsg.charAt(i+4) == 'i' && lowermsg.charAt(i+5) == 'd'){
                madrid++;
            }
        }
        int city = 0;
        for(int i = 0; i < lowermsg.length()-3; i++){
            if (lowermsg.charAt(i) == 'c' && lowermsg.charAt(i+1) == 'i' && lowermsg.charAt(i+2) == 't' && lowermsg.charAt(i+3) == 'y'){
                city++;
            }
        }
        boolean hasClose = false;
        for(int i = 0;i<lowermsg.length()-4;i++){
            if (lowermsg.charAt(i) == 'c' && lowermsg.charAt(i+1) == 'l' && lowermsg.charAt(i+2) == 'o' && lowermsg.charAt(i+3) == 's' && lowermsg.charAt(i+4) == 'e'){
                hasClose = true;
                break;
            }
        }
        boolean hasDestroy = false;
        for (int i = 0;i<lowermsg.length()-6;i++) {
            if (lowermsg.charAt(i) == 'd' && lowermsg.charAt(i+1) == 'e' && lowermsg.charAt(i+2) == 's' && lowermsg.charAt(i+3) == 't' && lowermsg.charAt(i+4) == 'r' && lowermsg.charAt(i+5) == 'o' && lowermsg.charAt(i+6) == 'y'){
                hasDestroy = true;
                break;
            }
        }
        String support;
        if(madrid>city){
            support ="Madrid Supporter";
        }
        else if(city>madrid){
            support ="City Supporter";
        }
        else{
            support ="Neutral";
        }
        String expectation;
        if(hasClose){
            expectation = "Fan expect a close match";
        } 
        else if(hasDestroy){
            expectation = "Fan expects a dominating victory!";
        } 
        else{
            expectation = "Hard to read the fan sentiment";
        }
        System.out.println(support);
        System.out.println(expectation);
    }
}