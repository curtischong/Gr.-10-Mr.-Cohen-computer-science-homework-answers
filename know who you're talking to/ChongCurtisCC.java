//Curtis Chong Code Change
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class ChongCurtisCC{
    //initilize scanner
    public static Scanner scanner = new Scanner(System.in);

    //this code is to replace system.out.print since that piece of code is very tedious to write out
    public static void output(String phrase){
        //I'm splitting the word into individual chractors
        String phraseArray[] = phrase.split("");
        //I'm using a for loop because I want to dispaly the text a single character at a time
        for(int a = 0; a < phraseArray.length; a++){
            //using my array of characters, I will be able to display the characters one at a time
            try {
                TimeUnit.MILLISECONDS.sleep(15);
                System.out.print(phraseArray[a]);
            } catch (InterruptedException e) {
                System.out.print(phraseArray[a]);
            }
        }
    }

    //this checks to see if the user has pressed enter, and if it did, then I'll give them more "narration"
    public static void enterOutput(String phrase){
        if(scanner.nextLine().isEmpty()){
            output(phrase);
        }
    }

    //This method is used to output the current charactor as a lowercase letter
    public static void turnToLowerAndOutput(int letter){
        if(letter >= 65 && letter <=90){
            //letter is upercase so I add 32 from it to turn the charactor into a lowercase charactor
            System.out.print((char) (letter+32));                    
        }else{
            //letter is already lowercase so I dont have to convert
            System.out.print((char) letter);
        }
    }
    //This method is used to output the current chractor as an uppercase letter
    public static void turnToUpperAndOutput(int letter){
        if(letter >= 97 && letter <=122){
            //letter is lowercase so I minus 32 from it to turn the charactor into an uppercase charactor
            System.out.print((char) (letter-32));                    
        }else{
            //letter is already uppercase so I dont have to convert
            System.out.print((char) letter);
        }
    }

    public static void main(String[] args){
        //clear Terminal
        System.out.print('\u000C');
        //give naration

        output("Hagrid: Harry! What a pleasant suprise come on in!");
        enterOutput("Harry: Thank you Hagrid, I have a letter I need you to write for me. But my hand writing is kinda messy so I'll ask you to write it for me");
        enterOutput("Hagrid: No problem! Who is this letter for? The Giants (Caps), the Muskrats (Lower), or the Supreme Court (Mixed)");
        enterOutput("(Select conversion type G/M/S):");

        String conversionType = scanner.nextLine();
        //I convert the type t lowercase note: I can equals() for a capital or lowercase letter but this method is more concise 
        conversionType = conversionType.toLowerCase();        

        //different responses in the dialogue tree
        output("Harry: I want to send the letter to the ");
        if(conversionType.equals("g")){
            //the user wants the letter to be in all caps
            output("Giants, they can't read tiny lowercase text");
        }else if (conversionType.equals("m")){
            //the user wants the letter to be in lowercase
            output("Muskrats, capital letters are too big for them");
        }else{
            //the user wants the letter to be mixed
            output("suprieme court, I must appear formal");
        }
        enterOutput("Hagrid: Awesome! what is the message you wish for me to write (enter message):");
        //recieve the user's message
        String message = scanner.nextLine();

        output("Hagrid: Here you go Harry here is your message \n");
        //loop through string and put each charactor into a char array
        //using this array, I will use the loop to find the current chractor I'm looking at and decide weather to output it as a cap or lowrcase letter
        for(int i = 0; i < message.length();i++){
            //turn the userintput into a char array
            char[] messageArray = message.toCharArray();
            
            //I then turn the current charactor that I'm looping into an int so i get the ascii value of the current charactor
            int currentChar = (int)messageArray[i];

            if(conversionType.equals("g")){
                //if the user wants all caps
                turnToUpperAndOutput(currentChar);
            }else if(conversionType.equals("m")){
                //if the user wants lowercase
                turnToLowerAndOutput(currentChar);
            }else{
                //user wants mixed
                if(i==0 && (currentChar >= 97 && currentChar <=122 || currentChar >= 65 && currentChar <=90)){
                    //if this is the first itteration to the loop AND this is a charactor, make it cap
                    turnToUpperAndOutput(currentChar);
                }else if((int)messageArray[i-1] == 32){
                    turnToUpperAndOutput(currentChar);
                }else{
                    //make letter lowercase and output it
                    turnToLowerAndOutput(currentChar);
                }
            }
        }
        //this gives some detail t the program
        enterOutput("Harry: Thanks Hagrid have a nice day!");
        enterOutput("Hagrid: Anytime Harry! See you soon!");
    }
}