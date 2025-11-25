import javax.swing.*;
import java.util.Random;

public class Main {

    public enum CustomerFlags {BROKE, NORMAL, SUSPECT, CHEATER, PREFERRED};

    static void firstMethod(int incomingNumber)
    {
        System.out.println("First Method is WORKING!!!!");
        System.out.println("The number we received is " + incomingNumber);
    }


    static int doJackpotStuff(int[] ticketDraw, int[] solutionNumbers, int revenue, int expense)
    {
        boolean hitJackpot = true;
        int dynamicJackpotValue = 0;

        hitJackpot = hitJackpot(ticketDraw, solutionNumbers);
        dynamicJackpotValue = adjustJackpot(revenue, expense, hitJackpot);
        announceJackpot(hitJackpot, dynamicJackpotValue);

        //determine profit or loss after jackpot numbers
        return dynamicJackpotValue;
    }

    static boolean hitJackpot(int[] ticketDraw, int[] solutionNumbers)
    {
        //test logic jackpot
        ticketDraw[0] = solutionNumbers[0];
        ticketDraw[1] = solutionNumbers[1];
        ticketDraw[2] = solutionNumbers[2];
        ticketDraw[3] = solutionNumbers[3];
        ticketDraw[4] = solutionNumbers[4];
        ticketDraw[5] = solutionNumbers[5];


        //see if we hit jackpot
            boolean hitJackpot = true; //assume hit jackpot
            for (int i = 0; i < 6; i++) {
                if (ticketDraw[i] != solutionNumbers[i]) {
                    //then we have a number that don't match...bummer
                    hitJackpot = false;
                    break; //no point in checking further
                }

            }
            return hitJackpot;
    }

    static int adjustJackpot (int revenue, int expense, boolean jackpotAwarded)
    {
        int currentProfit = profitCalculation(revenue, expense);
        int suggestedJackpot;

        if(currentProfit > 2000000)
        {
            suggestedJackpot = 1000000;
        }
        else if (currentProfit <= 2000000 && currentProfit > 500000)
        {
            suggestedJackpot = 200000;
        }
        else if (currentProfit <= 500000 && currentProfit > 100000)
        {
            suggestedJackpot = 70000;
        }
        else if (currentProfit <= 100000 && currentProfit > 0)
        {
            suggestedJackpot = currentProfit;
        }
        else
        {
            suggestedJackpot = 10000;
        }

        return suggestedJackpot;
    }

    static void originalJackpotCalc(boolean hitJackpotLog, int revenue, int expense, int  winnings, int ticketPrice)
    {
        int profit;
        //if we hit jackpot, adjust logic, announce it
        if(hitJackpotLog == true)
        {
            System.out.println("INCLUDING JACKPOT!!!!!");
        }
        System.out.println("WOW! IN TOTAL, YOU'VE WON $" + winnings);

        revenue = ticketPrice * 1000000;
        expense = winnings;
        profit = revenue - expense;
        System.out.println("Casino made $" + profit);

    }

    static void announceJackpot(boolean hitJackpot, int currentAward)
    {
        if(hitJackpot == true)
        {
            System.out.println("WOOOOHOOOOOOO! WE HAVE A JACKPOT!!!!!!");
            System.out.println("THE JACKPOT AWARD IS " +  currentAward);
        }
        else
        {
            System.out.println("No jackpot awarded. Sorry....");
        }

    }



    static void announceLosses(int ourRevenue, int cost, int profitMargin)
    {
        System.out.println("Revenue is " + ourRevenue);
        System.out.println("Expense is " + cost);
        System.out.println("We uh....are planning profit margin for a later build. sorry");

        if(ourRevenue > cost)
        {
            System.out.println("Congratulations! The house wins again");
        }
        else
        {
            System.out.println("Umm....what went wrong? How can this be? We are supposed to win every time");
        }
    }

    static void announceLosses(String firstString, String secondString, String thirdString)
    {
        System.out.println("The one with three strings was called");
    }

