import java.util.Scanner;
import java.util.Arrays;

public class arraySort{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("how many names are there?");
        int numArrays = scanner.nextInt();
        String[] names = new String[numArrays];
        
        int num = 1;
        
        for(int i = 0; i<numArrays; i++){
            i++;
            System.out.println("Enter name "+i+":");
            i--;
            names[i] = scanner.nextLine();
        }
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for(int i = 0;i<numArrays;i++){
            System.out.println("Name "+i+": "+names[i]);
        }
    }    
}