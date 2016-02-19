package Calculator;
import javax.swing.JFrame;

public class XFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public XFrame()
	{
		setTitle("My First App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new XPanel());
		setVisible(true);
		pack();
	}
}
