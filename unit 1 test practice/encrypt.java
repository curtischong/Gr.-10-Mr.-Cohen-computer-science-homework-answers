import java.util.Scanner;
public class encrypt{
    private static Scanner scanner = new Scanner (System.in);
    public static void main (String[] args){
        System.out.println("give me a string");
        String word = scanner.nextLine();
        for(int i = 0; i < word.length();i++){
            char[] charactor = word.toCharArray();
            System.out.println((int)charactor[i]);
        }
    }
}