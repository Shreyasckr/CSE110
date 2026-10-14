import java.util.Scanner;

public class assignment4task4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number of Members: ");
        int members = scanner.nextInt();
        
        for (int member = 1; member <= members; member++) {
            System.out.print("Exercises for Member-" + member + ": ");
            int exercisesCount = scanner.nextInt();
            
            if (exercisesCount > 3) {
                System.out.println("(Can't do more than 3 exercise)");
                exercisesCount = 3;
            }
            
            double rawSum = 0;
            double adjustedSum = 0;
            int allLessThan200 = 1; 
            
            for (int ex = 1; ex <= exercisesCount; ex++) {
                System.out.print("Exercise-" + ex + ": ");
                int calorie = scanner.nextInt();
                rawSum = rawSum + calorie;
                if (calorie > 350) {
                    adjustedSum = adjustedSum + calorie + (calorie * 0.5);
                } 
                else {
                    adjustedSum = adjustedSum + calorie;
                }
                if (calorie >= 200) {
                    allLessThan200 = 0;
                }
            }
            
            double rawAvg = rawSum / exercisesCount;
            if (allLessThan200 == 1) {
                adjustedSum = adjustedSum * 0.9;
            }
            if (rawAvg > 400) {
                adjustedSum = adjustedSum + (50 * exercisesCount);
            }
            
            double finalAvg = adjustedSum / exercisesCount;
            System.out.printf("Average calories earned per day for Member-" + member + ": %.3f%n", finalAvg);
        }
    }
}