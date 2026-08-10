
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;


class Login extends JFrame
{
    public JFrame fobj;
    public JButton bobj;
    public JLabel ltobj,lobj,plobj;
    public JTextField tobj;
    public JPasswordField pobj;
    
    public Login(String name,int width,int Height)
    {
        fobj = new JFrame();



        ltobj = new JLabel("UserName");
        ltobj.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150, 50 , 150, 30);

        plobj = new JLabel("Password");
        plobj.setBounds(50, 100, 100, 30);

        pobj = new JPasswordField();
        pobj.setBounds(150, 100, 150, 30);

        bobj  = new JButton("SUBMIT");
        bobj.setBounds(150, 150, 100, 30);

        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                JOptionPane.showMessageDialog(fobj, "Your data stored successfully");
                System.out.print(tobj.getText());
                tobj.setText("");
            }
        });

        lobj = new JLabel();
        lobj.setBounds(150, 200, 250, 30);

        fobj.add(ltobj);
        fobj.add(tobj);
        fobj.add(plobj);
        fobj.add(pobj);
        fobj.add(bobj);
        fobj.add(lobj);

        fobj.setTitle(name);
        fobj.setBackground(Color.GRAY);
        fobj.setSize(width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}

class program355
{
    public static void main(String Arg[])
    {
        Login obj = new Login("Om", 800, 800);
    }
}