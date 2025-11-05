import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        //introducing.....

        //arrays
        int[] solutionNumbers = new int[6];

        //or we could now use a loop!
        for(int i = 0; i < 6; i++)
        {
            solutionNumbers[i] = - 1;
        }

        //get random setup
        Random theGenerator = new Random();

        //generate solution $$$$$$$$$$$$
        for(int i = 0; i < 6; i++)
        {
            //whatever is here will run 6 times.
            solutionNumbers[i] = theGenerator.nextInt(49) + 1;
        }


        System.out.println("Solution: " + firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber + " " + sixthNumber);

        //generate ticket draw
        firstDraw = theGenerator.nextInt(49) + 1;
        secondDraw = theGenerator.nextInt(49) + 1;
        thirdDraw = theGenerator.nextInt(49) + 1;
        fourthDraw = theGenerator.nextInt(49) + 1;
        fifthDraw = theGenerator.nextInt(49) + 1;
        sixthDraw = theGenerator.nextInt(49) + 1;

        //show ticket draw
        System.out.println("Draw: " + firstDraw + " " + secondDraw + " " + thirdDraw + " " + fourthDraw + " " + fifthDraw + " " + sixthDraw);

        //determine if any of the numbers in the draw match numbers in solution (not counting place)

        /*
        if(firstDraw == firstNumber)
        {
            System.out.println("Match!");
        }
        if(firstDraw == secondNumber)
        {
            System.out.println("Match!");
        } //gonnna take forever
        */

        //lets try a loop
        for(int i = 0; i < 6; i++)
        {
            //will run 6 times
          //  if(firstDraw == firstNumber...) //time not feasible
                //must use array....
        }

    }
}