import java.awt.EventQueue;

import javax.swing.JFrame;

public class Second_Window extends Gui_Manger{

	private JFrame frame;

	public static void Display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second_Window window = new Second_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Second_Window() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 859, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
