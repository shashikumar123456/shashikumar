import java.util.*;
import java.awt.*;
import javax.swing.*;
public class StudentDetails extends JFrame
{

	 public static void main(String args[])
	{
		JFrame r=new JFrame();
		String p=JOptionPane.showInputDialog(r,"Enter The Student ID:");
		StudentInfo e=new StudentInfo(p);
		TestProgram k=new TestProgram(p);
				


	}
}
