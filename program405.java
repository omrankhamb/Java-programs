
class ParkingTicket
{
    private int ticketnumber;
    private String vehiclenumber;
    private int floornumber;
    private int spotnumber;
    private String entryTime;

    public ParkingTicket(Builder obj)
    {
        this.ticketnumber = obj.ticketnumber;
        this.vehiclenumber = obj.vehiclenumber;
        this.floornumber = obj.floornumber;
        this.spotnumber = obj.spotnumber;
        this.entryTime = obj.entryTime;
    }

    public void display()
    {
        System.out.println("Ticket number : " + this.ticketnumber);
        System.out.println("vehiclenumber is : " + this.vehiclenumber);
        System.out.println("floornumber is  : " + this.floornumber  );
        System.out.println("spotnumber is : " + this.spotnumber);
        System.out.println("entry Time is : " + this.entryTime);
    }

}


class Builder
{
    public int ticketnumber;
    public String vehiclenumber;
    public int floornumber;
    public int spotnumber;
    public String entryTime;

    public Builder setTicketNumber(int i)
    {
        this.ticketnumber = i;
        return this;
    }

    public Builder setVehicleNumber(String str)
    {
        this.vehiclenumber = str;
        return this;
    }

    public Builder floornumber(int f)
    {
        this.floornumber = f;
        return this;
    }

    public Builder setspotNumber(int spotnumber)
    {
        this.spotnumber = spotnumber;
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


class program404
{
    public static void main(String A[])
    {
        ParkingTicket parkingTicket = new Builder()
        .setTicketNumber(11)
        .setVehicleNumber("MH2639")
        .floornumber(3)
        .setspotNumber(34)
        .setentryTime("9.30 Am")
        .build();

        parkingTicket.display();
    }
}