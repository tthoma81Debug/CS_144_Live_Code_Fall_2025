public class Car
{
    int mileage;
    String color;
    String make;
    String model;
    int productionYear;
    boolean isLemon;
    boolean isStarted = false;
    double gasLevel = 0;
    int currentSpeed = 0;


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

    public void setStarted(boolean isStarted)
    {
        this.isStarted = isStarted;
    }
    public boolean getStarted()
    {
        return this.isStarted;
    }

    public void setCurrentSpeed(int currentSpeed)
    {
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed()
    {
        return this.currentSpeed;
    }

}
