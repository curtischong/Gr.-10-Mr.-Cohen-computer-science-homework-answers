import java.util.Scanner;
public class IfElse{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("how old are you?");
        int age = scanner.nextInt();
        OldEnoughToDrive(age);
    }
    private static void OldEnoughToDrive(int age){
        if(age < 16){
            System.out.println("you can't drive yet.");
        }else{
            System.out.println("you can drive");
        }
    }
    private static String compareToTen (int n1, int n2){
        
        String result;
        
        if((n1+n2 )<10){
        result ="less than ten";
        }else{
            result = "more than ten";
        }
        
        return result;
    }
    private static int compareTwoValues (int n1, int n2){
        
        
        if(n1 < n2){
        return n2;
        }else{
        return n1;
        }
        
        
        
    }
}