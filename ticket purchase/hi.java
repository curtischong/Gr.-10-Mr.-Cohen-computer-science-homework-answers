import java.util.Scanner;

public class hi{
    private static Scanner get = new Scanner(System.in);
 public static void main(String[] args){
        System.out.println("test");
        int hey = get.nextInt();
        System.out.println("bye");
        get.nextLine();
        String rip = get.nextLine();
        System.out.println(hey+rip);
    }
}