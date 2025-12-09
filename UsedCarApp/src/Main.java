//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {

        otherMethod();

        //i want to make a variable that holds a car.
        //what data type do i need?
        // int is number...so miles?
        //string....just a word.
        //? need custom data type. need object.

        //declare and init car
        Car firstCar = new Car();

        Car secondCar = new Car(50.0);
        secondCar.start();

        Car.headlightPositionStandard = "new regulations now";

        System.out.println("first car regulations " + firstCar.headlightPositionStandard);
        System.out.println("Second car regulations " + secondCar.headlightPositionStandard);


       // System.out.println(secondCar.getCurrentSpeed());

        //Car thirdCar = new Car(40000, "red", "Honda", "Accord", 1995 );




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