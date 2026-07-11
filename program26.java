class Demo
{
    public int i;
    
    public int addition(int iA,int iB)
    {
        return iA + iB;
    }
}

class program26
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        Demo dobj = new Demo();
        iRet = dobj.addition(12, 12);
        System.out.println("Addition is : "+iRet);
        
    }
}