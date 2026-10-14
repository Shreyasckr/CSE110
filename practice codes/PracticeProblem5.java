public class PracticeProblem5{
    public static void main(String[] args){
        int decimal = toDecimal("1010");
        System.out.println(decimal);
        String hex = toHex(decimal);
        System.out.println(hex);
    }
    public static int toDecimal(String s){
        int n = s.length();
        int dec = 0;
        for(int i = 0;i<s.length();i++){
            int digit = s.charAt(i) - '0';
            dec += digit * Math.pow(2, n-1);
            n--;
        }
        return dec;
    }
   public static String toHex(int n) {
    // Basic check for zero
    if (n == 0) {
        return "0";
    }

    String hex = "";
    
    while (n > 0) {
        int remainder = n % 16;
        
        // Convert remainder to a character without an array
        if (remainder < 10) {
            // For 0-9, we can just add the number to the string
            hex = remainder + hex;
        } else {
            // For 10-15, manually map to A-F
            if (remainder == 10) hex = "A" + hex;
            else if (remainder == 11) hex = "B" + hex;
            else if (remainder == 12) hex = "C" + hex;
            else if (remainder == 13) hex = "D" + hex;
            else if (remainder == 14) hex = "E" + hex;
            else if (remainder == 15) hex = "F" + hex;
        }
        
        // Reduce the decimal by dividing by 16
        n = n / 16;
    }
    
    return hex;
}
}