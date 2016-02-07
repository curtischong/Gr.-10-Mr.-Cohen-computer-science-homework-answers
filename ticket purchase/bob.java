import java.util.Scanner;
public class bob{
    private static Scanner get = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter how much cash you have");
        double cash = get.nextDouble();
        System.out.println("enter how old you are");
        int age = get.nextInt();
        get.nextLine();
        System.out.println("enter what's ur fav food");
        String food = get.nextLine();
        System.out.println(cash+" "+age+" "+food);
    }
}