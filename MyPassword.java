import javax.swing.*;
import java.awt.*;

class MyPassword{
public static void main(String args[])
{
  JFrame frame = new JFrame();
frame.setBounds(100,100,100,100);

Container c = frame.getContentPane();
c.setLayout(null);
JPasswordField  pass = new JPasswordField();
pass.setBounds(100,50,120,30);
c.add(pass);
pass.setText("123456");




frame.setVisible(true);
}


}
