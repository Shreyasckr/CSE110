import java.util.Scanner;
public class assignment4task2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students to check: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter student ID: ");
            int id = sc.nextInt();
            if(id==1){
                System.out.println("Lucky ID");
            }
            else{
                int temp = id;
                for (;temp>1;temp=temp/2){
                    if (temp % 2 != 0){
                        break;
                    }
                }
                if(temp==1){
                    System.out.println("Lucky ID");
                } 
                else{
                    System.out.println("Not Lucky");
                }
            }
        }
    }
}