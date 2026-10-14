import java.util.Scanner;
public class lab8q2{
    public static double circleArea(int rd){  //a
        double ar = Math.PI * rd * rd;
        return ar;
    }
    public static double sphereVolume(double rd){
        double vl = (4.0/3)*Math.PI*rd*rd*rd;   //4/3 deyay int value ney fole ands vul ashe
        return vl;
    }
    public static void findSpace(int n, String str){
        int rad = n / 2;
        if(str.equals("circle")){
            System.out.println(circleArea(rad));
        }
        else if(str.equals("sphere")){
            System.out.println(sphereVolume(rad));
        }
        else{
            System.out.println("Wrong Parameter");
        }
    }
    public static void main(String[] args){
//        double area = circleArea(5);
//        System.out.printf("%.4f%n",area); 
//        double volume = sphereVolume(5.0);
//        System.out.printf("%.4f%n",volume);
        findSpace(10,"circle");
        findSpace(5,"sphere");
        findSpace(10,"square");
    }
}        