public class PracticeProblem13T{
    public static void main(String [] args){
        methodA(5);
    }
    public static void methodA(int n){
        if (n>=1){
            methodA(n-1);
            System.out.println(methodB(n));
        }
    }
    public static int methodB(int a){
        int b = (++a) + 6;
        return b*a-a;
    }
}