import java.util.Scanner;
public class age{
    private static Scanner get = new Scanner(System.in);
    public static void main(String[] args){
    System.out.print("Please enter your age: ");
    int age = get.nextInt();
    System.out.print("Number of days since your birthday: ");
    double percent = get.nextDouble();
    percent = percent/365;
    double newage = (double)age+percent;
    System.out.println("You are " + newage+ " years old");
    System.out.println("Rounded to the closest year, you are "+(int)Math.round(newage)+" years old");
    }
}