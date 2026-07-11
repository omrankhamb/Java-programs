
class Demo
{
    public int i,j;
    public Demo()
    {
        System.out.println("Inside  Default Constructor");
    }

    public Demo(int iNo,int iNo2)
    {
        this.i = iNo;
        this.i = iNo2;
    }

    public int Addition()
    {
        return i + j;
    }
}


class program28
{
    public static void main(String[] args) {
        // To call default constructor
        Demo dobj = new Demo();

        Demo dobj2 = new Demo(11,21);
        System.out.println(dobj2.Addition());

    }
}
