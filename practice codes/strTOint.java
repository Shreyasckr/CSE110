//String to Integer

public class strTOint{
  public static void main(String [] args){ 
    String myStr = "3879"; 
    int num = 0;
    int prod = myStr.length() - 1;
    
    for(int i = 0; i < myStr.length(); i++){
      char ch = myStr.charAt(i);
      if(ch >= '0' && ch <= '9'){
        num += (int) (ch - 48)*Math.pow(10, prod);
      }
      prod--;
    }    
    
    System.out.println(num);
  }
}