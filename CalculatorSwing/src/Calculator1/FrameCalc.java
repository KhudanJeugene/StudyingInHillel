package Calculator1;
import javax.swing.JFrame;

public class FrameCalc extends JFrame
{
	private static final long serialVersionUID = 1L;
	public FrameCalc()
	{	
		setTitle("My First App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new PanelCalc());
		setVisible(true);
		pack();
	}
}
