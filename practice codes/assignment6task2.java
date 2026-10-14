import java.util.Scanner;
public class assignment6task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        String newS = "";
        String vowel = "";
        for(int i = 0;i<s.length();i++){
            c = s.charAt(i);
            if(c == 'a' || c == 'e' ||c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowel += c;
            }
        }
        int vowels = vowel.length() - 1;
        for(int j = 0; j < s.length(); j++){
            char c2 = s.charAt(j);
            if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' || c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U'){
                newS += vowel.charAt(vowels);
                vowels--;
            }
            else{
                newS += c2;
            }
        }
        System.out.println(newS);
    }
}