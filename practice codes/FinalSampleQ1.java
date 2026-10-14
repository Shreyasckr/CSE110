import java.util.Scanner;
public class FinalSampleQ1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
        double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
        double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};
        boolean found = false;
        double closest = 34276.0;
        int s = 0;
        for(int i = 0;i<planets.length;i++){
            if(planets[i].equals(input)){
                s = i;
                found = true;
            }
        }
        int closestIdx = s;
        if (found) {
            for (int j = 0; j < planets.length; j++) {
                if (s != j) {
                    double dx = x_coordinates[j] - x_coordinates[s];
                    double dy = y_coordinates[j] - y_coordinates[s];
                    double dz = z_coordinates[j] - z_coordinates[s];
                    double distance = (dx * dx) + (dy * dy) + (dz * dz);
                    
                    if (distance < closest) {
                        closest = distance;
                        closestIdx = j;
                    }
                }
            }
            System.out.println("Closest Planet : " + planets[closestIdx]);
            System.out.println("Distance : " + closest);
        } 
        else {
            System.out.println("Invalid Input");
        }
    }
}