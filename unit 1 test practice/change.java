import java.util.Scanner;
public class change{
    private static Scanner get = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("What is the cost of the item?");
        double cost = get.nextDouble();
        cost = cost*100;
        int newcost = (int)cost;
        System.out.println("How much did you give for the item?");
        double pay = get.nextDouble();
        pay = pay*100;
        int newpay = (int)pay;
        int remainder = newpay - newcost;
        
        double numofquarters = remainder/25;
        int newquarters = (int)numofquarters;
        
        double numofdimes = (remainder - newquarters*25)/10;
        int newdimes = (int)numofdimes;
        
        double numofnickels = (remainder - newquarters*25 -  newdimes*10)/5;
        int newnickels = (int)numofnickels;
        
        double numofpennies = (remainder - newquarters*25 - newdimes*10 - newnickels*5)/1;
        int newpennies = (int)numofpennies;
        
        
        
        System.out.println("your change is "+newquarters+" quarters, "+newdimes+" dimes, "+newnickels+" nickels, and "+newpennies+"pennies.");
    }
}