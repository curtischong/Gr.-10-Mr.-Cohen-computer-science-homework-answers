import java.util.Scanner;
public class test{
    private static Scanner get = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("Please enter your English Mark");
    int english = get.nextInt();
    System.out.println("Please enter your Math Mark");
    int math = get.nextInt();
    System.out.println("Please enter your Computer Science Mark");
    int science = get.nextInt();
    System.out.println("Please enter your French Mark");
    int french = get.nextInt();
    
    double total = english + math + science + french;
    total = total/4;
    System.out.println("Your average is: " + total);
    int rounded = (int)Math.round(total);
    System.out.println("Your average rounded is: "+rounded);
    }
}