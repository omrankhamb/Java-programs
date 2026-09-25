class Demo
{
    public int i , j;

    public Demo setI(int a)
    {
        this.i = a;
        return this;
    }

    public int setJ(int i)
    {
        this.j = i;

        return this.j;
    }


}



class program403
{
    public static void main(String A[])
    {
        int x = new Demo().setI(11).setJ(21);
        System.out.println("The value of x is : " + x);
        
    }
}