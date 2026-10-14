public class assignment8task2{
    public static void main(String[] args){
        showDiamond(5); 
    }
    public static void showDots(int n){   //a
        for (int i = 1; i <= n; i++){
            System.out.print(".");
        }
    }
    public static void show_palindrome(int n){   //b
        for(int i = 1; i <= n; i++){
            System.out.print(i);
        }
        for(int i = n - 1; i >= 1; i--){
            System.out.print(i);
        }
    }
    
    public static void showDiamond(int n){    //c
      for(int row = 1; row <= n; row++){
            showDots(n - row);
            show_palindrome(row);
            showDots(n - row); 
            System.out.println(); 
      }
        for(int row = n - 1; row >= 1; row--){
            showDots(n - row);
            show_palindrome(row);
            showDots(n - row);
            System.out.println();
        }
    }
}