public class strProb2{
    public static void main(String[] args){
        String word = "statistics";
        
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int appearances = 0;
            
            // Inner loop to check the rest of the string
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == current) {
                    appearances++;
                }
            }
            
            if (appearances == 1) {
                System.out.println("The first unique char is: " + current);
                break; // Exit early!
            }
        }
    }
}