import java.util.*;

class StringX
{
    public void Display(String str)
    {
        System.out.println("Recieved String is : "+str);
    }

    public int CountCapital(String str)
    {
        int iCount = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    {
        int iCount = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <='z')
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int CountDigit(String str)
    {
        int iCnt = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {

        }
        return i;
    }

     public int CountSpace(String str)
    {
        int iCnt = 0;
        int i = 0;
        char Arr[] = str.toCharArray();

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == ' ')
            {
                iCnt++;
            }
        }
        return iCnt;
    }

    //  Special Characters
    public int CountSpecial(String str)
    {
        int i = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();
        for(i = 0 ; i <Arr.length ; i++)
        {
           if( 
                ((Arr[i] >= '!') && (Arr[i] <= '/')) || 
                ((Arr[i] >= ':') && (Arr[i] <= '@')) ||
                ((Arr[i] >= '[') && (Arr[i] <= '`')) || 
                ((Arr[i] >= '{') && (Arr[i] <= '~'))  
            )
           {
            iCount++;
           }
        }

        return iCount;
    }
    
}

class program215
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();
        String data = null;      // Refrence but not memory allocation
        int iRet = 0;

        System.out.println("Enter a String : ");
        data = sobj.nextLine();


        // input of string
        System.out.println("Enter String : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Number of capital chracters Are: "+iRet);
        
        iRet = strobj.CountSmall(data);
        System.out.println("Number of small chracters Are: "+iRet);
        
        iRet = strobj.CountDigit(data);
        System.out.println("Number of  digits Are: "+iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("Number of Spaces Are : "+iRet);

        iRet = strobj.CountSpecial(data);
        System.out.println("Number of Special Symbols  Are : "+iRet);
    }
}