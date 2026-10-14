public class PracticeProblem9 {
    public static void main(String[] args) {
        // Sample Input
        char[] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int[] studentScores = new int[7];

        // Call the method
        getScores(studentGrades, studentScores);

        // Print the output to match the expectation
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println(studentScores[i]);
        }
    }

    // Method to assign scores based on grades
    public static void getScores(char[] grades, int[] scores) {
        // Loop through the arrays using length
        for (int i = 0; i < grades.length; i++) {
            char currentGrade = grades[i];

            if (currentGrade == 'A') {
                scores[i] = 100;
            } 
            else if (currentGrade == 'B') {
                scores[i] = 90;
            } 
            else if (currentGrade == 'C') {
                scores[i] = 70;
            } 
            else {
                // For anything else (like 'U' or 'Z')
                scores[i] = 0;
            }
        }
    }
}