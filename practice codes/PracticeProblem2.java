//import java.util.Scanner;
//public class PracticeProblem2{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = "I love apples, apples are great";
//        String s1 = "apples";
//        String s2 = "bananas";
//        String result = "";
//        int i = 0;
//        while(i < s.length()){
//            boolean found = false;
//            if(i <= s.length() - s1.length()){
//                found = true;
//                for(int j = 0;j<s1.length();j++){
//                    if(s.charAt(i+j)!=s1.charAt(j)){
//                        found = false;
//                        break;
//                    }
//                }
//            }
//            if(found){
//                result += s2;
//                i += s1.length();
//            }
//            else{
//                result += s.charAt(i);
//                i++;
//            }
//        }
//        System.out.println(result);
//    }
//}




import java.util.Scanner;

public class PracticeProblem2 {
    public static void main(String[] args) {
        String s = "I love apples, apples are great";
        String s1 = "apples";
        String s2 = "bananas";
        String result = "";

        // We use i++ in the header, but we also jump i inside the loop
        for (int i = 0; i < s.length(); ) {
            boolean found = false;

            // 1. Safety check (to prevent IndexOutOfBoundsException)
            if (i <= s.length() - s1.length()) {
                found = true;
                for (int j = 0; j < s1.length(); j++) {
                    if (s.charAt(i + j) != s1.charAt(j)) {
                        found = false;
                        break;
                    }
                }
            }

            // 2. Decide how much to move i
            if (found) {
                result += s2;
                i += s1.length(); // Jump past the word we found
            } else {
                result += s.charAt(i);
                i++; // Just move to the next character
            }
        }
        System.out.println(result);
    }
}