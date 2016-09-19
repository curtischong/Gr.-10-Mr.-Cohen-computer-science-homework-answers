import java.util.Scanner;
public class exam
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("4 letter word");
        String word = scanner.nextLine();
        int wordLength = word.length();
        System.out.println(word.substring(0, word.length()/2));
        System.out.println(word.substring(word.length()/2, word.length()));
    }
   
}