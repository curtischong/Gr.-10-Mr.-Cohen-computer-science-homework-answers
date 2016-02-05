import java.util.Scanner;
public class sphere{
    private static Scanner get = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("gimmie a radius");
        double radius = get.nextDouble();
        double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
        double surfacearea = 4*Math.PI*Math.pow(radius,2);
        System.out.println("The volume of the sphere is "+volume+". The surface area of the sphere is "+surfacearea);
        
    }
}