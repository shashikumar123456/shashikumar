import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.Color.*;
import javax.swing.*;
public class  TestProgram extends JFrame 
{
	  public JLabel l1,l2,l3,l4,l5;
          public JButton b1,b2;
		//int n=1;
	  public TestProgram(String n)
	  {
		
		JFrame e=new JFrame();
		e.setVisible(true);
		e.setSize(500,500);
		/*k.setLayout(new FlowLayout());
		ImageIcon li=new ImageIcon(n+".jpg");
		l1=new JLabel(li);
		JScrollPane jsp=new JScrollPane(l1);
		k.add(jsp);
		k.setVisible(true);*/
		ImageIcon icon=new ImageIcon(n+".jpg");
		JMenuItem im=new JMenuItem(icon);
		e.add(im);		
 }	
}
