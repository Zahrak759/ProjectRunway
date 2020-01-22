import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class First_Window extends Gui_Manger{

	private JFrame frame;

	public static void DisplayWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_Window window = new First_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	/**
	 * Create the application.
	 */
	public First_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 876, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewSchedule = new JButton("New Schedule");
		btnNewSchedule.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewSchedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewSchedule.setBounds(202, 260, 224, 85);
		frame.getContentPane().add(btnNewSchedule);
		
		Choice choice = new Choice();
		choice.setBounds(580, 292, 204, 85);
		frame.getContentPane().add(choice);
		
		JLabel lblSelectSchedule = new JLabel("  Select Schedule");
		lblSelectSchedule.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSelectSchedule.setBounds(580, 231, 204, 55);
		frame.getContentPane().add(lblSelectSchedule);
	}
}
