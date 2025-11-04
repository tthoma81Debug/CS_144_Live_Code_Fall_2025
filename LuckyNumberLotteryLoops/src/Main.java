import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        //introducing.....

        //arrays
        int[] solutionNumbers = new int[6];

        //setup variables
        int firstNumber = -1;
        int secondNumber = -1;
        int thirdNumber = -1;
        int fourthNumber = -1;
        int fifthNumber = -1;
        int sixthNumber = -1;

        //equivalent for array
        solutionNumbers[0] = -1;
        solutionNumbers[1] = -1;
        solutionNumbers[2] = -1;
        solutionNumbers[3] = -1;
        solutionNumbers[4] = -1;
        solutionNumbers[5] = -1;

        //or we could now use a loop!
        for(int i = 0; i < 6; i++)
        {
            solutionNumbers[i] = - 1;
        }

        //for drawn ticket
        int firstDraw = -1;
        int secondDraw = -1;
        int thirdDraw = -1;
        int fourthDraw = -1;
        int fifthDraw = -1;
        int sixthDraw = -1;



        //get random setup
        Random theGenerator = new Random();

        //generate solution $$$$$$$$$$$$
        firstNumber = theGenerator.nextInt(49) + 1;
        secondNumber = theGenerator.nextInt(49) + 1;
        thirdNumber = theGenerator.nextInt(49) + 1;
        fourthNumber = theGenerator.nextInt(49) + 1;
        fifthNumber = theGenerator.nextInt(49) + 1;
        sixthNumber = theGenerator.nextInt(49) + 1;

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
            if(firstDraw == firstNumber...) //time not feasible
                //must use array....
        }

    }
}