    static void announceLosses(int revenue, int expense, boolean costOnly)
    {
        if(costOnly == true)
        {
            System.out.println("we are only printing expenses. not revenue or margin");
            System.out.println("Expenses are " + expense);
        }
        else
        {
            System.out.println("We are going to print revnue, expenses, and margin but are too tired because of reasons");
        }

    }

    static void announceLosses(int cost)
    {
        System.out.println("cost is " + cost);
    }


    static int profitCalculation(int ourRevenue, int ourCost)
    {
        int profitOrLoss = ourRevenue - ourCost;
        return profitOrLoss;

    }

    static int dynamicTicketPrice(int revenue, int cost)
    {
        int profitOrLoss = revenue - cost;
        int returnThis;
        if(profitOrLoss > 0)
        {
            System.out.println("Hmm. should probably lower prices before scrutiny of profits");
            returnThis = 2;
        }
        else {
            System.out.println("Oh no! losing money. Raise the prices!!!");
            returnThis = 5;
        }

        //ok. done now
        return returnThis;
    }




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
        int ticketPrice = 3;
        int revenue = 0;
        int expense = 0;
        int profit = 0;
        int dynamicJackpotValue;
        boolean hitJackpotLog = false;
        int jackpotValue = 10000000; //10 mil

        //flag ranges
        final int preferredRange = 100000;
        final int cheaterRange = 30;
        final int suspectRange = 20;
        final int normalRange = 10;

        //flag counts
        int preferredRangeLog = 0;
        int cheaterRangeLog = 0;
        int suspectRangeLog = 0;
        int normalRangeLog = 0;
        int brokeRangeLog = 0;


        int oneMatchAward = locationMatchValue;
        int twoMatchesAward = 10;
        int threeMatchesAward = 500;
        int fourMatchesAward = 500000;
        int fiveMatchesAward = 1200000;
        int totalMatchesAward = 0;
        boolean hitJackpot = true;

        //Customer flags
        CustomerFlags exampleFlag = CustomerFlags.BROKE;


        //arrays
        int[] solutionNumbers = new int[6];
        int[] ticketDraw = new int[6];
        int[] cashAwards = new int[1000000];
        int[] topFiveWinners = new int[5];
        int[] locationMatchTotals = {0,0,0,0,0};
        int[][] luckyNumbers = new int[1000][1000];

        //get random setup
        Random theGenerator = new Random();


        CustomerFlags[] theCustomerFlags = new CustomerFlags[1000000];

        theCustomerFlags[0] = CustomerFlags.BROKE;


        //prepareLuckyNumbers
        //For every row
        for(int i = 0; i < 1000; i++)
        {
            //for every column
            for(int r = 0; r < 1000; r++)
            {
                luckyNumbers[i][r] = theGenerator.nextInt(49) + 1;
            }
        }



        //lets see the lucky numbers
        for(int i = 0; i < 1000; i++)
        {
            //for every column
            for(int r = 0; r < 1000; r++)
            {
                System.out.println("Row " + i);
                System.out.println("Column " + r);
                System.out.println("The number in this spot is " + luckyNumbers[i][r]);
            }
        }



        //or we could now use a loop!
        for(int i = 0; i < 6; i++)
        {
            solutionNumbers[i] = - 1;
        }



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
            totalMatchesAward = 0;



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

            //calculate winnings from location matches
            if(locationMatches == 1)
            {
                totalMatchesAward += oneMatchAward;
                locationMatchTotals[0]++;
            }
            else if(locationMatches == 2)
            {
                totalMatchesAward += twoMatchesAward;
                locationMatchTotals[1]++;
            }
            else if(locationMatches == 3)
            {
                totalMatchesAward += threeMatchesAward;
                locationMatchTotals[2]++;
            }
            else if(locationMatches == 4)
            {
                totalMatchesAward += fourMatchesAward;
                locationMatchTotals[3]++;
            }
            else if(locationMatches == 5)
            {
                totalMatchesAward += fiveMatchesAward;
                locationMatchTotals[4]++;
            }

            winnings += (normalMatchTotal + totalMatchesAward);

            //if won jackpot
            /* announce jackpot
            if (hitJackpot == true) {
                winnings += jackpotValue;
                System.out.println("JACKPOT!!!! WINNER!!!!! WINNER!!!!!!");
            }
            */


