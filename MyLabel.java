import javax.swing.*;
import java.awt.*;

class MyLabel{
public static void main(String args[])
{
  JFrame frame = new JFrame();
frame.setBounds(100,100,100,100);
frame.setVisible(true);
Container c = frame.getContentPane();
c.setLayout(null);

JLabel  label = new JLabel("username);
label.setBounds(100,50,100,30);





c.add(label);

}

}
