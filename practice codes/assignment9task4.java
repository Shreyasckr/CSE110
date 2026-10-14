public class assignment9task4{
    public static void main(String[] args){
        System.out.println(fibonacci(0)); 
        System.out.println(fibonacci(1)); 
        System.out.println(fibonacci(5)); 
        System.out.println(fibonacci(9));
    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int sum = fibonacci(n-1) + fibonacci(n-2);
        return sum;
    }
}