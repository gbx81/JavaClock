package gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import threads.TimerThread;

import java.awt.Font;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public MainWindow() {
		this.setBounds(100,100,300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblCurrentTime = new JLabel("Current DateTime");
		lblCurrentTime.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCurrentTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCurrentTime.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCurrentTime);
		this.setVisible(true);
		initialize();
		TimerThread tThread = new TimerThread(lblCurrentTime);
		tThread.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
