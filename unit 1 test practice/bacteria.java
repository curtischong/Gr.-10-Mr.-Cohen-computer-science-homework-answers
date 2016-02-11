import java.util.Scanner;
public class bacteria{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        double bacteria = 1230;
        System.out.println("What are the number of hours?");
        double hours = scanner.nextInt();
        bacteria = Math.pow(bacteria,hours);
        
        
        //total = bacteria*numof hours
        
        System.out.println ("Number of bacteria: " + bacteria + " bacterias");
    }
}