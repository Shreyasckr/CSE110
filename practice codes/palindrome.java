import java.util.Scanner;
public class palindrome{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int ori = num;
    if(num<0){
      System.out.println("Not a palindrome");
    }
    else{
      int rev = 0;
      while(num>0){
        int digit = num%10;
        rev = rev*10 + digit;
        num /= 10;
      }
      if(rev==ori){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not a palindrome");
      }
    }
  }
}

