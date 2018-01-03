import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class StudentInfo
{
		public StudentInfo(String n)
		{

	String columnName[]={"sid","name","branch","year"};
		String q="";
       		String w="";
		String e="";
               	String p="";
               // String t="";
               // String y="";
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shashi","root","shashi");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select sid,name,branch,year from sInfo where sid="+n);
			
			while(rs.next())
			{
				
				//System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getInt(3)+" "+rs.getString(4)+""+rs.getInt(5));
				/*JFrame r=new JFrame();
		 		JOptionPane.showMessageDialog(r,rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+"  "+rs.getInt(5)+" "+rs.getInt(6));*/
				 q=rs.getString(1); 
				 w=rs.getString(2);
				e=rs.getString(3);
				 p=rs.getString(4);
				// t=rs.getString(5);
				 //y=rs.getString(6);
		
					
					JFrame m=new JFrame("Student Due");
			m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JTable table =new JTable();
			DefaultTableModel model = new DefaultTableModel();
			model.setColumnIdentifiers(columnName);
			//SrowData[][]={q,w,e,p,t,y};
			//rowData[][]=rs.getString(j);
		//String columnName[]={"HallTicketNumber","Telugu","English","Mathematics","Science","social"};
			table.setModel(model); 
		
                   table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                    table.setFillsViewportHeight(true);
		JScrollPane scrollPane=new JScrollPane(table);
			m.add(scrollPane,BorderLayout.CENTER);
			m.setSize(500,200);
			m.setVisible(true);
			 model.addRow(new Object[]{q, w, e,p});
		
		
				
			
			}
		
					

		}catch(ClassNotFoundException|SQLException k)
		{
			k.printStackTrace();
		}

	}
	
	

}


