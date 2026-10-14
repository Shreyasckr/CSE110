public class strprobmsi3{
    public static void main(String[] args){
//        String s1 = "hello sam, hi sam.";
//        String s2 = "sam";
        String s1 = "banana";
        String s2 = "ana";
        int count = 0;
        for(int i=0;i<=s1.length()-s2.length();i++){
            boolean match = true;
            for(int j = 0;j<s2.length();j++){
                if(s1.charAt(i+j) != s2.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                count++;
            }
        }
        System.out.println(count);
    }
}