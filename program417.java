/*
    Observer Design Pattern a one - to - many realtionship
    When one objects state change all intrested objects are notified
    DisplayBoard Notification Object
*/
import java.util.*;
interface ParkingObserver
{
    void update(int availabelSpots);
}


class DisplayBoard implements ParkingObserver
{
    public void update(int availabelSpots)
    {
        System.out.println("Display : " + availabelSpots);
    }
}   

class MobileApplication implements ParkingObserver
{
    public void update(int availabelSpots)
    {
        System.out.println("Mobile App : " + availabelSpots);
    }
}

class ParkingFloor
{
    private int availabelSpots;

    private List<ParkingObserver> parkingObserver = new ArrayList<ParkingObserver>();

    public ParkingFloor(int availabelSpots)
    {
        this.availabelSpots = availabelSpots;
    }

    public void addObserver(ParkingObserver observer)
    {
        parkingObserver.add(observer);
    }

    public void removeObserver(ParkingObserver observer)
    {
        parkingObserver.remove(observer);
    }

    public void notifyObserver()
    {
        for(ParkingObserver observer : parkingObserver)
        {
            observer.update(availabelSpots);
        }
    }

    public void vehicleParked()
    {
        this.availabelSpots--;
        this.notifyObserver();
    }


    public void vehicleExited()
    {
        this.availabelSpots++;
        this.notifyObserver();
    }

}
class program417
{
    public static void main(String Arg[])
    {
        MobileApplication mobileApplication  = new MobileApplication();
        DisplayBoard displayBoard = new DisplayBoard();

        ParkingFloor  parkingFloor = new ParkingFloor(15);

        parkingFloor.addObserver(mobileApplication);
        parkingFloor.addObserver(displayBoard);

        parkingFloor.vehicleParked();


    }
}