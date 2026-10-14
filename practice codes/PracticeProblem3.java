import java.util.Scanner;

public class PracticeProblem3 {
    public static void main(String[] args) {
        // Sample Input 1
        String[] email_list = {"abc@gmail.com", "!@cv.bd", "123cse@bracu.ac.bd"};
        
        // Sample Input 2 (Uncomment to test)
        // String[] email_list = {"cse110@gmail.com", "government@cv.", "eee@bracu.ac.bd"};

        int totalValid = 0;

        for (int i = 0; i < email_list.length; i++) {
            String email = email_list[i];
            
            // Basic length check
            if (email.length() == 0) continue;

            // Condition B (Part 1): Must start with a letter
            char start = email.charAt(0);
            boolean startsWithLetter = (start >= 'a' && start <= 'z') || (start >= 'A' && start <= 'Z');

            if (startsWithLetter) {
                int atIndex = -1;
                
                // Find the index of '@'
                for (int j = 0; j < email.length(); j++) {
                    if (email.charAt(j) == '@') {
                        atIndex = j;
                        break; // Condition A: found '@'
                    }
                }

                // Condition B (Part 2): Character exists before @ (atIndex > 0) 
                // and at least one character exists after @ (atIndex < length - 1)
                if (atIndex > 0 && atIndex < email.length() - 1) {
                    
                    int dotIndex = -1;
                    // Condition C: Search for '.' starting AFTER the character following '@'
                    for (int k = atIndex + 2; k < email.length(); k++) {
                        if (email.charAt(k) == '.') {
                            dotIndex = k;
                            break; 
                        }
                    }

                    // Condition D: There is at least one character after the '.'
                    if (dotIndex != -1 && dotIndex < email.length() - 1) {
                        totalValid++;
                    }
                }
            }
        }

        System.out.println(totalValid);
    }
}