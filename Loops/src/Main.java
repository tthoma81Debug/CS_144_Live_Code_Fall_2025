import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //counts and prints numbers 1 to 10


        //for reading from keyboard
        Scanner scnr = new Scanner(System.in);

        int loopCounter = 0;
        int theNumber = 0;
        //while loop
        while(loopCounter < 100000)
        {
            //initialize the variable

            //add one to number
            theNumber += 1;

            //print text
            System.out.print("Counting up. The next number is ");

            //print it
            System.out.println(theNumber);

            //lets keep the loop from going forever and update it.
            loopCounter += 1;
        }



        //doWhile loop example
        //count down from 100000 to 0

        int doLoopCounter = 0;
        int doLoopNumber = 100000;
        //do while loop

        do
        {
            //initialize the variable



            //print text
            System.out.print("Counting up. The next number for do while loop is ");

            //print it
            System.out.println(doLoopNumber);

            //add one to number
            doLoopNumber -= 1;

            //lets keep the loop from going forever and update it.
            doLoopCounter += 1;
        }
        while(doLoopCounter <= 100000);


        //for loop
        for(int i = 0; i < 10; i++)
        {
            System.out.println("for loop is running");
            System.out.println("i is now " + i);

        }

        //scooby do. find the coldest spot after reading in temperature readings
        //from different hotspots to track the ghost.



        int readTemp;
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Please enter the temperature the next sensor gave you");
            readTemp = scnr.nextInt();

        }


    }
}