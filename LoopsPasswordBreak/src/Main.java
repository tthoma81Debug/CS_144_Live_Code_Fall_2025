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
        int userPin = randGen.nextInt(10000); //randomly generated
        //System.out.println("userPin is " + userPin);

        //loop, tries each number 0000 through 9999
        //if it matches, outputs match

        //check entire password space (0000 - 9999)
        int counter = 0;
        while(ourGuess != userPin) //as long as we don't have the password
        {
            ourGuess = counter;
            if(counter == userPin)
            {
                //we found it!
                System.out.println("Found it!");
                System.out.println("userPin is " + userPin);
                System.out.println("ourGuess is " + ourGuess);
                break;
            }
            else
            {
                System.out.println("ourGuess is " + ourGuess + " which is not it");
            }

            counter++;
        }

    }
}