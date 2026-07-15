import java.util.*;

class StringX
{
    public void Display(String str)
    {
        System.out.println("Recieved String is : "+str);
    }
}

class program208
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX obj = new StringX();
        String str = null;      // Refrence but not memory allocation

        System.out.println("Enter a String : ");
        str = sobj.nextLine();

        obj.Display(str);
        System.out.println("entered String is : "+str);
    }
}