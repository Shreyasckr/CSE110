public class methodNotePrac4{
    public static void main(String[] args){
        show_triangle(5);
    }
    public static void show_spaces(int a){
        for(int i=0;i<a;i++){
            System.out.print(" ");
        }
    }
    public static void show_pal(int b){
        for(int i=1;i<=b;i++){
            System.out.print(i);
        }
        for(int i=b-1;i>=1;i--){
            System.out.print(i);
        }
    }
    public static void show_triangle(int a){
        for(int i = 0;i<=a;i++){
            show_spaces(i);
            show_pal(a-i);
            System.out.println();
        }
    }
}


//123454321 
// 1234321 
//  12321 
//   121 
//    1 
      