            System.out.println("normal match total is " + normalMatchTotal);
            System.out.println("Total match award is " + totalMatchesAward);
            //System.out.println("YOU ARE ON A ROLL! SO FAR, YOU'VE WON $" + winnings);

            //log totalMatches and locationMatches
            totalMatchesLog += totalMatches;
            locationMatchesLog += totalMatchesAward;

            //calculate and save current user winnings
            currentUserWinnings = normalMatchTotal + totalMatchesAward;
            System.out.println("Current User Winnings: " + currentUserWinnings);
            //and stash in array so we can find top winners later
            cashAwards[q] = currentUserWinnings;

        } //end ticket generation loop
        System.out.println("You have " + totalMatchesLog + " total winning numbers");
        System.out.println("AND you have " + locationMatchesLog  + " total MATCHING winning numbers");




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

        //now assign flags to users based on winnings
        for(int i = 0; i < 1000000; i++)
        {
            if(cashAwards[i] > preferredRange)
            {
                theCustomerFlags[i] = CustomerFlags.PREFERRED;
                preferredRangeLog++;
            }
            else if (cashAwards[i] <= preferredRange && cashAwards[i] > cheaterRange)
            {
                theCustomerFlags[i] = CustomerFlags.CHEATER;
                cheaterRangeLog++;
            }
            else if (cashAwards[i] <= cheaterRange && cashAwards[i] > suspectRange)
            {
                theCustomerFlags[i] = CustomerFlags.SUSPECT;
                suspectRangeLog++;
            }
            else if (cashAwards[i] <= suspectRange && cashAwards[i] > normalRange)
            {
                theCustomerFlags[i] = CustomerFlags.NORMAL;
                normalRangeLog++;
            }
            else
            {
                theCustomerFlags[i] = CustomerFlags.BROKE;
                brokeRangeLog++;
            }

        }




        // System.out.println("The biggest winner is user " + userNumber);
        // System.out.println("And that user won a total of $" + highestSeenSoFar);

        //output total matches

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Total Matches where " + (i+1) + " matches exist: " + locationMatchTotals[i]);
        }


        //output top winners and their winnings
        for(int i = 0; i < 5; i++)
        {
            int winnerID = topFiveWinners[i];
            System.out.println("The next winner is user " + topFiveWinners[i] + " who won $" + cashAwards[winnerID]);
            System.out.println("The winners flags are " + theCustomerFlags[winnerID]);
        }

        System.out.println("Total users in flagged as preferred " + preferredRangeLog);
        System.out.println("Total users in flagged as cheaters " + cheaterRangeLog);
        System.out.println("Total users in flagged as suspect " + suspectRangeLog);
        System.out.println("Total users in flagged as normal " + normalRangeLog);
        System.out.println("Total users in flagged as broke " + brokeRangeLog);

        int nextLuckyNumber = theGenerator.nextInt(49) + 1;


        int profitOrLoss = profitCalculation(revenue, expense);

        //refined jackpot logic
        profitOrLoss -= doJackpotStuff(ticketDraw,solutionNumbers,revenue, expense);


        //jackpotLogic
        //hitJackpot = hitJackpot(ticketDraw, solutionNumbers);
        //dynamicJackpotValue = adjustJackpot(revenue, expense, hitJackpot);
        //announceJackpot(hitJackpot, dynamicJackpotValue);

        //determine profit or loss after jackpot numbers
        //end jackpot logic

        System.out.println(" The profit or loss returned from the profitCalculation and after jackpot is " + profitOrLoss);

        int suggestNewTicketPrice = dynamicTicketPrice(revenue, expense);
        if(suggestNewTicketPrice >= 5)
        {
            System.out.println("Woah. we gotta bring sales up. suggesting " + suggestNewTicketPrice);
        }
        else
        {
            System.out.println("Too much heat. We are getting too rich. Cool it with ticket price " + suggestNewTicketPrice);
        }






        /*
        for(int i = 0; i < 10; i++)
        {
            firstMethod(); //method (or function) call
        }
        */
    }
}