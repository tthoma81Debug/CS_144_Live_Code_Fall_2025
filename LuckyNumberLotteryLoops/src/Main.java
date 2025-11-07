import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        //introducing.....
        int locationMatches = 0;
        int locationMatchValue = 5; //for five dollars
        int locationMatchTotal = 0;
        int normalMatchTotal = 0;
        int normalMatchValue = 2;
        int totalMatches = 0;
        int winnings = 0;
        int jackpotValue = 1000000; //1 mil


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


        //for every ticket
        for(int q = 0; q < 1000000; q++)
        {
            //TO DO MONDAY:
            //SET TICKET AMOUNTS TO 0 EACH TIME. OBSERVE COUNT


            //generate ticket draw
            System.out.print("Ticket Draw: ");
            for (int i = 0; i < 6; i++) {
                //whatever is here will run 6 times.
                //uncomment when not testing
                ticketDraw[i] = theGenerator.nextInt(49) + 1;
                System.out.print(ticketDraw[i] + " ");

                //test code. do not put casino out of business :)
                //ticketDraw[i] = solutionNumbers[i];
                //System.out.print(ticketDraw[i] + " ");
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

            //for now, check to make sure it's not jackpot
            //if(ticketDraw[0] == solutionNumbers[0] && )

            boolean hitJackpot = true; //assume hit jackpot
            for (int i = 0; i < 6; i++) {
                if (ticketDraw[i] != solutionNumbers[i]) {
                    //then we have a number that don't match...bummer
                    hitJackpot = false;
                    break; //no point in checking further
                }
            }


            //lets try a loop
            for (int r = 0; r < 6; r++) {
                for (int i = 0; i < 6; i++) {
                    //compare first number of ticket to first number of solution and go up from there
                    if (ticketDraw[r] == solutionNumbers[i]) {
                        System.out.println("Number Found in Solution!");
                        totalMatches++;

                        if (r == i) //if we are comparing the number in the same spot
                        {
                            //then we have number and number position match
                            System.out.println("NUMBER MATCH " + " in spot " + i);
                            locationMatches++;
                        }

                    }

                }
            } //end exterior loop.

            System.out.println("Total Normal Matches: " + totalMatches);
            System.out.println("Total LOCATION!! Matches: " + locationMatches);

            //calculate winnings
            normalMatchTotal = totalMatches * normalMatchValue;
            locationMatchTotal = locationMatches * locationMatchValue;

            winnings += (normalMatchTotal + locationMatchTotal);

            //if won jackpot
            if (hitJackpot == true) {
                winnings += jackpotValue;
                System.out.println("JACKPOT!!!! WINNER!!!!! WINNER!!!!!!");
            }

            System.out.println("normal match total is " + normalMatchTotal);
            System.out.println("location match total is " + locationMatchTotal);
            System.out.println("YOU ARE ON A ROLL! SO FAR, YOU'VE WON $" + winnings);

        } //end ticket generation loop
        System.out.println("WOW! IN TOTAL, YOU'VE WON $" + winnings);

    }
}