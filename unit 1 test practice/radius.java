import java.util.Scanner;
public class radius{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter a radius");
        double radius = scanner.nextDouble();
        System.out.println("enter a height");
        double height = scanner.nextDouble();
        System.out.println("The circumfrance of the circle is "+2*3.14159*radius);
        System.out.println("The area of the circle is "+3.14159*Math.pow(radius,2));
        System.out.println("The surface area of the sphere is "+2*2*3.14159*radius+2*3.14159*Math.pow(radius,2));
        System.out.println("The volume of the sphere is "+3.14159*Math.pow(radius,2)*height);
    }
}