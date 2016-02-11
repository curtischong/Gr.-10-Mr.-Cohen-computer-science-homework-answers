import java.util.Scanner;
public class temperature{
    private static Scanner get = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("give me a temperature in farenheight");
    double temp = get.nextDouble();
    System.out.println("The temperature is "+temp);
    double newtemp = temp - 32;
    double five = 5;
    double nine = 9;
    double test = five/nine;
    double answer = test*newtemp;
    System.out.println("The temperature is "+answer);
    }
}