// creatin the factory design pattern

enum VehilceType
{
    CAR ,
    BIKE,
    TRUCK
}

abstract class Vehicle
{
    public int vehicleNumber;

    public Vehicle()
    {
        System.out.println("Vehicle is created");
    }

    abstract void display();
}

class Car extends Vehicle
{

    public Car(int number) 
    {
        this.vehicleNumber = number;
    }

    public void display()
    {
        System.out.println("Plate number is : " + this.vehicleNumber);
    }   
}

class Bike extends Vehicle
{

    public Bike(int number) 
    {
        this.vehicleNumber = number;
    }

    public void display()
    {
        System.out.println("Plate number is Bike :  " + this.vehicleNumber);
    }   
}

class Truck extends Vehicle
{

    public Truck(int number) 
    {
        this.vehicleNumber = number;
    }

    public void display()
    {
        System.out.println("Plate number is Truck : " + this.vehicleNumber);
    }   
}

class VehilceFactory
{
    public static Vehicle getVehilce(int number , VehilceType type )
    {
        switch (type) {
            case VehilceType.CAR:

                    return new Car(number);

            case VehilceType.BIKE:

                    return new Bike(number);

            case VehilceType.TRUCK:

                    return new Truck(number);            
            

            default:
                throw new AssertionError();
        }   
    }
}

class program408
{
    public static void main(String Arg[])
    {

        Vehicle obj = VehilceFactory.getVehilce(121, VehilceType.BIKE);
        obj.display();
    }
}