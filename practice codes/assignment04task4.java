import java.util.Scanner;
public class assignment04task4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Menbers: ");
        int Member = sc.nextInt();
        for(int i=1;i<=Member;i++){
            System.out.print("Exercise for Member-"+i+": ");
            int Exercise = sc.nextInt();
            if(Exercise>3){
                System.out.println("(Can't do more than 3 exercise)");
                Exercise = 3;
            }
            int count = 0;
            double sum = 0;
            double totalSum = 0;
            double avg;
            for(int j=1;j<=Exercise;j++){
                System.out.print("Exercise-"+j+": ");
                double exercise = sc.nextDouble();
                totalSum += exercise;
                if(exercise>350){
                exercise += exercise*0.5;
                }
                if(exercise<200){
                count++;
                }
                sum += exercise;
            }
            if(totalSum>400*Exercise){
            sum+=50*Exercise;
            }
            avg = sum/Exercise;
            if(count==Exercise){
            avg -= avg*0.1;
            }
            System.out.printf("Average calories earned per day for Member-" + i + ": %.3f\n", avg);
        }
    }
}