import java.util.*;


class program34
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        System.out.println("Enter the integser : ");
        i = sobj.nextInt();

        float fobj;
        System.out.println("ENter the float : ");
        fobj= sobj.nextFloat();

        sobj.nextLine();
        String str = new String();
        System.out.println("enter string : ");
        str = sobj.nextLine();

        System.out.println(i);
        System.out.println(fobj);
        System.out.println(str);

    }
}