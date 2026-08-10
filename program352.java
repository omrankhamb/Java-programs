import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class program352
{
    public static void main(String Arg[])
    {
        JFrame fobj = new JFrame("Omprasad");

        fobj.setSize(400,400);

        JButton obj = new JButton("OK");

        obj.setBounds(100,100,60,60);

        obj.setSize(60  , 60);

        obj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent obj)
            {
                JOptionPane.showMessageDialog(fobj, "Button Clicked");
            }
        });;

        fobj.setLayout(null);

        fobj.add(obj);

        fobj.setVisible(true);


        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}