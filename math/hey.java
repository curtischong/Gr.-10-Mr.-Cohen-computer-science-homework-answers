import java.util.Scanner;
public class hey{
    private static Scanner get = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("enter an amount of coin flips");
        double flip = get.nextDouble();
        double headchance = Math.pow(0.5, flip);
        System.out.println("the odds of flipping all heads are: "+headchance+"%");
    }
}