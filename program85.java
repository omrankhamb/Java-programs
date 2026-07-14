class Student
{
    public String name;
    public int Age;

    public Student(String name,int age)
    {
        this.name = name;
        this.Age = age;
    }


    public String toString()
    {
        return "Name : " + this.name + " " + "Age :" + this.Age;
    }
}


class program85
{
    public static void main()
    {
        System.out.println("Inside main");

        Student sobj = new Student("Omprasad",24);

        System.out.println(sobj);
        
    }
}