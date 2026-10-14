public class factorialUsingMethod{
    // ...............
    public static void main(String [] args){
        int res = fact(5);
        System.out.println(res);
        
        System.out.println(fact(5));
        System.out.println(fact(10));
        System.out.println(fact(3));
        System.out.println(fact(0));
    }
    // ...............
    public static int fact(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}