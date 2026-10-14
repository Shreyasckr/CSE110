public class stringToUpperManual{
    public static void main(String [] args){
        String myStr = "HeLlO worLd123!";
//        System.out.println(myStr.toUpperCase());
        String result = "";
        char ch;
        for(int idx = 0; idx < myStr.length(); idx++){
            ch = myStr.charAt(idx);
//            System.out.println(ch);
            if( ch >= 'a' && ch <= 'z'){ // ( ch >= 97 && ch <= 122)
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}