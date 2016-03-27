import java.util.Scanner;
public class UpdatedChange{
    private static Scanner get = new Scanner(System.in);
    public static void main(String[] args){
   
        
   
        System.out.println("how much does the itme cost?");
        double costOfItem = get.nextDouble();
        System.out.println("How much did you pay?");
        double moneyPayed = get.nextDouble();
        
        double change = moneyPayed - costOfItem;
        
        int numOfQuarters = (int)(change/0.25);
        change = change-(0.25*numOfQuarters);
        
        int numOfDimes = (int)(change/0.1);
        change = change-(0.1*numOfDimes);
        
        int numOfNickels = (int)(change/0.05);
        change = change - (numOfNickels* 0.05);
        
        int numOfPennies = (int)(change/0.01);
        
        System.out.println(numOfQuarters+" "+numOfDimes+" "+numOfNickels+" "+numOfPennies+ " "+change);
    }
}