
class ParkingTicket
{
    private int ticketNumber;
    private String vehicleNumber;
    private int floorNumber;
    private int spotNumber;
    private String entryTime;


    public ParkingTicket(Builder builder)
    {
        this.ticketNumber  = builder.ticketNumber;
        this.vehicleNumber = builder.vehicleNumber;
        this.floorNumber = builder.floorNumber;
        this.spotNumber = builder.spotNumber;
        this.entryTime = builder.entryTime;
    }

    public void Display()
    {
        System.out.println("Ticket Number  : " + this.ticketNumber);
        System.out.println("Vehicle Number is : " + this.vehicleNumber);
        System.out.println("floorNumber is " + this.floorNumber);
        System.out.println("Spot Number is : " + this.spotNumber);
        System.out.println("Entry time is : " + this.entryTime);
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
    }

    public Builder setfloorNumber(int floorNumber)
    {
        this.floorNumber = floorNumber;
        return this;
    }

    public Builder setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public Builder setSpotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
        return this;
    }

    public Builder setEntryTime(String entryTime)
    {
        this.entryTime = entryTime;
        return this;
    }

    public ParkingTicket build()
    {
        return new ParkingTicket(this);
    }


    
}

class program411
{
    public static void main(String arg[])
    {
        ParkingTicket obj = new Builder()
        .setTicketNumber(1)
        .setfloorNumber(2)
        .setSpotNumber(3)
        .setEntryTime("9:30")
        .setVehicleNumber("Mh2639")
        .build();

        obj.Display();

    }
}