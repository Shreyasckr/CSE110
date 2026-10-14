public class strProb1{
    public static void main(String[] args){
        String s = "aaaabbbccd";   //output: a4b3c2d1
        String res = "";
        char c;
        int count = 1;
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            if(i + 1 < s.length() && c == s.charAt(i+1)){
                count++;
            }
            else{
                res = res + s.charAt(i) + count; 
                count = 1;
            }
        }
        System.out.println(res);
    }
}