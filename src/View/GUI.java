package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.TableController;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private JPanel contentPane = (JPanel) getContentPane();
	private JPanel top = new JPanel();
	private JPanel bottom = new JPanel();
	private ImageIcon dateIcon, sortIcon, prioIcon, addIcon;
	public JButton addButton, dateButton, sortButton, prioButton;
	private GUIMenu menu;

	/**
	 * Initialize the GUI.
	 */
	public final void initUI() {

		setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));

		// Add a menu
		menu = new GUIMenu();
		setJMenuBar(menu.getMenuBar());

		// Add a Clock
		LED_Clock clock = new LED_Clock();

		// TOP Panel, (this can be made in a new class similar to detailsPanel)
		top.setLayout(new GridLayout(1, 4, 5, 5));
		top.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		// Create components
		dateIcon = new ImageIcon(System.getProperty("user.dir")
				+ "/Resources/date.png");
		sortIcon = new ImageIcon(System.getProperty("user.dir")
				+ "/Resources/view_sort_descending.png");
		prioIcon = new ImageIcon(System.getProperty("user.dir")
				+ "/Resources/priority.png");
		addIcon = new ImageIcon(System.getProperty("user.dir")
				+ "/Resources/add.gif");

		// Create components
		dateButton = new JButton("");
		sortButton = new JButton("");// TODO change to a Drop-dwon
		prioButton = new JButton("");// TODO change to a Drop-dwon
		addButton = new JButton("");

		dateButton.setIcon(dateIcon);
		sortButton.setIcon(sortIcon);
		prioButton.setIcon(prioIcon);
		addButton.setIcon(addIcon);

		// Add components to contentsPane and top panel
		top.add(dateButton);
		top.add(sortButton);
		top.add(prioButton);
		top.add(addButton);
		add(top, BorderLayout.NORTH);

		// Add LED clock to bottom panel
		bottom.add(clock);
		add(bottom, BorderLayout.SOUTH);
		pack();
	}

	public GUIMenu getMenu() {
		return this.menu;
	}
}
