                         //CALCULATOR IN JAVA 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.script.*;
class Calc extends JFrame implements ActionListener
{
	JTextField tx1;
	JButton b[] = new JButton[20];
	int k = 0;
	int x,y,w,h;
	String data[]={"B","C","1/x","sqrt","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	
	Calc()
  {
	  x = 0;
	  y=100;
	  w=100;
	  h=100;
	  setLayout(null);
	  Font f = new Font("FIXEDAYS",Font.BOLD,50);
	  
	  tx1 = new JTextField(10);
	  tx1.setSize(400,100);
	  tx1.setLocation(0,0);
	  tx1.setHorizontalAlignment(JTextField.RIGHT);
	  add(tx1);
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=4;j++)
		  {  
	       b[k] = new JButton(data[k]);
		   b[k].setSize(w,h);
		   b[k].setLocation(x,y);
		   add(b[k]);
		   b[k].addActionListener(this);
		   k++;
		   x=x+100;
		  }
	  x =0;
	  y = y+100;
	  }
	  }
	  public void actionPerformed(ActionEvent e)
	  {
		  if(e.getSource()==b[0])
		  {
			 String s1 = tx1.getText();
			 tx1.setText(s1.substring(0,s1.length()-1));
		  }
		else  if(e.getSource()==b[1])
		  {
			  tx1.setText(" ");
		  }
		  else  if(e.getSource()==b[2])
		  {
	       String s1= tx1.getText();
	       double a =Double.parseDouble(s1);
	       a=1/a;
		   tx1.setText(""+a);
		 }
	       else  if(e.getSource()==b[3])
		   {
			   String s1 = tx1.getText();
			   double a = Double.parseDouble(s1);
			   tx1.setText(""+Math.sqrt(a));
		   }
		   else if(e.getSource() == b[18])
		   {
			   String s1 = tx1.getText();
			   ScriptEngineManager sem = new ScriptEngineManager ();
			   ScriptEngine se = sem.getEngineByName("js");
			   try
			   {
				   tx1.setText(""+se.eval(s1));
			   }
			   catch(Exception exc){}
		   }
		   
	else
	{
	JButton b1=(JButton)e.getSource();
	String s5 = tx1.getText()+b1.getLabel();
	tx1.setText(s5);
	}
  }
	
}
class Demo
{
	public static void main(String ar[])
	{
		Calc n = new Calc();
		n.setVisible(true);
		n.setSize(420,800);
		n.setLocation(200,100);	
		System.out.println("BY SURBHI BHAWSAR");
	}
}
//CODED BY SURBHI BHAWSAR
//1810DMTCLCP03174