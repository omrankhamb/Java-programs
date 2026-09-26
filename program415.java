class ParkingTicket
{
    private int ticketNumber;
    private String vehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;

    public ParkingTicket(Builder build)
    {   
        this.ticketNumber = build.ticketNumber;
        this.vehicleNumber = build.vehicleNumber;
        this.floorNumber = build.floorNumber;
        this.spotNumber = build.spotNumber;
        this.entryTime = build.entryTime;
    }       

    public void Display()
    {
        System.out.println("ticketNumber : " + this.ticketNumber);
        System.out.println("Vehicle Numebr is : " + this.vehicleNumber);
        System.out.println("FloorNumber is : " + this.floorNumber);
        System.out.println("spotNumber is " +this.spotNumber);
        System.out.println("Entry Time is " + this.entryTime);
    }

}

class Builder
{
    public int ticketNumber;
    public String vehicleNumber;
    public int floorNumber;
    public int spotNumber;
    public String entryTime;

    public Builder setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
        return this;
        // it will return the current instance of the object
    }

    public Builder setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public Builder setfloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return this;
    }

    public Builder setspotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
        return this;
    }

    public Builder setentryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return this;
    }

    public ParkingTicket build()
    {
        return new ParkingTicket(this);
    }
}


class program415
{
    public static void main(String Arg[])
    {

        ParkingTicket getTicket = new Builder()
        .setTicketNumber(123)
        .setVehicleNumber("MH2639")
        .setfloorNumber(2)
        .setspotNumber(12)
        .setentryTime("9:30PM")
        .build();

        getTicket.Display();

    }
}