import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public enum GhostStatus {UNKNOWN, CAUGHT, ACTUALGHOST, CLOSEDCASE}

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String reply = "";
        GhostStatus mysteryOne = GhostStatus.UNKNOWN;

        System.out.println("The current status is " + mysteryOne);

        System.out.println("Did you find the ghost for your current mystery?");
        reply = scnr.nextLine();

        if(reply.equals("yes"))
        {
            mysteryOne = GhostStatus.CAUGHT;
        }
        else if(reply.equals("no"))
        {
            mysteryOne = GhostStatus.ACTUALGHOST;
        }
        else
        {
            mysteryOne = GhostStatus.CLOSEDCASE;
            System.out.println("sighs.....it was a yes no question");
        }

        System.out.println("Case status of mystery is " +  mysteryOne);


        /*
        for(int i = 0; i < 100; i++)
        {
            System.out.println("outer loop ran again");
            for(int r = 0; r < 100; r++)
            {
                System.out.println("inner loop ran i is " + i);
                System.out.println("inner loop same iteration r is " + r );
            }
        }

        */




    }
}