package Calculator;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class XPanel extends JPanel
{	
	private static final long serialVersionUID = 1L;
	JFormattedTextField result;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn0;
	JButton btnPoint;
	JButton btnClear;
	JButton btnEq;
	JButton btnPlus;
	JButton btnMin;
	JButton btnMult;
	JButton btnDiv;	
	
	public String getText()
	{
		return result.getText();
	}
	public void setText(String val)
	{
		result.setText(val);
	}
	public void clear()
	{
		result.setText("");
	}
	public XPanel()
	{
		setLayout(new BorderLayout());
		result = new JFormattedTextField();
		result.setHorizontalAlignment(JTextField.RIGHT);
		add("North",result);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4,3));
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btnPoint = new JButton(".");
		btnClear = new JButton("CE");
		buttons.add(btn1);
		buttons.add(btn2);
		buttons.add(btn3);
		buttons.add(btn4);
		buttons.add(btn5);
		buttons.add(btn6);
		buttons.add(btn7);
		buttons.add(btn8);
		buttons.add(btn9);
		buttons.add(btn0);
		buttons.add(btnPoint);
		buttons.add(btnClear);
		add("Center",buttons);
		JPanel op = new JPanel();
		op.setLayout(new GridLayout(4,2));
		add("East", op);
		btnPlus = new JButton("+");
		btnMin = new JButton("-");
		btnMult = new JButton("*");
		btnDiv = new JButton("/");
		btnEq = new JButton("=");
		op.add(btnPlus);
		op.add(btnMin);
		op.add(btnMult);
		op.add(btnDiv);
		op.add(btnEq);
		CalcEngine calc = new CalcEngine(this);
		btn1.addActionListener(calc);
		btn2.addActionListener(calc);
		btn3.addActionListener(calc);
		btn4.addActionListener(calc);
		btn5.addActionListener(calc);
		btn6.addActionListener(calc);
		btn7.addActionListener(calc);
		btn8.addActionListener(calc);
		btn9.addActionListener(calc);
		btn0.addActionListener(calc);
		btnPoint.addActionListener(calc);
		btnClear.addActionListener(calc);
		btnEq.addActionListener(calc);
		btnPlus.addActionListener(calc);
		btnMin.addActionListener(calc);
		btnMult.addActionListener(calc);
		btnDiv.addActionListener(calc);
		
	}
}
