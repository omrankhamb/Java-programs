//String in java
class program24
{
    public static void PassByValue(int x)
    {
        x++;
    }
    public static void main(String[] args) {
        
        int iNO = 11;
        System.out.println("Before function call : "+iNO);

        PassByValue(iNO);

        System.out.println("After Function Call : "+iNO);       
        
    
    }
}
