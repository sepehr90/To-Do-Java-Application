package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 * @author Sepehr Forouzani
 */

public class LED_Clock extends JPanel {

	/**
	 * @param
	 */
	int i, j, m, n, k, p = 0;
	int seconds;
	int minutes;
	int hours;

	public LED_Clock() {
	
		// repaint every 0.1 second
		ActionListener animate = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Calendar cal = Calendar.getInstance();
				cal.getTime();
				SimpleDateFormat sec = new SimpleDateFormat("ss");
				SimpleDateFormat min = new SimpleDateFormat("mm");
				SimpleDateFormat hrs = new SimpleDateFormat("HH");
				// Assigning the LED cells to current time
				// seconds
				seconds = Integer.parseInt(sec.format(cal.getTime()));
				i = seconds % 10;
				j = seconds / 10;
				minutes = Integer.parseInt(min.format(cal.getTime()));
				m = minutes % 10;
				n = minutes / 10;
				hours = Integer.parseInt(hrs.format(cal.getTime()));
				k = hours % 10;
				p = hours / 10;
				repaint();
			}
		};
		final Timer timer = new Timer(100, animate);
		timer.start();
	}

	public Dimension getPreferredSize() {
		return new Dimension(120, 30);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// designing the base for the first part of LED
		if (i == 0) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.BLACK);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 1) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 2) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.BLACK);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 3) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.BLACK);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 4) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 5) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.BLACK);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 6) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.BLACK);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 7) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 8) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.BLACK);
			g.drawLine(110, 20, 115, 20);

		} else if (i == 9) {
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 115, 10);
			g.setColor(Color.BLACK);
			g.drawLine(110, 10, 110, 15);
			g.setColor(Color.BLACK);
			g.drawLine(115, 10, 115, 15);
			g.setColor(Color.BLACK);
			g.drawLine(110, 15, 115, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 15, 110, 20);
			g.setColor(Color.BLACK);
			g.drawLine(115, 15, 115, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(110, 20, 115, 20);

		}

		// ##################################################
		// ##################################################
		// designing and initializing the base for the second part of LED
		if (j == 0) {
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 105, 10);
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 100, 15);
			g.setColor(Color.BLACK);
			g.drawLine(105, 10, 105, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 15, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 100, 20);
			g.setColor(Color.BLACK);
			g.drawLine(105, 15, 105, 20);
			g.setColor(Color.BLACK);
			g.drawLine(100, 20, 105, 20);

		} else if (j == 1) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 10, 105, 10);
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 100, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(105, 10, 105, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 15, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 100, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(105, 15, 105, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 20, 105, 20);

		} else if (j == 2) {
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 105, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 10, 100, 15);
			g.setColor(Color.BLACK);
			g.drawLine(105, 10, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 100, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(105, 15, 105, 20);
			g.setColor(Color.BLACK);
			g.drawLine(100, 20, 105, 20);

		} else if (j == 3) {
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 105, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 10, 100, 15);
			g.setColor(Color.BLACK);
			g.drawLine(105, 10, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 105, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 15, 100, 20);
			g.setColor(Color.BLACK);
			g.drawLine(105, 15, 105, 20);
			g.setColor(Color.BLACK);
			g.drawLine(100, 20, 105, 20);

		} else if (j == 4) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 10, 105, 10);
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 100, 15);
			g.setColor(Color.BLACK);
			g.drawLine(105, 10, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 105, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 15, 100, 20);
			g.setColor(Color.BLACK);
			g.drawLine(105, 15, 105, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 20, 105, 20);

		} else if (j == 5) {
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 105, 10);
			g.setColor(Color.BLACK);
			g.drawLine(100, 10, 100, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(105, 10, 105, 15);
			g.setColor(Color.BLACK);
			g.drawLine(100, 15, 105, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(100, 15, 100, 20);
			g.setColor(Color.BLACK);
			g.drawLine(105, 15, 105, 20);
			g.setColor(Color.BLACK);
			g.drawLine(100, 20, 105, 20);

		}

		// ##################################################
		// ##################################################
		// double dots for the timer
		g.setColor(Color.BLACK);
		g.fillOval(93, 10, 5, 5);
		g.fillOval(93, 15, 5, 5);
		// ##################################################
		// ##################################################
		// designing and initializing the base for the third part of LED
		if (m == 0) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.BLACK);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 1) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 2) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.BLACK);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 3) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.BLACK);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 4) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 5) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.BLACK);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 6) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.BLACK);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 7) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 8) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.BLACK);
			g.drawLine(85, 20, 90, 20);

		} else if (m == 9) {
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 90, 10);
			g.setColor(Color.BLACK);
			g.drawLine(85, 10, 85, 15);
			g.setColor(Color.BLACK);
			g.drawLine(90, 10, 90, 15);
			g.setColor(Color.BLACK);
			g.drawLine(85, 15, 90, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 15, 85, 20);
			g.setColor(Color.BLACK);
			g.drawLine(90, 15, 90, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(85, 20, 90, 20);

		}

		// ##################################################
		// ##################################################
		// designing and initializing the base for the Forth part of LED
		if (n == 0) {
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 80, 10);
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 75, 15);
			g.setColor(Color.BLACK);
			g.drawLine(80, 10, 80, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 15, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 75, 20);
			g.setColor(Color.BLACK);
			g.drawLine(80, 15, 80, 20);
			g.setColor(Color.BLACK);
			g.drawLine(75, 20, 80, 20);

		} else if (n == 1) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 10, 80, 10);
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 75, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(80, 10, 80, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 15, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 75, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(80, 15, 80, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 20, 80, 20);

		} else if (n == 2) {
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 80, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 10, 75, 15);
			g.setColor(Color.BLACK);
			g.drawLine(80, 10, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 75, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(80, 15, 80, 20);
			g.setColor(Color.BLACK);
			g.drawLine(75, 20, 80, 20);

		} else if (n == 3) {
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 80, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 10, 75, 15);
			g.setColor(Color.BLACK);
			g.drawLine(80, 10, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 80, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 15, 75, 20);
			g.setColor(Color.BLACK);
			g.drawLine(80, 15, 80, 20);
			g.setColor(Color.BLACK);
			g.drawLine(75, 20, 80, 20);

		} else if (n == 4) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 10, 80, 10);
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 75, 15);
			g.setColor(Color.BLACK);
			g.drawLine(80, 10, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 80, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 15, 75, 20);
			g.setColor(Color.BLACK);
			g.drawLine(80, 15, 80, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 20, 80, 20);

		} else if (n == 5) {
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 80, 10);
			g.setColor(Color.BLACK);
			g.drawLine(75, 10, 75, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(80, 10, 80, 15);
			g.setColor(Color.BLACK);
			g.drawLine(75, 15, 80, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(75, 15, 75, 20);
			g.setColor(Color.BLACK);
			g.drawLine(80, 15, 80, 20);
			g.setColor(Color.BLACK);
			g.drawLine(75, 20, 80, 20);

		}

		// ##################################################
		// ##################################################
		// double dots for the timer
		g.setColor(Color.BLACK);
		g.fillOval(68, 10, 5, 5);
		g.fillOval(68, 15, 5, 5);
		// ##################################################
		// ##################################################
		// designing and initializing the base for the Fifth part of LED
		if (k == 0) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.BLACK);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 1) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 2) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.BLACK);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 3) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.BLACK);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 4) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 5) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.BLACK);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 6) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.BLACK);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 7) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 8) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.BLACK);
			g.drawLine(60, 20, 65, 20);

		} else if (k == 9) {
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 65, 10);
			g.setColor(Color.BLACK);
			g.drawLine(60, 10, 60, 15);
			g.setColor(Color.BLACK);
			g.drawLine(65, 10, 65, 15);
			g.setColor(Color.BLACK);
			g.drawLine(60, 15, 65, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 15, 60, 20);
			g.setColor(Color.BLACK);
			g.drawLine(65, 15, 65, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(60, 20, 65, 20);

		}

		// ##################################################
		// ##################################################
		// designing and initializing the base for the sixth part of LED
		if (p == 0) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.BLACK);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 1) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 2) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.BLACK);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 3) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.BLACK);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 4) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 5) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.BLACK);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 6) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.BLACK);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 7) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 8) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.BLACK);
			g.drawLine(50, 20, 55, 20);

		} else if (p == 9) {
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 55, 10);
			g.setColor(Color.BLACK);
			g.drawLine(50, 10, 50, 15);
			g.setColor(Color.BLACK);
			g.drawLine(55, 10, 55, 15);
			g.setColor(Color.BLACK);
			g.drawLine(50, 15, 55, 15);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 15, 50, 20);
			g.setColor(Color.BLACK);
			g.drawLine(55, 15, 55, 20);
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(50, 20, 55, 20);

		}

		// ##################################################
		// ##################################################
	}


}
