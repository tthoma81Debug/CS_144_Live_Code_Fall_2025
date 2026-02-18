//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

       CarLot theCarLot = new CarLot();

        //declare and init car
       Car firstCar = new Car();

       for (int i = 0; i < 100; i++)
       {
           Car newlyMadeCar = new Car();
           theCarLot.theCarLotArray[i] = newlyMadeCar;
       }

       for(int i = 0; i < 100; i++)
       {
           System.out.println("The price of car " + i + " is " + theCarLot.theCarLotArray[i].price);
       }

       System.out.println("Car " + 67 + " is a " + theCarLot.theCarLotArray[67].make);
       System.out.println("Car " + 67 + " is worth " + theCarLot.theCarLotArray[67].price);

       Car highestMileageCar = theCarLot.theCarLotArray[0];
       int index = 0;
        for(int i = 0; i < 100; i++)
        {
            if(theCarLot.theCarLotArray[i].mileage > highestMileageCar.mileage)
            {
                highestMileageCar = theCarLot.theCarLotArray[i];
                index = i;
            }
        }
        System.out.println("The highest mileage car is car " + index  + " with " + highestMileageCar.mileage);



        //theCarLot.theCarLotArray[67].accelerate();





       theCarLot.theCarLotArray[0] = firstCar;
       theCarLot.theCarLotArray[0].start();
       theCarLot.theCarLotArray[0].accelerate();


        /*
        Car secondCar = new Car(50.0);
        secondCar.start();

        Car.headlightPositionStandard = "new regulations now";

        System.out.println("first car regulations " + firstCar.headlightPositionStandard);
        System.out.println("Second car regulations " + secondCar.headlightPositionStandard);


       // System.out.println(secondCar.getCurrentSpeed());

        //Car thirdCar = new Car(40000, "red", "Honda", "Accord", 1995 );



*/
        /*
        firstCar.setGasLevel(100);
        firstCar.start();

        while(firstCar.getGasLevel() > 0)
        {
            firstCar.accelerate();
        }
        firstCar.accelerate();
*/


        /*
        firstCar.setGasLevel(100);
        firstCar.start();
        secondCar.start();
        secondCar.setGasLevel(40);
        secondCar.start();
        */

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("end program");


    }

    public static void otherMethod()
    {
        System.out.println("other method works");
    }

}