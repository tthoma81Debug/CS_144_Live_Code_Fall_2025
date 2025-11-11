import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        //introducing.....
        int locationMatches = 0;
        int locationMatchValue = 8; //for five dollars
        int locationMatchTotal = 0;
        int normalMatchTotal = 0;
        int locationMatchesLog = 0;
        int totalMatchesLog = 0;
        int normalMatchValue = 1;
        int totalMatches = 0;
        int winnings = 0;
        int ticketPrice = 2;
        int revenue = 0;
        int expense = 0;
        int profit = 0;
        boolean hitJackpotLog = false;
        int jackpotValue = 1000000; //1 mil


        //arrays
        int[] solutionNumbers = new int[6];
        int[] ticketDraw = new int[6];
        int[] cashAwards = new int[1000000];
        int[] topFiveWinners = new int[5];

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
            //reset counts and add matches from previous run
            int currentUserWinnings = 0;
            totalMatches = 0;
            locationMatches = 0;



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

            if(hitJackpot == true) //if it it still true after the whole loop
            {
                hitJackpotLog = true; //log the jackpot
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
            //System.out.println("YOU ARE ON A ROLL! SO FAR, YOU'VE WON $" + winnings);

            //log totalMatches and locationMatches
            totalMatchesLog += totalMatches;
            locationMatchesLog += locationMatches;

            //calculate and save current user winnings
            currentUserWinnings = normalMatchTotal + locationMatchTotal;
            System.out.println("Current User Winnings: " + currentUserWinnings);
            //and stash in array so we can find top winners later
            cashAwards[q] = currentUserWinnings;

        } //end ticket generation loop
        System.out.println("You have " + totalMatchesLog + " total winning numbers");
        System.out.println("AND you have " + locationMatchesLog  + " total MATCHING winning numbers");
        if(hitJackpotLog == true)
        {
            System.out.println("INCLUDING JACKPOT!!!!!");
        }
        System.out.println("WOW! IN TOTAL, YOU'VE WON $" + winnings);

        revenue = ticketPrice * 1000000;
        expense = winnings;
        profit = revenue - expense;
        System.out.println("Casino made $" + profit);

        System.out.println("Now lets see who won too much and how much they won");
        //lets find the top winner
        int highestSeenSoFar = -1;
        int userNumber = 0;

        for(int i = 0; i < 1000000; i++)
        {
            if(cashAwards[i] > highestSeenSoFar) //if we are looking at something larger than we've seen so far
            {
                highestSeenSoFar = cashAwards[i]; //lets say it's the largest. we'll replace later if necessary
                userNumber = i; //track location
                topFiveWinners[0] = userNumber;
            }
        }

        //now lets find the second highest winner
        userNumber = 0;
        highestSeenSoFar = 0;
        for(int i = 0; i < 1000000; i++)
        {
            if(cashAwards[i] > highestSeenSoFar && i != topFiveWinners[0]) //if we are looking at something larger than we've seen so far
            {
                highestSeenSoFar = cashAwards[i]; //lets say it's the largest. we'll replace later if necessary
                userNumber = i; //track location
                topFiveWinners[1] = userNumber;
            }
        }

        userNumber = 0;
        highestSeenSoFar = 0;
        for(int i = 0; i < 1000000; i++)
        {
            if(cashAwards[i] > highestSeenSoFar && (i != topFiveWinners[0] && i != topFiveWinners[1])) //if we are looking at something larger than we've seen so far
            {
                highestSeenSoFar = cashAwards[i]; //lets say it's the largest. we'll replace later if necessary
                userNumber = i; //track location
                topFiveWinners[2] = userNumber;
            }
        }

        userNumber = 0;
        highestSeenSoFar = 0;
        for(int i = 0; i < 1000000; i++)
        {
            if(cashAwards[i] > highestSeenSoFar && (i != topFiveWinners[0] && i != topFiveWinners[1] && i != topFiveWinners[2])) //if we are looking at something larger than we've seen so far
            {
                highestSeenSoFar = cashAwards[i]; //lets say it's the largest. we'll replace later if necessary
                userNumber = i; //track location
                topFiveWinners[3] = userNumber;
            }
        }

        userNumber = 0;
        highestSeenSoFar = 0;
        for(int i = 0; i < 1000000; i++)
        {
            if(cashAwards[i] > highestSeenSoFar && (i != topFiveWinners[0] && i != topFiveWinners[1] && i != topFiveWinners[2] && i != topFiveWinners[3])) //if we are looking at something larger than we've seen so far
            {
                highestSeenSoFar = cashAwards[i]; //lets say it's the largest. we'll replace later if necessary
                userNumber = i; //track location
                topFiveWinners[4] = userNumber;
            }
        }


       // System.out.println("The biggest winner is user " + userNumber);
       // System.out.println("And that user won a total of $" + highestSeenSoFar);

        //output top winners and their winnings
        for(int i = 0; i < 5; i++)
        {
            int winnerID = topFiveWinners[i];
            System.out.println("The next winner is user " + topFiveWinners[i] + " who won $" + cashAwards[winnerID]);
        }

    }
}