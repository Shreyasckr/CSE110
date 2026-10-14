public class strprobmsi1{
    public static void main(String[] args){
        String str = "refer";
        char ch, ch2;
        for(int i = 0;i<str.length();i++){
            boolean found = false;
            ch = str.charAt(i);
            for(int j = 0;j<str.length();j++){
                if(i != j){
                    ch2 = str.charAt(j);
                    if(ch == ch2){
                        found = true;
                        break;
                    }
                }
            }
            if(!found){
                System.out.println(ch);
                break;
            }
        }
    }
}