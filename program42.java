class Base {
    public int i;

    public Base()
    {
        System.out.println("Inside defsult Base constructor");
    }

    public Base(int x) {
        System.out.println("Inside Base Constructor");
        this.i = x;
    }
}

class Derived extends Base {
    public int j;

    public Derived(int x,int y) {

        this.j = 1;

        System.out.println("Inside Derived constructor");
    }

    public void Display() {
        System.out.println(this.j);
        System.out.println(super.i);
    }
}

class program42 {
    public static void main(String A[]) {
        Base bobj = new Base(10);

        Derived dobj = new Derived(12,13);
        dobj.Display();
    }
}