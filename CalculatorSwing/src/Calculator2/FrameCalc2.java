package Calculator2;

import javax.swing.JFrame;

public class FrameCalc2 extends JFrame
{
	private static final long serialVersionUID = 1L;
	public FrameCalc2()
	{
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new PanelCalc2());
		pack();
	}
}
