import java.util.ArrayList;
import java.util.List;

interface ParkingObserver
{
    // pure virtual function
    // abstract function
    // by default public abstrac final
    void update(int availabelspots);
}

class DisplayBoard implements ParkingObserver
{
    public void update(int availabelspots)
    {
        System.out.println("Display Board : " + availabelspots);
    }
}

class MobileApplication implements ParkingObserver
{
    public void update (int availabelspots)
    {
        System.out.println("Mobule Application : " + availabelspots);
    }
}

class ParkingFloor
{
    private int availabelspots;
     
    private List<ParkingObserver> observers = new ArrayList<>();

    public ParkingFloor (int availabelspots)
    {
        this.availabelspots = availabelspots;
    }

    public void addObservers(ParkingObserver observer)
    {
        observers.add(observer);
    }

    public void removeObservers(ParkingObserver observer)
    {
        observers.remove(observer);
    }

    public void vehicleParked()
    {
        availabelspots--;
        notifyObservers();
    }

    public void vehicleExited()
    {
        availabelspots++;
        notifyObservers();

    }

    private void notifyObservers()
    {
        for(ParkingObserver observer: observers)
        {
            observer.update(availabelspots);
        }
    }
}
class program406
{
    public static void main(String A[])
    {
        ParkingFloor floor = new ParkingFloor(5);

        DisplayBoard board  = new DisplayBoard();
        MobileApplication  mobile = new MobileApplication();

        floor.addObservers(board);
        floor.addObservers(mobile);

        floor.vehicleParked();

        System.out.println("==================================");

        floor.vehicleExited();
    }
}