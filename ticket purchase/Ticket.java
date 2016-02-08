public class Ticket{
    public static void main (String[] args){
    int money = 15;
    int ticketPrice = 2;
    int numtickets = money/ticketPrice;
    int remainder = money%ticketPrice;
    System.out.println("You have $" + money);
    System.out.println("You can buy "+numtickets+" tickets with $" + remainder + " left over.");
    }
}