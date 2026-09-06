import java.util.*;

class Store
{
    public HashMap<Integer,Integer> data;

    public Store()
    {
        data = new HashMap<Integer , Integer>();
    }

    // ADD
    public void ADD(int key , int amount)
    {

        if(amount <= -1)
        {
            System.out.println("Amount is not valid");
        }

        data.put(key, data.getOrDefault(key, 0) + amount);
    }

    // SELL
    public void SELL(int key , int amount)
    {
        data.put(key, data.getOrDefault(key, 0)-amount);
    }

    // RESTOCK

    public void RESTOCK(int key , int amount)
    {
        data.put(key, data.get(key) + amount);
    }

    public void display()
    {
        System.out.println("============================== ITEM LIST  ====================================");
        for (Map.Entry<Integer, Integer> en : data.entrySet()) {
                System.out.println("ITEM ID : " + en.getKey() + " ITEM AMOUNT : " + en.getValue());            
        }
        System.out.println("==============================================================================");
    }
}



class program399
{
    public static void main(String Arg[])
    {
        System.out.println("==============================================================================");
        System.out.println("============================== Welcome to the Store ==========================");
        System.out.println("===============================================================================");

        Store obj = new Store();
        Scanner sobj = new Scanner(System.in);
        int key = 0;
        int amount = 0;

        String input;
        do
        {
            System.out.println("TO ADD THE ITEM          : ADD     < ITEM ID >  < AMOUNT >");
            System.out.println("TO SELL THE ITEM         : SELL    < ITEM ID >  < AMOUNT >");
            System.out.println("TO RESTOCK THE ITEM      : RESTOCK < ITEM ID >   <AMOUNT >");
            System.out.println("TO DISPLY THE ITEM  LIST : DISPLAY");
            System.out.println("TO EXIT FROM STORE       : EXIT");
            System.out.print("Enter THe COMMAND          :");

            input = sobj.nextLine();
            input =  input.toLowerCase();
            input.replaceAll("\\S+", " ");

            System.out.println(input);
            String Command[] = input.split(" ");
        
            switch (Command[0]) {
                case "add":
                        key = Integer.parseInt(Command[1]);
                        amount = Integer.parseInt(Command[2]);

                        obj.ADD(key,amount);

                        System.out.println("Item Stored successfully \n");

                    break;

                case "sell":
                        key = Integer.parseInt(Command[1]);
                        amount = Integer.parseInt(Command[2]);

                        obj.SELL(key,amount);

                        System.out.println("ITEM SELLED SUEESSFULLY\n");
                    break;

                case "restock":
                        key = Integer.parseInt(Command[1]);
                        amount = Integer.parseInt(Command[2]);

                        obj.RESTOCK(key,amount);

                        System.out.println("RESTOCK SUCCESSFULLY\n");
                    break;

                case "display":
                        obj.display();                        
                    break;

                case "exit":
                        System.out.println("=========================================================================================");
                        System.out.println("============================== Thank you for visintg the store ==========================");
                        System.out.println("=========================================================================================");
                    break;
            }
        }while(true);

    }
}