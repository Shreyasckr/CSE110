import java.util.Scanner;
public class lab6q4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char spc = sc.next().charAt(0);
    s += spc;
    String temp = "";
    char c;
    System.out.println("The words are: ");
    for(int i=0;i<s.length();i++){
      c = s.charAt(i);
      if(c!=spc){
        boolean seen = false;
        for(int j=0;j<temp.length();j++){
          if(c==temp.charAt(j)){
            seen = true;
            break;
          }
        }
        if(seen==false){
          temp += c;
        }
      }
      else{
        System.out.println(temp);
        temp = "";
      }
    }
  }
}
