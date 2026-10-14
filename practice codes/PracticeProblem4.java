public class PracticeProblem4 {
    public static void main(String[] args) {
        // Testing the method
        System.out.println(isHappyNumber(82)); // Expected: true
        System.out.println(isHappyNumber(4));  // Expected: false
        System.out.println(isHappyNumber(7));  // Expected: true
    }

    public static boolean isHappyNumber(int n) {
        // Continue the process until we hit 1 or 4
        while (n != 1 && n != 4) {
            // Convert n to a String to use length() and charAt()
            String s = "" + n;
            int sum = 0;

            // Iterate through each character (digit)
            for (int i = 0; i < s.length(); i++) {
                // Get the character at current index
                char c = s.charAt(i);
                
                // Convert char back to digit value (e.g., '8' becomes 8)
                int digit = c - '0';
                
                // Square the digit and add to sum
                sum += (digit * digit);
            }
            
            // Update n with the new sum for the next iteration
            n = sum;
        }

        // If it stopped at 1, it's happy. If it stopped at 4, it's not.
        return n == 1;
    }
}