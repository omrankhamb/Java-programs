
enum VehicleType
{
    BIKE,
    CAR , 
    CYCLE
}

abstract class Vehicle
{
    public abstract void number(int num);
    public abstract void Display();
    public int i = 0;

}

class Car extends Vehicle
{
    public void number(int number)
    {
        super.i = number;
    }

    public void Display()
    {
        System.out.println("Number of car is ");
    }
}

class VehicleFactory
{
    public static Vehicle getVehicle(VehicleType type)
    {
        if(type == VehicleType.CAR)
        {
            return new Car();
        }

        return new Car();
    }
}
class program410
{
    public static void main(String Arg[])
    {
        Vehicle obj = VehicleFactory.getVehicle(VehicleType.CAR);
        obj.Display();
        
    }
}