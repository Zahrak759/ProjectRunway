import java.awt.EventQueue;

import javax.swing.JFrame;

public class First_WindowPop_1 extends Gui_Manger{

	private JFrame frame;

	public static void DisplayWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_WindowPop_1 window = new First_WindowPop_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}	

	public First_WindowPop_1() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
