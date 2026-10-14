public class PracticeProblem11 {
    public static void main(String[] args) {
        // Sample for A and B
        String text = "The quick brown fox jumps over the lazy dog";
        System.out.println("Number of vowels in the string: " + isVowel(text));
        System.out.println("Number of consonants in the string: " + isConsonant(text));

        System.out.println("-----------------------------------");

        // Sample for C
        String[] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
        System.out.println("The total number of vowels in the array is: " + vowelSum(names));
        System.out.println("The total number of consonants in the array is: " + consonantSum(names));
    }

    // A. Method to count vowels in a single String
    public static int isVowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Convert to lowercase manually to check both cases
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // B. Method to count consonants in a single String
    public static int isConsonant(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Convert to lowercase manually
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            // Check if it's a letter but NOT a vowel
            if (c >= 'a' && c <= 'z') {
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    count++;
                }
            }
        }
        return count;
    }

    // C. Methods to sum counts from an array (Must call A and B)
    public static int vowelSum(String[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            // Requirement: You must call the method from Part A
            total += isVowel(arr[i]);
        }
        return total;
    }

    public static int consonantSum(String[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            // Requirement: You must call the method from Part B
            total += isConsonant(arr[i]);
        }
        return total;
    }
}