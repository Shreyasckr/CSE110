import java.util.Scanner;//holy fucking shit first try te solve korsi
public class lab4ltask1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int win = 0;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                System.out.println(i+" beats "+j);
                win++;
                }
            }
        }
        System.out.println("Total wins: "+win);
    }
}