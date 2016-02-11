import java.util.Scanner;
public class cookies{
    private static Scanner get = new Scanner(System.in);
    public static void main (String[] args){
    System.out.println("How many cookies do you need?");
    int cookies = get.nextInt();
    
    int freecookies = cookies%12;
    int numbox = cookies/12;
    int boxcost = numbox*114;
    int numofcartons = numbox/24;
    int leftovercartons = numbox%12;
    int leftoverbox = numbox%24;
    int leftoverboxcost = leftoverbox*57;
    
    double cost = leftoverboxcost + boxcost;
    cost = cost/100;
    
    System.out.println("You'll recieve "+freecookies+" free cookies, "+numofcartons+" cartons, "+numbox+" boxes. The cost of the order will be: $"+ cost);
    
    }
}