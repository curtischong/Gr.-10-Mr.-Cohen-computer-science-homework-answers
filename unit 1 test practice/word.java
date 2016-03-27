import java.util.Scanner;
import java.util.Arrays;
public class word{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("give me a number");
        String word = scanner.nextLine();
        //String word = ""+num;
        int numLength = word.length();
        String[] wordArray = word.split("");
        //System.out.println(Arrays.toString(wordArray));
            //the num is a positve num
            if(numLength == 1){
                System.out.println("The number is a palindrome");
            }else if(numLength % 2 == 0){
                //the number is an even digit number
                int fail = 1;
                for(int i = 0; i < numLength/2 ;i++){
                    if(wordArray[i].equals(wordArray[numLength-1-i])){
                    }else{
                        fail = 0;
                    }
                    
                }
                if(fail == 1){
                    System.out.println("The number is a palindrome");
                }else{
                    System.out.println("The number is not a palindrome");
                }
            }else{
                //the number is an odd digit number
                int fail = 1;
                for(int i = 0; i < (numLength-1)/2 ;i++){
                    if(wordArray[i].equals(wordArray[numLength-1-i])){
                    }else{
                        fail = 0;
                    }
                    
                }
                if(fail == 1){
                    System.out.println("The number is a palindrome");
                }else{
                    System.out.println("The number is not a palindrome");
                }
            }
    }
}