package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 * @author Sepehr Forouzani
 */
public class LED_Timer extends JPanel {

	/**
	 * @param
	 */
	int i, j, m, n, k, p = 0;
	int seconds;
	int minutes;
	int hours;

	JButton startBtn = new JButton("Start");
	JButton stopBtn = new JButton("Stop");
	JButton resetBtn = new JButton("Reset");

	private Timer myTimer1;
	public static final int ONE_SEC = 1000;
	
	// time in seconds
	private int clockTime;

	public LED_Timer() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		JPanel btnpanel = new JPanel();
		this.setLayout(new BorderLayout());
		btnpanel.add(startBtn);
		btnpanel.add(stopBtn);
		btnpanel.add(resetBtn);
		add(btnpanel, BorderLayout.SOUTH);
		// initial clock setting 
		clockTime = 0;
		

		myTimer1 = new Timer(ONE_SEC, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//every second increase clockTime by one				
				clockTime++; 
				//getting number of minutes and hourse from total number of seconds
				seconds = clockTime % 60;
				i = seconds % 10;
				j = seconds / 10;
				minutes = clockTime / 60;
				m = minutes % 10;
				n = minutes / 10;
				hours = minutes / 60;
				k = hours % 10;
				p = hours / 10;

			}
		});
		//Start the timer by pressing start button
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				myTimer1.start();
			}
		});
        //Stop the timer by pressing stop button
		stopBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				myTimer1.stop();
			}
		});
        //Reset the timer by pressing reset button
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				clockTime = 0;
				i = 0;
				j = 0;
				m = 0;
				n = 0;
				k = 0;
				p = 0;
			}
		});
		// repaint every 0.1 second
		ActionListener animate = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				repaint();
			}
		};
		Timer timer = new Timer(100, animate);
		timer.start();
	}

	public Dimension getPreferredSize() {
		return new Dimension(250, 200);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        //designing the base for the first part of LED
		if (i == 0) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.RED);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 1) {
			g.setColor(Color.WHITE);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.WHITE);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.WHITE);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.WHITE);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 2) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.WHITE);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.WHITE);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.RED);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 3) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.WHITE);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.RED);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 4) {
			g.setColor(Color.WHITE);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.WHITE);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 5) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.WHITE);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.RED);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 6) {
			g.setColor(Color.WHITE);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.WHITE);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.RED);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 7) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.WHITE);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.WHITE);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 8) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.RED);
			g.drawLine(110, 30, 120, 30);

		} else if (i == 9) {
			g.setColor(Color.RED);
			g.drawLine(110, 10, 120, 10);
			g.setColor(Color.RED);
			g.drawLine(110, 10, 110, 20);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 20);
			g.setColor(Color.RED);
			g.drawLine(110, 20, 120, 20);
			g.setColor(Color.WHITE);
			g.drawLine(110, 20, 110, 30);
			g.setColor(Color.RED);
			g.drawLine(120, 20, 120, 30);
			g.setColor(Color.WHITE);
			g.drawLine(110, 30, 120, 30);

		}
		// ##################################################
		// ##################################################
		//designing and initializing the base for the second part of LED
		if (j == 0) {
			g.setColor(Color.RED);
			g.drawLine(95, 10, 105, 10);
			g.setColor(Color.RED);
			g.drawLine(95, 10, 95, 20);
			g.setColor(Color.RED);
			g.drawLine(105, 10, 105, 20);
			g.setColor(Color.WHITE);
			g.drawLine(95, 20, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 95, 30);
			g.setColor(Color.RED);
			g.drawLine(105, 20, 105, 30);
			g.setColor(Color.RED);
			g.drawLine(95, 30, 105, 30);

		} else if (j == 1) {
			g.setColor(Color.WHITE);
			g.drawLine(95, 10, 105, 10);
			g.setColor(Color.RED);
			g.drawLine(95, 10, 95, 20);
			g.setColor(Color.WHITE);
			g.drawLine(105, 10, 105, 20);
			g.setColor(Color.WHITE);
			g.drawLine(95, 20, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 95, 30);
			g.setColor(Color.WHITE);
			g.drawLine(105, 20, 105, 30);
			g.setColor(Color.WHITE);
			g.drawLine(95, 30, 105, 30);

		} else if (j == 2) {
			g.setColor(Color.RED);
			g.drawLine(95, 10, 105, 10);
			g.setColor(Color.WHITE);
			g.drawLine(95, 10, 95, 20);
			g.setColor(Color.RED);
			g.drawLine(105, 10, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 95, 30);
			g.setColor(Color.WHITE);
			g.drawLine(105, 20, 105, 30);
			g.setColor(Color.RED);
			g.drawLine(95, 30, 105, 30);

		} else if (j == 3) {
			g.setColor(Color.RED);
			g.drawLine(95, 10, 105, 10);
			g.setColor(Color.WHITE);
			g.drawLine(95, 10, 95, 20);
			g.setColor(Color.RED);
			g.drawLine(105, 10, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 105, 20);
			g.setColor(Color.WHITE);
			g.drawLine(95, 20, 95, 30);
			g.setColor(Color.RED);
			g.drawLine(105, 20, 105, 30);
			g.setColor(Color.RED);
			g.drawLine(95, 30, 105, 30);

		} else if (j == 4) {
			g.setColor(Color.WHITE);
			g.drawLine(95, 10, 105, 10);
			g.setColor(Color.RED);
			g.drawLine(95, 10, 95, 20);
			g.setColor(Color.RED);
			g.drawLine(105, 10, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 105, 20);
			g.setColor(Color.WHITE);
			g.drawLine(95, 20, 95, 30);
			g.setColor(Color.RED);
			g.drawLine(105, 20, 105, 30);
			g.setColor(Color.WHITE);
			g.drawLine(95, 30, 105, 30);

		} else if (j == 5) {
			g.setColor(Color.RED);
			g.drawLine(95, 10, 105, 10);
			g.setColor(Color.RED);
			g.drawLine(95, 10, 95, 20);
			g.setColor(Color.WHITE);
			g.drawLine(105, 10, 105, 20);
			g.setColor(Color.RED);
			g.drawLine(95, 20, 105, 20);
			g.setColor(Color.WHITE);
			g.drawLine(95, 20, 95, 30);
			g.setColor(Color.RED);
			g.drawLine(105, 20, 105, 30);
			g.setColor(Color.RED);
			g.drawLine(95, 30, 105, 30);

		}

		// ##################################################
		// ##################################################
		//double dots for the timer
		g.setColor(Color.RED);
		g.fillOval(85, 15, 5, 5);
		g.fillOval(85, 20, 5, 5);
		// ##################################################
		// ##################################################
		//designing and initializing the base for the third part of LED
		if (m == 0) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.RED);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 1) {
			g.setColor(Color.WHITE);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.WHITE);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.WHITE);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.WHITE);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 2) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.WHITE);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.WHITE);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.RED);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 3) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.WHITE);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.RED);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 4) {
			g.setColor(Color.WHITE);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.WHITE);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 5) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.WHITE);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.RED);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 6) {
			g.setColor(Color.WHITE);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.WHITE);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.RED);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 7) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.WHITE);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.WHITE);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 8) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.RED);
			g.drawLine(70, 30, 80, 30);
			
		} else if (m == 9) {
			g.setColor(Color.RED);
			g.drawLine(70, 10, 80, 10);
			g.setColor(Color.RED);
			g.drawLine(70, 10, 70, 20);
			g.setColor(Color.RED);
			g.drawLine(80, 10, 80, 20);
			g.setColor(Color.RED);
			g.drawLine(70, 20, 80, 20);
			g.setColor(Color.WHITE);
			g.drawLine(70, 20, 70, 30);
			g.setColor(Color.RED);
			g.drawLine(80, 20, 80, 30);
			g.setColor(Color.WHITE);
			g.drawLine(70, 30, 80, 30);

		}
		// ##################################################
		// ##################################################
		//designing and initializing the base for the Forth part of LED
		if (n == 0) {
			g.setColor(Color.RED);
			g.drawLine(55, 10, 65, 10);
			g.setColor(Color.RED);
			g.drawLine(55, 10, 55, 20);
			g.setColor(Color.RED);
			g.drawLine(65, 10, 65, 20);
			g.setColor(Color.WHITE);
			g.drawLine(55, 20, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 55, 30);
			g.setColor(Color.RED);
			g.drawLine(65, 20, 65, 30);
			g.setColor(Color.RED);
			g.drawLine(55, 30, 65, 30);
			
		} else if (n == 1) {
			g.setColor(Color.WHITE);
			g.drawLine(55, 10, 65, 10);
			g.setColor(Color.RED);
			g.drawLine(55, 10, 55, 20);
			g.setColor(Color.WHITE);
			g.drawLine(65, 10, 65, 20);
			g.setColor(Color.WHITE);
			g.drawLine(55, 20, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 55, 30);
			g.setColor(Color.WHITE);
			g.drawLine(65, 20, 65, 30);
			g.setColor(Color.WHITE);
			g.drawLine(55, 30, 65, 30);
		
		} else if (n == 2) {
			g.setColor(Color.RED);
			g.drawLine(55, 10, 65, 10);
			g.setColor(Color.WHITE);
			g.drawLine(55, 10, 55, 20);
			g.setColor(Color.RED);
			g.drawLine(65, 10, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 55, 30);
			g.setColor(Color.WHITE);
			g.drawLine(65, 20, 65, 30);
			g.setColor(Color.RED);
			g.drawLine(55, 30, 65, 30);
			
		} else if (n == 3) {
			g.setColor(Color.RED);
			g.drawLine(55, 10, 65, 10);
			g.setColor(Color.WHITE);
			g.drawLine(55, 10, 55, 20);
			g.setColor(Color.RED);
			g.drawLine(65, 10, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 65, 20);
			g.setColor(Color.WHITE);
			g.drawLine(55, 20, 55, 30);
			g.setColor(Color.RED);
			g.drawLine(65, 20, 65, 30);
			g.setColor(Color.RED);
			g.drawLine(55, 30, 65, 30);
			
		} else if (n == 4) {
			g.setColor(Color.WHITE);
			g.drawLine(55, 10, 65, 10);
			g.setColor(Color.RED);
			g.drawLine(55, 10, 55, 20);
			g.setColor(Color.RED);
			g.drawLine(65, 10, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 65, 20);
			g.setColor(Color.WHITE);
			g.drawLine(55, 20, 55, 30);
			g.setColor(Color.RED);
			g.drawLine(65, 20, 65, 30);
			g.setColor(Color.WHITE);
			g.drawLine(55, 30, 65, 30);
			
		} else if (n == 5) {
			g.setColor(Color.RED);
			g.drawLine(55, 10, 65, 10);
			g.setColor(Color.RED);
			g.drawLine(55, 10, 55, 20);
			g.setColor(Color.WHITE);
			g.drawLine(65, 10, 65, 20);
			g.setColor(Color.RED);
			g.drawLine(55, 20, 65, 20);
			g.setColor(Color.WHITE);
			g.drawLine(55, 20, 55, 30);
			g.setColor(Color.RED);
			g.drawLine(65, 20, 65, 30);
			g.setColor(Color.RED);
			g.drawLine(55, 30, 65, 30);
			

		}
		
		// ##################################################
		// ##################################################
		//double dots for the timer
		g.setColor(Color.RED);
		g.fillOval(45, 15, 5, 5);
		g.fillOval(45, 20, 5, 5);
		// ##################################################
		// ##################################################
		//designing and initializing the base for the Fifth part of LED
		if (k == 0) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.RED);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 1) {
			g.setColor(Color.WHITE);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.WHITE);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.WHITE);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.WHITE);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 2) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.WHITE);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.WHITE);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.RED);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 3) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.WHITE);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.RED);
			g.drawLine(30, 30, 40, 30);
		
		} else if (k == 4) {
			g.setColor(Color.WHITE);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.WHITE);
			g.drawLine(30, 30, 40, 30);
			

		} else if (k == 5) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.WHITE);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.RED);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 6) {
			g.setColor(Color.WHITE);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.WHITE);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.RED);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 7) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.WHITE);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.WHITE);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 8) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.RED);
			g.drawLine(30, 30, 40, 30);
			
		} else if (k == 9) {
			g.setColor(Color.RED);
			g.drawLine(30, 10, 40, 10);
			g.setColor(Color.RED);
			g.drawLine(30, 10, 30, 20);
			g.setColor(Color.RED);
			g.drawLine(40, 10, 40, 20);
			g.setColor(Color.RED);
			g.drawLine(30, 20, 40, 20);
			g.setColor(Color.WHITE);
			g.drawLine(30, 20, 30, 30);
			g.setColor(Color.RED);
			g.drawLine(40, 20, 40, 30);
			g.setColor(Color.WHITE);
			g.drawLine(30, 30, 40, 30);

		}
		// ##################################################
		// ##################################################
		//designing and initializing the base for the sixth part of LED
		if (p == 0) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.RED);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 1) {
			g.setColor(Color.WHITE);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.WHITE);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.WHITE);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.WHITE);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 2) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.WHITE);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.WHITE);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.RED);
			g.drawLine(15, 30, 25, 30);
			

		} else if (p == 3) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.WHITE);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.RED);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 4) {
			g.setColor(Color.WHITE);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.WHITE);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 5) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.WHITE);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.RED);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 6) {
			g.setColor(Color.WHITE);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.WHITE);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.RED);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 7) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.WHITE);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.WHITE);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 8) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.RED);
			g.drawLine(15, 30, 25, 30);
			
		} else if (p == 9) {
			g.setColor(Color.RED);
			g.drawLine(15, 10, 25, 10);
			g.setColor(Color.RED);
			g.drawLine(15, 10, 15, 20);
			g.setColor(Color.RED);
			g.drawLine(25, 10, 25, 20);
			g.setColor(Color.RED);
			g.drawLine(15, 20, 25, 20);
			g.setColor(Color.WHITE);
			g.drawLine(15, 20, 15, 30);
			g.setColor(Color.RED);
			g.drawLine(25, 20, 25, 30);
			g.setColor(Color.WHITE);
			g.drawLine(15, 30, 25, 30);

		}
		// ##################################################
		// ##################################################
		
	}


	public static void main(String[] args) {
		
		LED_Timer a = new LED_Timer();
		JFrame f = new JFrame();
		f.setSize(300, 120);
		f.add(a);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
