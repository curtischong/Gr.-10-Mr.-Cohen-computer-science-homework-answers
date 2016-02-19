import java.util.Scanner;
public class pizza{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("What is the size of your pizza?");
        double sizeOfPizza = scanner.nextDouble();
        double cost = 75+100+(5*Math.pow(sizeOfPizza,2));
        cost = cost/100;
        System.out.println("The cost to make hte pizza is $"+cost);
    }
}