//Contine and break statement in Java
class program6
{
    public static void main(String[] args) {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= 10 ; iCnt++)
        {
            if(iCnt == 5)
            {
                continue;
                // Skip the current iteration
            }
            System.out.println("Jay Ganesh..");
            
        }

        iCnt = 1;
        while (iCnt <= 10) {
            if(iCnt == 5)
            {
                break;
                // break the loop if condition is true
            }
            System.out.println("Jay Gaensh..");
            iCnt++;
        }
    }
}
