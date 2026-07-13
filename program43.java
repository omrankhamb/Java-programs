class Base
{
    public Base()
    {
        System.out.println("Inside Base constructor");
    }

    public float Addition(float iNo1,float iNo2)
    {
        return iNo2 + iNo1;
    }

    public int Addition(int iNo,int iNo2)
    {
        return iNo + iNo2;
    }

    public int Addition(int iNo1, int iNo2, int iNo3)
    {
        return iNo1+ iNo2 + iNo3;
    }

    
}



class program43
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main");

        Base bobj = new Base();
        int iRet = 0;
        float fans = 0;

        iRet = bobj.Addition(12, 13);
        System.out.println("Addtion is : "+iRet);

        iRet = bobj.Addition(12, 13,4);
        System.out.println("Addition of three component : " + iRet);

        fans = bobj.Addition(11.23f, 3.24f);
        System.out.println("Addition is : "+ (float)fans);
    }
}