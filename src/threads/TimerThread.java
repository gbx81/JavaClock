package threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	private JLabel timerLbl;
	
	public TimerThread(JLabel timerLbl) {
		this.setTimerLbl(timerLbl);
	}
	
	@Override 
	public void run() {
		while(true) {
		    try {
		    	LocalDateTime myDateObj = LocalDateTime.now();
		    	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    	String formattedDate = myDateObj.format(myFormatObj);
		    	this.getTimerLbl().setText(formattedDate);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public JLabel getTimerLbl() {
		return timerLbl;
	}

	public void setTimerLbl(JLabel timerLbl) {
		this.timerLbl = timerLbl;
	}
}
