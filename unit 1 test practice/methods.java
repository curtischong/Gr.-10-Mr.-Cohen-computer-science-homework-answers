import java.util.Scanner;
public class methods{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("gimmi some words");
    String hey = scanner.nextLine();
    derp(hey);
    
    System.out.println("hi");
    int hi = scanner.nextInt();
    System.out.println("flab");
    scanner.nextLine();
    String flab = scanner.nextLine();
    derp(flab);
    }
    public static void derp(String fat){
        System.out.println(fat);
        
    }
}