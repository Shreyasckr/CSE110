public class smallestWord {
    public static void main(String[] args) {
        String input = "cat is cute"; // Try "I love coding" for other example
        String smallest = ""; // Holds the smallest word found so far
        String tempWord = ""; // Build current word character by character
        for (int i = 0; i <= input.length(); i++) {
            // If we're inside string, and not on a space, add to tempWord
            if (i < input.length() && input.charAt(i) != ' ') {
                tempWord = tempWord + input.charAt(i);
            } else {
                // We just finished a word (i is space or end)
                if (tempWord.length() > 0) {
                    // If first word, or this word is smaller than current smallest
                    if (smallest.equals("") || tempWord.length() < smallest.length()) {
                        smallest = tempWord;
                    }
                    // Reset tempWord to start next word
                    tempWord = "";
                }
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Output: " + smallest);
    }
}