enum vehicleType
{
    BIKE,
    CAR,
    TRUCK
}

abstract class Vehicle
{
    // in C++  the abstract methos is
    // virtual string ans()=0;
    protected  String Number;
    public Vehicle(String Number)
    {
        this.Number = Number;
    }
    public abstract void Display();
}

class Car extends Vehicle
{
    public Car(String Number)
    {
        super(Number);
    }

    public void Display()
    {
        System.out.println("Number of the plate is : "+ this.Number);
    }
}


class VehicleFactory
{
    public static Vehicle createVehicle(vehicleType type , String Number)
    {
        if(type == vehicleType.CAR)
        {
            return new Car(Number);
        }
        return  null;
    }
}
class program414
{
    public static void main(String Arg[])
    {
        Vehicle newVehicle = VehicleFactory.createVehicle(vehicleType.CAR , "121");
        newVehicle.Display();
    }
}