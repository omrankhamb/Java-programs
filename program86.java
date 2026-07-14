class Student implements Cloneable
{
    public String Name;
    public int Age;
    public int Marks;

    public Student(String A,int B,int C)
    {
        this.Name = A;
        this.Age = B;
        this.Marks = C;
    }

    public String toString()
    {
        return "Name : "+this.Name + " " + " Age : "+ this.Age + " " + " Marks : "+ this.Marks;
    }

    public Object clone()   throws CloneNotSupportedException
    {
        return super.clone();
    }
}
// Deep copy
public class program86
{
    public static void main(String Arg[]) throws Exception
    {
        Student sobj = new Student("Amit", 27, 98);

        Student sobjX = (Student)sobj.clone();      // Typecasting  

        System.out.println(sobj);                   // sobj.Tstring
        System.out.println(sobjX);   
        System.out.println(sobj.hashCode());               // sobj.Tostring
        System.out.println(sobjX.hashCode());

    }
}
