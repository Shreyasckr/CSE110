public class task3{
    public static void main(String [] args){
        int student_id = 1000054943;
        int x = student_id % 1000054900;
        int a = x / 10;  //a=4
        int b = x % 10;  //b=3
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("10000549" + a + b);
    }
}    
        