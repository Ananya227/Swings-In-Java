import javax.swing.*;
import java.awt.*;

class  MyTextField{
public static void main(String args[])
{
  JFrame frame = new JFrame();
frame.setBounds(100,100,100,100);
Container c = frame.getContentPane();
c.setLayout(null);

JTextField t1= new JTextField();

t1.setBounds(100,50,100,30);
c.add(t1);
t1.setText("type something");



frame.setVisible(true);
}


}
