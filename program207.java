import java.util.*;

class StringX
{
    public void Display(String str)
    {
        System.out.println(str);
    }
}

class program207
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX obj = new StringX();
        String str = null;

        System.out.println("Enter a String : ");
        str = sobj.nextLine();

        obj.Display(str);
        System.out.println("entered String is : "+str);
    }
}