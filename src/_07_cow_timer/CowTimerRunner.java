package _07_cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
	public static void main(String[] args) throws InterruptedException {
		/* Make a CowTimer, set its time and start it.
		 * Use a short delay (seconds) when testing, then try with longer delays */
  CowTimer timer = new CowTimer(); 
  String time = JOptionPane.showInputDialog("How long do you want the timer for (minutes)");
	int t = Integer.parseInt(time);
	timer.setTime(t);
	timer.start();

	}
}
