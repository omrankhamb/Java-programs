// Characterstics are by default public static and final
// Behaviours are by default abstract and public

interface A
{
    int Addition(int iNo,int iNo2);
    int Substraction(int iNo1,int iNo2);    // By deafault ans abstract

}

interface B
{
    int Multiplication(int iNo1,int iNo2);
    int Division(int iNo1,int iNo2);
}
class Derived implements A,B
{
    public Derived()
    {
        System.out.println("Inside derived constructor");
    }

    public int Addition(int iNo,int iNo2)
    {
        return iNo + iNo2;
    }

    public int Substraction(int iNo1,int iNo2)
    {
        return  iNo1 - iNo2;
    }

    public int Multiplication(int iNo1,int iNo2)
    {
        return iNo1 * iNo2;
    }

    public int Division(int iNo1,int iNo2)
    {
        return iNo1 / iNo2;
    }

}

class program65
{
    public static void main(String Arg[])
    {

        Derived dobj = new Derived();
        int iRet = 0;

        iRet = dobj.Addition(11,12);
        System.out.println("Addition is : " + iRet);

        iRet = dobj.Substraction(14,11);
        System.out.println("Substraction is : " + iRet);

        iRet = dobj.Multiplication(14,11);
        System.out.println("Substraction is : " + iRet);

        iRet = dobj.Division(14,11);
        System.out.println("Substraction is : " + iRet);

    }
}