import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class randomNumGame{

    //include readme that says note you gotta run the game in full screen
    
    
    public static Scanner scanner = new Scanner(System.in);

    //this code is to replace system.out.print since that piece of code is very tedius to write out
    public static void output(String phrase){
        String phraseArray[] = phrase.split("");
        for(int a = 0; a < phraseArray.length; a++){

            try {
                TimeUnit.MILLISECONDS.sleep(10);
                System.out.print(phraseArray[a]);
            } catch (InterruptedException e) {
                System.out.print(phraseArray[a]);
            }
        }
    }

    //this checks to see if the user has pressed enter, and if it did, then I'll give them more "naration"
    public static void enterOutput(String phrase){
        if(scanner.nextLine().isEmpty()){
            output(phrase);
        }
    }

    //this will clear the terminal to make the thing less cluttered
    public static void clearTerminal(){
        if(scanner.nextLine().isEmpty()){
            System.out.print('\u000C');
        }
    }

    //show the mysterious man sprite
    public static void showMan(){
        String phrase = "88888888888888888888888888OOOZZZZZZZ$$$$77$$ZZO888888888888888888888888888888888\n888888888888888888888888OZ$$7IIIIIII?????++?I7$ZO8888888888888888888888888888888\n8888888888888888888888OOZ7I?++==========++=~=+I7$ZO88888888888888888888888888888\n8888888888888888888888OZ7I+~=~====~?$ODNNMMM7=+?I$ZO8888888888888888888888888888\n8888888888888888888888O$I?8$===~?MMMMMMMMMMMM+==+I$ZO888888888888888888888888888\n888888888888888888888OZ$I+MMMONMMMMMMMMMMMMNN7~~=+I$ZO88888888888888888888888888\n888888888888888888888OZ$I+MMMMMMMMMMMMMMMMMNN$~~==?I$OO8888888888888888888888888\n888888888888888888888OZ$?+MMMMMMMMMMMMMNN8O8D7=~~=+?I$ZOOO8888888888888888888888\n888888888888888888888OZ$??MMMMMMMMMMMMMMMMMMMZ7=~===+?I7$ZO888888888888888888888\n888888888888888888888OZ$??MMMMMMMMMMMMMMMMO8DZD?~=+II?+?7$OO88888888888888888888\n88888888888888888OOOOO$7?+MMMMMMMMMMMMMMMMMMMMMMO$777$O+I7ZO88888888888888888888\n888888888888888OOZZ$77II?+MMMMMMMMMMMMMMMMMMMMMM~~~~==~?I$ZO88888888888888888888\n888888888888OOOZ$7II???+==MMMMMMMMMMMMMMMMMMMMMD~~~~==??7ZO888888888888888888888\n88888888888OOZ$II?+===++77MMMMMMMMMMMMMMD8OZ7I?+=~=~I+?7$O8888888888888888888888\n88888888888OZ$I?+==++?I$DMMMMMMMMMMMDZ77IIII??+==II=?I$ZO88888888888888888888888\n888888888888OZ7I+?7+II$ONMMMMMMMMMN8ZZ77I???==7NM=+?7$ZOO88888888888888888888888\n888888888888OOZ$7I?++$OZDMMMMMMMMN8Z$Z8NMMN8=NNMD=?7ZO88888888888888888888888888\n88888888888888OOZZ$7II??+=$MMMMMMMMMMMMMMMMN~=M8++I$ZO88888888888888888888888888\n8888888888888888OOOZZZ$7I?+OMMMMMMMMMMMMMMM7~~M==+I7ZO88888888888888888888888888\n8888888888888888OOZZZZZ$I?=+MMMMMMMMMMMMMMN7=?MM++?7$O88888888888888888888888888\n8888888888888888OZ$77777I?+MMMMMMMMMMMMMMMD$=NMMMZ+?7ZOO888888888888888888888888\n8888888888888888Z$7I????+7MMMMMMMMMMMMMMMMMZNMMMMM$+I7ZO888888888888888888888888\n8888888888888888O$7?++++MMMMMMMMMMMMMMMMMMMMMMMMMMMI+I$ZO88888888888888888888888\n888888888888888OOZ7?+=OMMMMMMMMMMMMMMMMMMMMMMMMMMMMM++I7$ZZOOO888888888888888888\n8888888888OOOOOZZ$I++DMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN=+?I77$$ZZOOO88888888888888\n8888888OOZZ$$$77I?+IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMO~~=++??I77$ZZOO88888888888\n888888OZ$7II?++++=DMMMMMMMMMMMMMMMMMMMMMMMMDNMMMMMMMMMNO+::~==++?I7$ZZOO88888888\n8888OOZ$I?+=====~DMMMMMMMMMMMMMMMMMMMMMMMMNDMMMMMMMMMMM$MMNZ=:~~=+??I7$ZOO888888\n888OO$7I+++$NMMMMMMMMMMMMMMMMMMMMMMMMMMMNNDNMMMMMMMMMMMM=++?=+OM$~~=+?I7$ZOO8888\n8OO$7??+MMND8IIDMMMMMMMMMMMMMMMMMMMMMMMMNDNMMMMMMMMMMMMMI?++7I=+=+NN=~=+I7ZOO888\nOZ$7?+OMMNZD7$77I$ZNMMMMMMMMMMMMMMMMMMMMMDNMMMMMMMMMMMMMNIIIIOI??I??I8=:+I7ZO888\nO$I?=7MMMMNONOOOZ8MMMMMMMMMMMMMMMMMMMNMMMNNMMMMMMMMMMMMMM7$7I8NZI$$$$IZI=+I$Z888\nZ$I+=NMMMMMNMNDMMMMMMMMMMMMMMMMMMMMMNNNNMMMMMMMMMDOMMMMNNDZZ$ZMMD$DNMNNN++?7ZO88\nZ$?+IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNMMMMMMMMMMMDDD$DMMDD8ZMMMDDNZMMM8=?7$O88\nZ7?=MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMNOZMMMMN$MMMMDNMMMM++I$Z88\n$I+OMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMD+I$ZO8\n$I+MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMMMMMMMMMMMMM+I$ZO8\n7?IMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDMMMMMMMMMMMMMNMMM+I$ZO8\n7?$NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMNMMM+I$ZO8\n$I$NNMMMMMMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNMMN?I$O88";
        String phraseArray[] = phrase.split("");
        for(int a = 0; a < phraseArray.length; a++){

            try {
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
        String difficulty = scanner.nextLine();
        difficulty = difficulty.toLowerCase();
        if(difficulty.equals("e")){
            output("so "+username+" took the easy path");
            numberOfTries = 20;
            numSize = 800;
        }else if(difficulty.equals("m")){
            output("so "+username+" took the medium path");
            numberOfTries = 15;
            numSize = 900;
        }else{
            output("so "+username+" took the hard path");
            numberOfTries = 10;
            numSize = 999;
        }
        /*
         * easy = 20 tries & number between 1-800
         * medium = 15 tries & number between 1-900
         * hard = 10 tries & number between 1-999
         */
        
        //generate a random number from 1-999
        int randomNumber = (int)(Math.round(Math.random()* numSize)+1);
        System.out.println(randomNumber);
        /*
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
        enterOutput("Man: All I know is that the number is in between 1-"+numSize);
        enterOutput("Man: But there's a catch, we only have "+numberOfTries+" tries");
        enterOutput("Man: Anymore will seal the door forever");
        clearTerminal();
        output(username+": But how do we enter the numbers?");
        enterOutput("Man: Easy, do you see the three marble slabs?");
        enterOutput("Man: The weight of the right amount of pebbles on each marble slab will open the door");
        enterOutput("Man: For example if we were to guess the number 123");
        enterOutput("Man: Then we would place 1 pebble on the first slab and 2 on the second one and 3 for the third slab");
        clearTerminal();
        output(username+": That's impossible. We can't guess the right number with "+numberOfTries+" tries!");
        enterOutput("Man: Don't worry. The tomb will give us hints and guide us to the answer");
        enterOutput("Man: do you see that wheel over there?");
        enterOutput("Man: If we guess a correct digit but it's in the wrong spot, the wheel will rotate counter clockwise");
        enterOutput("Man: And to give us more info, if we get a digit correct in the right spot then the wheel will rotate clockwis");
        enterOutput("Man: How much the wheel will turn depends on how may digits we get right and how many we get right but in the wrong place");
        enterOutput("Man The wheel will turn 100 degrees to represent each number");
        enterOutput("Man: For example, if the we guess 123 and the number was 345");
        enterOutput("Man: Then the wheel will turn 100 degrees counter clockwise because one of our numbers, 3, is right but in the wrong place");
        enterOutput("Man: The wheel would not turn clockwise because none of our digits are correct and in the right space.");
        enterOutput("Man: Are you ready? lets do this.");
        clearTerminal();*/
        
        //start guessing logic
        int guessCount = 1;
        int guessNumber = 0;
        while((guessNumber != randomNumber) && (guessCount < numberOfTries)){
            scanner.nextLine();
            output("Man: Okay "+username+" this is try number "+ guessCount+ ". Just tell me the number (enter guess):");
            guessNumber = scanner.nextInt();
            guessCount++;
            if(guessNumber == randomNumber){
                output("Man: YES! we did it! it only took us "+ guessCount+" tries!");
            }else{
                //output(""+randomNumber);
                String stringGuessNumber = Integer.toString(guessNumber);
                String stringRandomNumber = Integer.toString(randomNumber);
                String[] arrayGuessNumber = stringGuessNumber.split("");
                String[] arrayRandomNumber = stringRandomNumber.split("");
                
                int countOfRightSpot = 0;
                if(arrayGuessNumber[0].equals(arrayRandomNumber[0])){
                    countOfRightSpot = countOfRightSpot+ 100;
                }
                if(arrayGuessNumber[1].equals(arrayRandomNumber[1])){
                    countOfRightSpot = countOfRightSpot+ 100;
                }
                if(arrayGuessNumber[2].equals(arrayRandomNumber[2])){
                    countOfRightSpot = countOfRightSpot+ 100;
                }
                if(countOfRightSpot == 0){
                    output("Man: Oh no, we got nothing correct");
                }else{
                    output("Man: Look! the wheel turned "+countOfRightSpot +" degrees clockwise");
                }
                
            }
        }
        
        
        
        
        
    }
}