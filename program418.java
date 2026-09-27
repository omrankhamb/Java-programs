/*
    STATE DESIGN PATTERN

    state the pattern alllows an object to change its behaviour when its internal state changes
*/

interface SpotState
{
    void handle();
}

class FreeState implements SpotState
{
    public void handle()
    {
        System.out.println("Free State");
    }
}

class OccupiedState implements SpotState
{
    public void handle()
    {
        System.out.println("Occupied state");
    }
}

class ReservState implements SpotState
{
    public void handle()
    {
        System.out.println("Reserved State");
    }
}

class ParkingLot
{
    private SpotState spotState;

    public void setState(SpotState spotState)
    {
        this.spotState = spotState;
    }

    public void showState()
    {
        spotState.handle();
    }
}


/*
    DIFFERENCE BETWEEN STRATERY AND STATE
    STATEREY  : SELECTION OR TO CHOOSE ALGORITHAM
    STATE : SELECTIO OR FINDING THE STATE
*/
class program418
{
    public static void main(String Arg[])
    {
       
    }
}