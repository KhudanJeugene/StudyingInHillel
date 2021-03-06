package Calculator2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCalc2 extends JPanel
{
	private static final long serialVersionUID = 1L;
	public PanelCalc2()
	{	
		setLayout(new GridLayout(5,2));
		JLabel lbl1 = new JLabel("Input a");
		JLabel lbl2 = new JLabel("Input operation");
		JLabel lbl3 = new JLabel("Input b");
		JLabel lbl4 = new JLabel("Result");
		JTextField txt1 = new JTextField();
		txt1.setBounds(getX(), getY(), 300, HEIGHT);
		JTextField txt2 = new JTextField();
		JTextField txt3 = new JTextField();
		JTextField txt4 = new JTextField();
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		add(lbl3);
		add(txt3);
		add(lbl4);
		add(txt4);
		
		JButton btn1 = new JButton("Calc");
		btn1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0)
					{
						double a;
						double b;
						String op;
						try
						{
						a = Double.parseDouble(txt1.getText());
						op = txt2.getText();
						b = Double.parseDouble(txt3.getText());
						}
						catch(NumberFormatException e)
						{
							op = "";
							a = 0;
							b = 0;
						}
						if (op.equals(""))						
							txt4.setText("");
						
						else if (op.equals("+"))					
							txt4.setText(String.valueOf(a+b));
						
						else if (op.equals("-"))
							txt4.setText(String.valueOf(a-b));
						
						else if(op.equals("*"))
							txt4.setText(String.valueOf(a*b));
						
						else if (op.equals("/"))
							{
								if(txt4.getText().equals("0"))
									txt4.setText("Error");
								
								else 
									txt4.setText(String.valueOf(a/b));
							}
								
					}
				});
		add(btn1);
	}
}
