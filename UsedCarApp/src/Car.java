import java.util.Random;

public class Car
{
    private int mileage;
    private String color;
    private String make;
    private String model;
    private int productionYear;
    private boolean isLemon;
    private boolean isStarted = false;
    private double gasLevel = 0;
    private int currentSpeed = 0;
    private Random rand = new Random();

    public static String headlightPositionStandard = "Headlight law 1 (sedan)";


    public Car()
    {
        System.out.println("Constructing Car");
        this.setGasLevel(100);
        //this.start();
        //this.accelerate();
    }

    public void randomCarData()
    {
        //generateMiles();
        //generateMake
        //generatePurchasePrice
        //generateColor
    }

    public int generateMiles()
    {
        int theMiles = rand.nextInt(300000) + 1;
        return theMiles;
    }

    public String generateMake()
    {
        int generatedNumber = rand.nextInt(4);
        String theCarMake;

        if(generatedNumber == 0)
        {
            theCarMake = "Fiat";
        }
        else if(generatedNumber == 1)
        {
            theCarMake = "Toyota";
        }
        else if(generatedNumber == 2)
        {
            theCarMake = "Honda";
        }
        else
        {
            theCarMake = "Ford";
        }

        return theCarMake;
    }

    public Car(double startingGas)
    {
        System.out.println("Second Constructor Called");
        this.setGasLevel(startingGas);
    }

    public Car(int mileage, String color, String make, String model, int productionYear)
    {
        this.mileage = mileage;
        this.color = color;

        this.make = make;
        this.model = model;

        this.productionYear = productionYear;

        System.out.println("Crazy long constructor called...");
    }


    public void start()
    {
        if(getGasLevel() > 0)
        {
            setStarted(true);
            System.out.println("Car is started!");
        }
        else
        {
            setStarted(false);
            System.out.println("umm...gas? can't start a car without gas unless it's electric i guess");
        }
    }

    public void accelerate()
    {
      if(getStarted() == true)
      {
          if(getGasLevel() > 0)
          {
              int beforePedalSpeed = getCurrentSpeed();
              int newSpeed = beforePedalSpeed + 20;
              double beforeGasLevel = getGasLevel();
              double newGasLevel;
              setCurrentSpeed(newSpeed);
              System.out.println("Car is accelerating! and is going " + getCurrentSpeed() + " mph!");

              newGasLevel = beforeGasLevel - 30;
              if(newGasLevel < 0)
              {
                  newGasLevel = 0;
              }

              setGasLevel(newGasLevel);
              System.out.println("Gas Level is now " + newGasLevel);
          }
          else
          {
              System.out.println("You aint got no gas in here and this thing is not electric");
          }
      }
      else
      {
          System.out.println("Car is not started :(. It aint goin nowhere");
      }

    }




    //accessors and mutators
    public void setGasLevel(double gasLevel)
    {
        this.gasLevel = gasLevel;
    }
    public double getGasLevel()
    {
        return this.gasLevel;
    }

    private void setStarted(boolean isStarted)
    {
        this.isStarted = isStarted;
    }
    private boolean getStarted()
    {
        return this.isStarted;
    }

    private void setCurrentSpeed(int currentSpeed)
    {
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed()
    {
        return this.currentSpeed;
    }

}
