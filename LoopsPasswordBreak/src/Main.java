import java.util.Random;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    /*
        Scenario: We have a unknown (random) 4 digit pin
        need to figure out what it is, using a loop
        and brute force method (guessing over and over)
        note: only use fake passwords, not real pins
     */
    public static void main(String[] args)
    {
        //setup
        Random randGen = new Random();
        int ourGuess = -1;
        int userPin = randGen.nextInt(2000001); //randomly generated
        //System.out.println("userPin is " + userPin);

        //loop, tries each number 0000 through 9999
        //if it matches, outputs match

        //check entire password space
        int counter = 0;
        int nextGuess = 0;
        while(ourGuess != userPin) //as long as we don't have the password
        {
            ourGuess = counter;
            nextGuess = randGen.nextInt(2000001);
            if(nextGuess == userPin)
            {
                //we found it!
                System.out.println("Found it!");
                System.out.println("userPin is " + userPin);
                System.out.println("nextGuess is " + nextGuess);

                break;
            }
            else
            {
                System.out.println("nextGuess is " + nextGuess + " which is not it and is guess number " + counter);
            }

            counter++;
        }

    }
}