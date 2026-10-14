public class strProb3 {
    public static void main(String[] args) {
        String str = "I love apples, apples are great";
        String s1 = "apples";
        String s2 = "oranges";
        String result = "";

        for (int i = 0; i < str.length(); ) {
            boolean isMatch = false;

            // 1. Check if s1 fits and matches starting at index i
            if (i <= str.length() - s1.length()) {
                isMatch = true; // Assume it matches until proven otherwise
                for (int j = 0; j < s1.length(); j++) {
                    if (str.charAt(i + j) != s1.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }
            }

            // 2. Decide what to add to the result
            if (isMatch) {
                result += s2;      // Add "oranges"
                i += s1.length();  // Skip the length of "apples"
            } else {
                result += str.charAt(i); // Add the original character
                i++;                     // Move to the next character
            }
        }
        System.out.println(result);
    }
}