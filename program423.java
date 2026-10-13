
class MaxHeap {

    public int[] Arr;
    public int size;
    public int total_Size;

    public MaxHeap(int size) 
    {
        this.total_Size = size;
        this.size = 0;
        this.Arr = new int[size];
    }


    // Step up approach
    public void insert(int data) 
    {
        if (this.size > this.total_Size) 
        {
            System.out.println("The Size of Out Of Bound");
            return;
        }

        Arr[size] = data;
        int idx = size;
        this.size++;

        while (idx >= 0 && Arr[(idx - 1) / 2] < Arr[idx]) 
        {
            int temp = Arr[(idx - 1) / 2];
            Arr[(idx - 1) / 2] = Arr[idx];
            Arr[idx] = temp;

        }
    }

    public void Delete()
    {
        if(this.size == 0)
        {
            System.out.println("Heap is empty\n");

        }
    }

    public void display()
    {
        System.out.println("The elements present in the Heap : \n");
        for(int i = 0 ; i < this.size ; i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
}

class program423 
{

    public static void main(String Arg[])
    {
        MaxHeap hobj = new MaxHeap(6);
        hobj.insert(7);
        hobj.insert(8);
        hobj.insert(9);
        hobj.display();
    }
}
