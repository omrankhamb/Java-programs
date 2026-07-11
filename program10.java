//String in java
class program10
{
    public static void main(String[] args) {
            
        String sobj = "hello";
        String sobj1 = new String("HELLO");

        String sobj2 ="hello";
        String sobj3 = new String("HELLO");

        System.out.println(sobj.hashCode());
        System.out.println(sobj2.hashCode());

        System.out.println(sobj1.hashCode());
        System.out.println(sobj3.hashCode());


    
    }
}
