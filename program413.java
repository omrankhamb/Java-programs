
class ParkingLot {

    // method is the staic to pass common object 
    private static ParkingLot obj = null;

    // construcor is private
    private ParkingLot() {
        System.out.println("Object is created");
    }

    // thred saftey for one by one by the user
    public static synchronized  ParkingLot getInstance() {
        if (obj == null) {
            obj = new ParkingLot();
        }

        return obj;
    }

    public void Display() {
        System.out.println("The object is here");
    }
}

class program412 {

    public static void main(String Arg[]) {
        System.out.println("Hello world");

        // object is  not created here only the refrence is created
        ParkingLot obj = null;

        obj = ParkingLot.getInstance();
        obj.Display();
    }
}

// creationnal pattern deals with the object creation
/*
Singleton
Factory
BBuilder

are the example of the creation design pattern and others are the Behavioural Design patter
 */
 /*
    Structural designpattern how classed and the objects are connected together

    they use large structure using smaller classes

    adaptor

    Decorator

    Facade


 */
 /*


    Behavioural design pattern with the objects communicate with each other ans how the responsibilites are distributed


    straterge 

    Obdserver

    State

    Chain of the resposibility

    are useful Behavoural Patterns





 */
