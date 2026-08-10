import javax.swing.*;

class program349
{
    public static void main(String Arg[])
    {
        JFrame fobj = new JFrame("Omprasad");

        fobj.setSize(400,400);

        JButton obj = new JButton("OK");

        obj.setSize(60  , 60);

        fobj.setLayout(null);

        fobj.add(obj);

        fobj.setVisible(true);


        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}