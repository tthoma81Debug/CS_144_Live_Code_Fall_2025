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

}
