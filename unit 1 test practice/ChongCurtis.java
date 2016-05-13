//Curtis Chong
//step 3. locate .java file should be called LastFirst.java

//importing the scanner the time (for hte delay when outputting) and arrays to see if a number appears in an array (for the mastermind checks)
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Arrays;
public class ChongCurtis{

    //include readme that says note you gotta run the game in full screen

    public static Scanner scanner = new Scanner(System.in);
    //this code is to replace system.out.print since that piece of code is very tedious to write out
    public static void output(String phrase){
        //I'm splitting the word into individual chractors
        String phraseArray[] = phrase.split("");
        //I'm using a for loop because I want to dispaly the text a single character at a time
        for(int a = 0; a < phraseArray.length; a++){
            //using my array of characters, I will be able to display the characters one at a time
            try {
                TimeUnit.MILLISECONDS.sleep(10);
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

    //this will clear the terminal to make the console less cluttered
    public static void clearTerminal(){
        if(scanner.nextLine().isEmpty()){
            System.out.print('\u000C');
        }
    }

    //show the mysterious man "sprite"
    public static void showMan(){
        String phrase = "88888888888888888888888888OOOZZZZZZZ$$$$77$$ZZO888888888888888888888888888888888\n888888888888888888888888OZ$$7IIIIIII?????++?I7$ZO8888888888888888888888888888888\n8888888888888888888888OOZ7I?++==========++=~=+I7$ZO88888888888888888888888888888\n8888888888888888888888OZ7I+~=~====~?$ODNNMMM7=+?I$ZO8888888888888888888888888888\n8888888888888888888888O$I?8$===~?MMMMMMMMMMMM+==+I$ZO888888888888888888888888888\n888888888888888888888OZ$I+MMMONMMMMMMMMMMMMNN7~~=+I$ZO88888888888888888888888888\n888888888888888888888OZ$I+MMMMMMMMMMMMMMMMMNN$~~==?I$OO8888888888888888888888888\n888888888888888888888OZ$?+MMMMMMMMMMMMMNN8O8D7=~~=+?I$ZOOO8888888888888888888888\n888888888888888888888OZ$??MMMMMMMMMMMMMMMMMMMZ7=~===+?I7$ZO888888888888888888888\n888888888888888888888OZ$??MMMMMMMMMMMMMMMMO8DZD?~=+II?+?7$OO88888888888888888888\n88888888888888888OOOOO$7?+MMMMMMMMMMMMMMMMMMMMMMO$777$O+I7ZO88888888888888888888\n888888888888888OOZZ$77II?+MMMMMMMMMMMMMMMMMMMMMM~~~~==~?I$ZO88888888888888888888\n888888888888OOOZ$7II???+==MMMMMMMMMMMMMMMMMMMMMD~~~~==??7ZO888888888888888888888\n88888888888OOZ$II?+===++77MMMMMMMMMMMMMMD8OZ7I?+=~=~I+?7$O8888888888888888888888\n88888888888OZ$I?+==++?I$DMMMMMMMMMMMDZ77IIII??+==II=?I$ZO88888888888888888888888\n888888888888OZ7I+?7+II$ONMMMMMMMMMN8ZZ77I???==7NM=+?7$ZOO88888888888888888888888\n888888888888OOZ$7I?++$OZDMMMMMMMMN8Z$Z8NMMN8=NNMD=?7ZO88888888888888888888888888\n88888888888888OOZZ$7II??+=$MMMMMMMMMMMMMMMMN~=M8++I$ZO88888888888888888888888888\n8888888888888888OOOZZZ$7I?+OMMMMMMMMMMMMMMM7~~M==+I7ZO88888888888888888888888888\n8888888888888888OOZZZZZ$I?=+MMMMMMMMMMMMMMN7=?MM++?7$O88888888888888888888888888\n8888888888888888OZ$77777I?+MMMMMMMMMMMMMMMD$=NMMMZ+?7ZOO888888888888888888888888\n8888888888888888Z$7I????+7MMMMMMMMMMMMMMMMMZNMMMMM$+I7ZO888888888888888888888888\n8888888888888888O$7?++++MMMMMMMMMMMMMMMMMMMMMMMMMMMI+I$ZO88888888888888888888888\n888888888888888OOZ7?+=OMMMMMMMMMMMMMMMMMMMMMMMMMMMMM++I7$ZZOOO888888888888888888\n8888888888OOOOOZZ$I++DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN=+?I77$$ZZOOO88888888888888\n8888888OOZZ$$$77I?+IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO~~=++??I77$ZZOO88888888888\n888888OZ$7II?++++=DMMMMMMMMMMMMMMMMMMMMMMMMDNMMMMMMMMMNO+::~==++?I7$ZZOO88888888\n8888OOZ$I?+=====~DMMMMMMMMMMMMMMMMMMMMMMMMNDMMMMMMMMMMM$MMNZ=:~~=+??I7$ZOO888888\n888OO$7I+++$NMMMMMMMMMMMMMMMMMMMMMMMMMMMNNDNMMMMMMMMMMMM=++?=+OM$~~=+?I7$ZOO8888\n8OO$7??+MMND8IIDMMMMMMMMMMMMMMMMMMMMMMMMNDNMMMMMMMMMMMMMI?++7I=+=+NN=~=+I7ZOO888\nOZ$7?+OMMNZD7$77I$ZNMMMMMMMMMMMMMMMMMMMMMDNMMMMMMMMMMMMMNIIIIOI??I??I8=:+I7ZO888\nO$I?=7MMMMNONOOOZ8MMMMMMMMMMMMMMMMMMMNMMMNNMMMMMMMMMMMMMM7$7I8NZI$$$$IZI=+I$Z888\nZ$I+=NMMMMMNMNDMMMMMMMMMMMMMMMMMMMMMNNNNMMMMMMMMMDOMMMMNNDZZ$ZMMD$DNMNNN++?7ZO88\nZ$?+IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNMMMMMMMMMMMDDD$DMMDD8ZMMMDDNZMMM8=?7$O88\nZ7?=MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMNOZMMMMN$MMMMDNMMMM++I$Z88\n$I+OMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMD+I$ZO8\n$I+MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMMMMMMMMMMMMM+I$ZO8\n7?IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMMMMMMMMMNMMM+I$ZO8\n7?$NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMNMMM+I$ZO8\n$I$NNMMMMMMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMN?I$O88";
        /*How I made the photo :)
         * #1 i went online and found a photo
         * #2 i converted that photo into ascii charactors and copied and pasted it
         * #3 I removed all of the ACTUAL newline charactors and replaced them with \n so they cna be fit onto one line
         * #4 I split each charactor into an array and I print out each charactor with a delay of 1 miliseconds onto the screen
         * #5 note: I'm using a forloop to display the chractors
         */

        //turn the string into an array
        String phraseArray[] = phrase.split("");
        //for loop that loops the println of every chractor
        for(int a = 0; a < phraseArray.length; a++){
            //if I cannot make the delay for the animation, then just print out the photo immediately
            try {
                //delay the program for 1 miliseconds before printing out the photo chractor by charactor
                TimeUnit.MILLISECONDS.sleep(1);
                System.out.print(phraseArray[a]);
            } catch (InterruptedException e) {
                System.out.print(phraseArray[a]);
            }
        }
    }

    //the logic to display the tomb door photo
    //note the logic is the same as displaying the man photo above
    public static void showDoor(){
        String phrase = "..,,,,.,,,..,.....`...........,.,.......,,.,,.,,,,,,,.,,,,.,.,..,..,\n.,..,::,:,,,::;::,,,,,:,,,,,,:.,:,,,,.,,,......``.,,.....,.,,`......\n`,..,;:,,:,,,,::,:::,,::,,,,,,::,:::.,::::,,:,,,..,,......,,,,:::,:,\n,...:;;::;:,,,:;:;;::;;::;;::;;::;;;:::''+++++++++'';'',..,,::,:::::\n...,:;'#';;;;;;;;:;''''++''+''''++#@#@@@@@@@@@@@@@@@@@##''+;',:::;:,\n,,.:,;+#####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##+';';:,;;::':\n,,,,:'+++#####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##+''';;':::::;:;\n,:,,;''+''#+#######@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+++'';;;:::;::;:::\n.,,,,'+''''+++##########@@@@@@@@@@@@@@@@@@@@@@@@@#++'';;::::,:;::;::\n.```.'+';''+++++#########@@@@@@@@@@@@@@@@@@@@@@@@#'';;;;;::,,;::':::\n.....'''''''+++++######@##@@@@@@@@@@@@@@@@@@@@@#++';;;::;::,,:::;;;;\n,::,,'+';;'++++++######@##@@@@@@@@@@@@@@@@@@@@##+''';;;;;:::,:;';;;;\n:,,:;''';;;'+++++++######@@@@@@@@@@@@@@@@@@@@@@+++'';;;;:;;:,:;;';;;\n:::::''';:;'++++++########@@@@@@@@@@@@@@@@@@@@#++'''';;:::;::,;';;;;\n:;:::'+';:;'+'++++#+######@@@@@@@@@@@@@@@@@@@@#++''';;;:::::,,:::,::\n:::::'++;:'''+++++++++####@@@@@@@@@@@@@@@@@@@@#+'+';;;;:::::,.,:,:::\n:,,,:;+++++##++++#####+#####@@@@@@@@@@@@@@@@@@@'+;;;::,,:::,::;';'';\n;;:::;+#+++++##+#+#######@##@@@@@@@@@@@@@@@@@@#+'';;;:,:,:,,,,;';';;\n;;;;::+++'++#######++######@@@@@@@@@@@@@@@@@@@@+''';;:,:,:,,,,;;'';'\n;:;:::++''++#######+++##+##@@@@@@@@@@@@@@@@@@@@+''''::;:,,,,:,;';'''\n;;;::;++++++#######+#####@#@@@@@@@@@@@@@@@@@@@@++''';;;::,:,:::;;'+'\n;;:::;+##++#+##########@@@@@@@@@@@@@@@@@@@@@@@@#++''';;;;;+;;;;;+';+\n:::::;+#+########@###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#++''''+##::;;'+;;\n::::,;+@@@@@@@###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##++@+';;:;'';\n;''''#@@@#@#++#@@@@@@@@@@@@@@@##@###@@@#####@@@@@@@@@@@#+;'';''++;;;\n;;;;''';'';++++#@@@@@@@@@##@@@##@@@@#@@@@@#@@@#@@@@@#+;;''''';;;;;:;\n::;;:;:;;;:;''''+##@@@@##''''''''''''####+#######+'';;;';'''';'';;:;\n:::::;::;+:::;''++++###+'''';;';;;;;+#####+#+##''';;;;;';;'';''''';;\n:;::;;;:;;,.,:''''+'+++';;;;;;;;';;''##+##+'';;;;;;;:;''+;''''';;;';";        
        //turn the string into an array
        String phraseArray[] = phrase.split("");
        //for loop that loops the println of every chractor
        for(int a = 0; a < phraseArray.length; a++){
            //if I cannot make the delay for the animation, then just print out the photo immediately
            try {
                //delay the program for 1 miliseconds before printing out the photo chractor by charactor
                TimeUnit.MILLISECONDS.sleep(1);
                System.out.print(phraseArray[a]);
            } catch (InterruptedException e) {
                System.out.print(phraseArray[a]);
            }
        }
    }

    
    public static void main(String[] args){        
        //clears the screen of text used in older programs
        System.out.print('\u000C');
        //this beginning section is to give the user a backstory

        output("Once upon a time, in a land far far away... (press enter to continue)");
        enterOutput("There lived a kingdom called Lornium with a dying King");
        enterOutput("So the King called upon a treasure hunter named (enter name): ");
        String username = scanner.nextLine();
        output("King: "+username+", you're the only one that I trust with my life");
        enterOutput("King: I need you to go to the the tomb of the Hamid the Great and find a cure");
        enterOutput("But to go to the tomb, "+username+" needed to know where it was");
        enterOutput("So he went and found a great wizard to help him");
        clearTerminal();
        output("Wizard: "+username+", if you wish to find Hamid the great's tomb then listen closely");
        enterOutput("Wizard: You could go through a large plain, an easy path");
        enterOutput("Wizard: The second path is a mountain, a somewhat challenging road");
        enterOutput("Wizard: The last one is an ocean, a difficult journey");
        enterOutput("(choose a difficulty [E,M,H]): ");

        //set difficulty
        int numberOfTries;
        int numSize;
        int numHints;
        //recieve input from user to tell the program what difficulty they want
        String difficulty = scanner.nextLine();
        difficulty = difficulty.toLowerCase();

        //initializing some difficulty variables
        if(difficulty.equals("e")){
            output("so "+username+" took the easy path");
            numberOfTries = 30;
            numSize = 7000;
            numHints = 2;
        }else if(difficulty.equals("m")){
            output("so "+username+" took the medium path");
            numberOfTries = 25;
            numSize = 8000;
            numHints = 1;

            //here I use else to default to hard because if they accidentally press enter the code will break if I use an else if
        }else{
            output("so "+username+" took the hard path");
            numberOfTries = 17;
            numSize = 8999;
            numHints = 0;
        }
        /*note: numbers must be between 1000-8000 cause if the num is a single digit, then the medium and easy hints will give away the entire number
         * easy = 20 tries & number between 1000-8000 & 2 hints
         * medium = 15 tries & number between 1000-9000 & 1 hint
         * hard = 10 tries & number between 1000-9999 & no hints
         */

        //generate a random number from 1-999
        int randomNumber = (int)(Math.round(Math.random()* 4)+1);

        
        
        clearTerminal();
        //this is the code that recieves input to see if hte user wants to skip the story or not
        output("(I know that sometimes a story is painfully long would you like to skip it? [Y/N]): ");
        String skipStory = scanner.nextLine();
        //to ensure that a user can enter a capital or lower case letter and still have it work
        skipStory = skipStory.toLowerCase();
        
        //check if the user has agreed to skip the story
        if(skipStory.equals("n")){ 
            clearTerminal();
            output("He had finally arrived at the tomb entrance");
            enterOutput("After 5 moons he arrived at the entrance of the tomb");
            enterOutput("The only thing seperating him and the cure is a locked stone door");
            enterOutput(username +" could not find a way to open the doors");
            enterOutput("Suddenly a man covered by a dark robe appeared");
            clearTerminal();
            showMan();
            clearTerminal();

            output("Man: "+username+" I've been following you for a long time now");
            enterOutput("Man: I too have been trying to fetch the cure");
            enterOutput("Man: For this door requires a secret number instead of a key");
            enterOutput("Man: To enter this door we will have to guess Hamid's favourite number");
            enterOutput("Man: All I know is that the number is in between 1000-"+numSize);
            enterOutput("Man: But there's a catch, we only have "+numberOfTries+" tries");
            enterOutput("Man: Anymore will seal the door forever");
            clearTerminal();
            output(username+": But how do we enter the numbers?");
            enterOutput("Man: Easy, do you see the three marble slabs?");
            enterOutput("Man: The weight of the right amount of pebbles on each marble slab will open the door");
            enterOutput("Man: For example if we were to guess the number 1234");
            enterOutput("Man: Then we would place 1 pebble on the first slab, 2 on the second one, 3 for the third slab, and 4 four the fourth slab");
            clearTerminal();
            output(username+": That's impossible. We can't guess the right number with "+numberOfTries+" tries!");
            enterOutput("Man: Don't worry. The tomb will give us hints and guide us to the answer");
            enterOutput("Man: do you see that wheel over there?");
            enterOutput("Man: If we guess a correct digit but it's in the wrong spot, the wheel will rotate counter clockwise");
            enterOutput("Man: And to give us more info, if we get a digit correct in the right spot then the wheel will rotate clockwise");
            enterOutput("Man: How much the wheel will turn depends on how may digits we get right and how many we get right but in the wrong place");
            enterOutput("Man: The wheel will turn 100 degrees to represent each number");
            enterOutput("Man: For example, if the we guess 1236 and the number was 3457");
            enterOutput("Man: Then the wheel will turn 100 degrees counter clockwise because one of our numbers, 3, is right but in the wrong place");
            enterOutput("Man: The wheel would not turn clockwise because none of our digits are correct and in the right space.");
            enterOutput("Man: note, if the number is 2111 and we guess 2222");
            enterOutput("Man: then the wheel will ONLY turn 100 degrees clockwise because the number 2 was already guessed correctly");
            clearTerminal();
            output("Man: Oh yea one last thing. I've brought my magic lamp here.");
            enterOutput("Man: All we have to do is rub it and my genie will come out and give us a hint");
            enterOutput("Man: *Wispers* Hey " + username+", I've also heard had Hamid hid a pile of gold in his tomb");
            enterOutput("Man: However, the more tries it takes us to open the door, the less gold we will find. (20 less gold per try)");
            enterOutput("Man: So are you ready? lets do this.");
        }
        //the clear terminal is outside of the if statement because wheather the user skips the story or not I still have to clear it
        clearTerminal();
        //start guessing logic

        int gold = 900; //gold is the point system of the game. each guess and hint will lower their score at the end of the game
        //initialize variables that keeps track of num of guess and how many hints they've used
        int guessCount = 1;
        String guessNumber = "0000";
        int intGuessNumber = 0;
        //I use a variable called win so I can advoid all the string and integer conflicts when I'm testing to see if randomNumber.equals(guessNumber)
        boolean win = false;
        //this loop checks to see if the user has guessed to right number or if they've ran out of tries
        while(win == false && guessCount < numberOfTries){
            //turn the random number into an array that is a string 
            String stringRandomNumber = Integer.toString(randomNumber);
            String[] arrayRandomNumber = stringRandomNumber.split("");

            //ask the user if they want a hint or not and turns their answer into a lower case
            output("Man: Okay "+username+" this is try number "+ guessCount+ ". What is the number? (H fo hint or enter a 4-digit number):");

            //get the guess
            guessNumber = scanner.nextLine();
            //turn to lower case if the user asked for a hint
            guessNumber = guessNumber.toLowerCase();
            //initialize the variable hint phase to tell the program if the user has chosen to ask for a hint
            boolean hintPhase = false;
            if(guessNumber.equals("h")){
                //they've ran out of hints
                output(username+ ": Actually I think we need a hint");
                enterOutput("Man: okay! I'll rub the lamp");                
                if(numHints == 0){
                    enterOutput("Genie: Go away! you can't ask me for a hint");
                    enterOutput("Man: Well... That sucks.");
                    //they are on easy mode (on easy mode they have 2 hints available so when they ask again I don't want the genie to explain how the hints work again)
                    hintPhase = true;
                    //I have to turn hintPhase on because if I don't then the prompt for the user to enter a number won't show up
                }else if(numHints == 1 && difficulty.equals("e")){
                    //since they already know that hints takes away gold, I can safely assume that they don't need a confirmation for getting the hints
                    enterOutput("Genie: Back again?");
                    enterOutput("Genie: Do you want a small or large hint? (S/L):");
                    //set their hint mode to true
                    hintPhase = true;
                }else{
                    //it is the user's first time trying out the hint system so the genie will explain how it works
                    enterOutput("Genie: *yawn* ahhh who has summoned me from my glorious sleep?");
                    enterOutput("Man: Hello! umm we are trying to guess Hamid the great's favourite number and we need a hint");
                    enterOutput("Genie: Okay! would you like a small hint or large hint?");
                    enterOutput("Man: What's the difference?");
                    enterOutput("Genie: Well, if you use a small hint, I will remove 50 pieces of gold from the tomb");
                    enterOutput("Genie: But if you ask for a large hint, then I will remove 200 pieces of gold");
                    enterOutput("Genie: So do you guys still want a hint? (Y/N):");
                    String confirmHint = scanner.nextLine();
                    confirmHint = confirmHint.toLowerCase();

                    if(confirmHint.equals("n")){
                        //if they don't want a hint
                        output("Genie: Well that's okay. just rub the lamp again if you want a hint"); 
                    }else{
                        //if they want a hint
                        output("Genie: Excellent! do you want a small or large hint? (S/L):");
                        hintPhase = true;
                    }
                }
            }

            if(hintPhase == true){                
                //find out the type of hint
                String typeHint = scanner.nextLine();
                typeHint = typeHint.toLowerCase();
                //if the user is out of hints don't give them the prompt
                if(numHints!= 0){
                    //remove a hint from the user
                    numHints--;

                    //ask the user which fiigit they need help with
                    int digitNum;
                    output("which digit do you have problem with? (enter digit):");
                    digitNum = scanner.nextInt();
                    //I have to minus one because people count starting from 0
                    digitNum = digitNum - 1;
                    //if the user chose a small hint
                    if(typeHint.equals("s")){
                        //turn string into int and get the value of the digit that the user needs help with
                        int digitOfRandomNumber = Integer.parseInt(arrayRandomNumber[digitNum]);

                        //if the number is divisible by two then tell the user
                        if(digitOfRandomNumber % 2 == 0){
                            output("Genie: The number to that digit of Hamid's favourite number is a multiple of 2\n");

                            //if the number is not divisible by two then tell the user
                        }else{
                            output("Genie: The number to that digit of Hamid's favourite number is not a multiple of 2\n");
                        }
                        //lower their score
                        gold = gold-50;
                    }else{
                        //if they chose a small hint then give them the digit of the 2nd number
                        output("Genie: The number to that digit of Hamid's favourite number is "+arrayRandomNumber[digitNum]+"\n");
                        //lower their score
                        gold = gold-200;
                    }
                    //if the user is not out of hints give them the prompt
                }
            }

            //if the user had entered hintPhase, then we will ask them to give us a number 
            if(hintPhase == true){
                enterOutput("Man: Okay then lets guess a number (enter 4-digit number):" );
                guessNumber = scanner.nextLine();
            }          

            //sometimes ppl are terrible and don't enter input that is in the correct data type or is missing a few letters
            boolean validInput = true;
            if(guessNumber.equals("")){
                output("Man: Sorry I didn't hear you what's the number?");
                enterOutput("Man: You know what? lets try this again");
                //newline charactor for formatting purposes
                output("\n");
                //note invalid inputes don't increase the counter variable
                validInput = false;
            }else if(4 != String.valueOf(guessNumber).length()||!guessNumber.matches("[0-9]+")){
                output("Man: Sorry, Hamid's favourite number is four digits. Lets try this again");
                output("\n");
                validInput = false;
            }else{
                //increase the variable to count how many times the user has guessed
                guessCount++;
            }

            //if the user guessed the right number, show them their score (num of gold) and the number of tries
            if(validInput == true){
                //turn the number back into an int
                intGuessNumber = Integer.parseInt(guessNumber);
                if(intGuessNumber == randomNumber){
                    //show door img
                    if(scanner.nextLine().isEmpty()){
                        clearTerminal();
                        showDoor();                      
                    }
                    System.out.print('\u000C');
                    //more story
                    output("A loud crumbling sound was heard");
                    enterOutput("Man: Look! It's the door!");
                    enterOutput("Man: Wow who would have thought that it would only take "+guessCount+" tries to enter this place");
                    enterOutput(username + ": Look! we've found the cure! the king is free!");
                    enterOutput("Man: Yes! it's the gold all [" + gold + "] of it!");
                    enterOutput("And here lies the end of the journey. With the king saved and the men return home wealthy");
                    win = true;
                }else{
                    //output(""+randomNumber);
                    String[] arrayGuessNumber = guessNumber.split("");
                    //ignore index is for the guess number's index
                    int[] ignoreIndex = {0,0,0,0};

                    //to see how many times the user guessed a the right digit at the right spot
                    int countOfRightSpot = 0;
                    for(int m = 0; m < 4;m++){
                        if(arrayGuessNumber[m].equals(arrayRandomNumber[m])){
                            countOfRightSpot = countOfRightSpot+ 100;
                            ignoreIndex[m] = 1;
                        }
                    }

                    //tell the user how many times the user got the right digit at the right spot
                    if(countOfRightSpot == 0){
                        output("Man: Oh no, we got nothing correct in the right spot");
                        System.out.println();
                    }else{
                        output("Man: Look! the wheel turned "+countOfRightSpot +" degrees clockwise ("+countOfRightSpot+" correct digits in the right spot)");
                        System.out.println();
                    }

                    //since if the user has already guessed a correct digit in the right spot, then remove that from the array in which we are checking for so a guess such as 2222 would only count for one right answer and no right digit but in the wrong place answers  ( to the number 2111) because they had already guessed the two off the list *the mysterious man explained how this worked
                    //check to see if we got a number that is right but in the wrong spot.
                    //get rid of the indexes of the right numbers that are in the right spot by filling them letters so it won't trigger the .contains method
                    String[] randomWithoutIgnoreIndex = arrayRandomNumber;
                    for(int a = 0;a<4;a++){
                        if(ignoreIndex[a] == 1){
                            randomWithoutIgnoreIndex[a] = "p";
                        }
                    }

                    int countOfRightNumber = 0;
                    for(int c = 0; c < 4 ;c++){
                        // check how many times a digit is in the wrong spot for the number
                        if(ignoreIndex[c] != 1){
                            if(Arrays.asList(randomWithoutIgnoreIndex).contains(arrayGuessNumber[c])){
                                //increase the count by one
                                countOfRightNumber = countOfRightNumber + 100;
                            }
                        }
                    }

                    //tell the user if they did not get any digits that were in the wrong place
                    if(countOfRightNumber == 0){
                        output("Man: Oh no, none of our digits match the real digit");
                        System.out.println();
                    }else{
                        //tell the user how many times they have a right number but it is in the wrong spot
                        output("Man: Look! the wheel turned "+countOfRightNumber +" degrees counter clockwise ("+countOfRightSpot+" correct digits in the incorrect spot)");
                        System.out.println();
                    }
                }
            }
            //minus 20 gold because they guessed once
            gold = gold -20;
        }
        //when you run out of tries you lose and the followgin messages will be displayed
        if(guessCount == numberOfTries){
            //show door img
            if(scanner.nextLine().isEmpty()){
                clearTerminal();
                showDoor();
            }
            System.out.print('\u000C');
            //more story
            output("A loud crumbling sound was heard");
            enterOutput("Man: Oh no. We didn't do it in time. the tomb is sealed forever");
            //tell the user what the number was
            enterOutput("Little did they know that the number turned out to be "+randomNumber);
            enterOutput("So here ends our tale. with the King dying and the men leaving with [0] gold");
        }
    }
}
