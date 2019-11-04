import java.awt.*;
import java.awt.event.*;

class TableTxt extends Frame implements ActionListener
{
	Button b;
	TextField t;
	TextArea t1;
	Label l;

	TableTxt()
	{
		b=new Button("PrintTable");
		l=new Label("Enter a number to print table:");
		t=new TextField(20);
		t1=new TextArea();

		add(l);
		add(t);
		add(b);
		add(t1);

		b.addActionListener(this);

		setSize(20,20);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(t.getText());
		int c=0;
	
		for(int i=1;i<=10;i++)
		{
			t1.append((c=a*i)+"\n ");
		}	
					
	}
	
	public static void main(String args[])
	{
		TableTxt t=new TableTxt();
	}
}
