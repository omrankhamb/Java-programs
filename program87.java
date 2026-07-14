class Student
{
    public int i,j,k;
    public Student(int i,int j,int k)
    {
        this.i = i;
        this.j = j;
        this.k = k;
    }


}

class program87
{
    public static void main(String Arg[])
    {
        Student sobj1 = new Student(11,21,31);
        Student sobj2 = new Student(11,21,31);

        if(sobj1.equals(sobj2))
        {
            System.out.println("Objects are equal");
        }
        else
        {
            System.out.println("Onjects are not equal");
        }
    }
}