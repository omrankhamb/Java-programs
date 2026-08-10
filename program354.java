
import javax.swing.JFrame;

class program354 extends JFrame
{

    public program354(String name,int width,int Height)
    {
        setTitle(name);
        setSize(width,Height);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String Arg[])
    {

        program354 obj = new program354("omprasad", 400, 400);
    }
}