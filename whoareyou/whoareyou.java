import java.util.Scanner;
public class whoareyou{
    private static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter your name:");
        String hi= myscanner.nextLine();
        myscanner.nextLine();
        System.out.println("enter yo age:");
        int age = myscanner.nextInt();
        myscanner.nextLine();
        System.out.println("enter your shoe size");
        double shoe = myscanner.nextDouble();
        myscanner.nextLine();
        System.out.println("your name is "+hi+"your age is "+age+"your shoesize is"+shoe+".");
    }
}