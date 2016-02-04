import java.util.Scanner;
public class Name{
private static Scanner get = new Scanner(System.in);
public static void main (String[] args){
 int value1, value2;
 int quotient, remainder;
 System.out.print("Enter a number: ");
 value1 = get.nextInt();
 System.out.print("Enter another number: ");
 value2 = get.nextInt();
 //To get a quotient without the decimal value, just assign
 // it to an integer, like this:
 quotient = value1 / value2;
 //To get the remainder, enter the same equation, but with a %
 // (modulus) sign instead of the division sign
 remainder = value1 % value2;
 //Output the result
 System.out.println("Equation " + value1 + " divided by " + value2 + " = " + quotient + " remainder " + remainder);
}
}