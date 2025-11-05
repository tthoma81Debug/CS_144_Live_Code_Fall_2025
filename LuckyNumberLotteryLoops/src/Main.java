import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        //introducing.....

        //arrays
        int[] solutionNumbers = new int[6];
        int[] ticketDraw = new int[6];

        //or we could now use a loop!
        for(int i = 0; i < 6; i++)
        {
            solutionNumbers[i] = - 1;
        }

        //get random setup
        Random theGenerator = new Random();

        //generate solution $$$$$$$$$$$$
        System.out.print("Solution: ");
        for(int i = 0; i < 6; i++)
        {
            //whatever is here will run 6 times.
            solutionNumbers[i] = theGenerator.nextInt(49) + 1;
            System.out.print(solutionNumbers[i] + " ");
        }
        System.out.print("\n"); //newline



        //generate ticket draw
        System.out.print("Ticket Draw: ");
        for(int i = 0; i < 6; i++)
        {
            //whatever is here will run 6 times.
            ticketDraw[i] = theGenerator.nextInt(49) + 1;
            System.out.print(ticketDraw[i] + " ");
        }
        System.out.print("\n"); //newline


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
        int totalMatches = 0;
        int winnings = 0;
        for(int r = 0; r < 6; r++)
        {
            for(int i = 0; i < 6; i++)
            {
                //compare first number of ticket to first number of solution and go up from there
                if(ticketDraw[r] == solutionNumbers[i])
                {
                    System.out.println("Number Found in Solution!");
                    totalMatches++;

                    if(r == i) //if we are comparing the number in the same spot
                    {
                        //then we have number and number position match
                        System.out.println("NUMBER MATCH " + " in spot " + i);
                    }
                }
               
            }
        } //end exterior loop.

        System.out.println("Total Matches: " + totalMatches);

        //calculate winnings
        winnings = totalMatches * 2;

        System.out.println("YOU WON!!! $" + winnings);


    }
}