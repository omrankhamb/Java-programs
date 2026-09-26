/*  Stratergey designe pattern 

    it is used to requiere to select the behaviour at runtime



 */


interface PaymentStrategy
{
    // by defaule public , static , abstract
    void pay(double amount);
}   

class CashPayment implements PaymentStrategy
{   
    public void pay(double amount)
    {
        System.out.println("Paid cash :  " + amount);
    }

}

class UPIPayment implements PaymentStrategy
{
    public void pay(double amount){
        System.out.println("Paid by UPI : " + amount);
    }
}

class CardPayment implements PaymentStrategy
{
    public void pay(double amount)
    {
        System.out.println("Paid by Card : " + amount);
    }
}

class PaymentService
{
    private PaymentStrategy paymentStratergy;

    public PaymentService(PaymentStrategy paymentStratergy)
    {
        this.paymentStratergy   = paymentStratergy;
    }

    public void processPayment(double amount)
    {
        paymentStratergy.pay(amount);
    }
}

class program416
{
    public static void main(String Arg[])
    {
        PaymentService payementService = new PaymentService(new UPIPayment());

        payementService.processPayment(123.31);
    }
}