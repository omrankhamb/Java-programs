class program4
{
    public static void main(String[] args) {
        int iNo1 = 10;
        int iNo2 = 12;
        int iNo3 = 14;

        if(iNo1 > iNo2)
        {
            if(iNo1 > iNo3)
            {
                System.out.println(iNo1);
            }
            else
            {
                System.err.println(iNo3);    
            }
        }
        else
        {
            if(iNo2 > iNo3)
            {
                System.out.println(iNo2);
            }
            else
            {
                System.out.println(iNo3);
            }
        }
    }
}
