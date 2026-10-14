public class task5{
    public static void main(String [] args){
        Double a = 4.5;
        Double b = 9.5;
        Double c = Math.sqrt(a * a + b * b);
        Double sinA = a / c;
        Double sinB = b / c;
        Double cosA = b / c;
        Double cosB = a / c;
        System.out.println("Sin A = " + sinA);
        System.out.println("Cos A = " + cosA);
        System.out.println("Sin B = " + sinB);
        System.out.println("Cos B = " + cosB);
    }
}    
    