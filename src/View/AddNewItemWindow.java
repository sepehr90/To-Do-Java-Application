package View;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

import Model.Item;

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class AddNewItemWindow extends JFrame {

	public JDateChooser jDateChooser1;
	private JLabel Title, Description, Date, Priority, Category;
	public JButton submitButton;
	public ButtonGroup priorityRadioButtons = new ButtonGroup();
	private JRadioButton lowBtn, midBtn, highBtn;
	public JTextField txtDescription, txtTitle, txtCategory;

	/**
	 * Sets translated text on each component and packs it accordingly
	 * 
	 * @param
	 */
	public void setTranslate(String title, String description, String date,
			String priority, String category, String Submit) {
		Title.setText(title);
		Description.setText(description);
		Date.setText(date);
		Priority.setText(priority);
		Category.setText(category);
		submitButton.setText(Submit);
		pack();
	}

	public void initTextFields(Item item) {
		txtTitle.setText(item.getTitle());
		txtDescription.setText(item.getDescription());
		jDateChooser1.setDateFormatString(item.getDate());
		txtCategory.setText(item.getCategory());
		if (item.getPriority().toString() == "MEDIUM") {
			priorityRadioButtons.setSelected(midBtn.getModel(), true);
		} else if (item.getPriority().toString() == "HIGH") {
			priorityRadioButtons.setSelected(highBtn.getModel(), true);
		}

	}

	/**
	 * Draws the Window that has the necessary fields for adding/editing to-do
	 * items
	 * 
	 * @author - Deniz Taneli, Sepehr Forouzani
	 * @param none
	 * 
	 */
	public void initFrame() {
		// Initialize the frame with 400 x 400 pixel size and add basic
		// functionality
		// such as exiting and title

		setSize(new Dimension(400, 400));
		setTitle("Add a New Item");
		setLocationRelativeTo(null);

		// Create the panel that contains the input form
		JPanel mainPanel = new JPanel(new BorderLayout(2, 2));
		// label panel contains labels of each input parameter
		JPanel labelPanel = new JPanel(new GridLayout(0, 1, 1, 1));
		JPanel textFieldsPanel = new JPanel(new GridLayout(0, 1, 1, 1));

		txtTitle = new JTextField(10);
		Title = new JLabel("Title");
		labelPanel.add(Title);
		textFieldsPanel.add(txtTitle);

		txtDescription = new JTextField(10);
		Description = new JLabel("Description");
		labelPanel.add(Description);
		textFieldsPanel.add(txtDescription);

		// use date-picker to choose date
		jDateChooser1 = new JDateChooser();
		// set todays date as default value for date chooser
		Calendar cal = Calendar.getInstance();
		jDateChooser1.setDate(cal.getTime());
		Date = new JLabel("Date");
		labelPanel.add(Date);
		textFieldsPanel.add(jDateChooser1);

		JPanel priorityPanel = new JPanel();

		lowBtn = new JRadioButton(Model.Priority.LOW.toString());
		midBtn = new JRadioButton(Model.Priority.MEDIUM.toString());
		highBtn = new JRadioButton(Model.Priority.HIGH.toString());
		// Group the radio buttons.
		priorityRadioButtons.add(lowBtn);
		priorityRadioButtons.add(midBtn);
		priorityRadioButtons.add(highBtn);

		priorityPanel.add(lowBtn);
		lowBtn.setSelected(true);
		priorityPanel.add(midBtn);
		priorityPanel.add(highBtn);

		Priority = new JLabel("Priority");
		labelPanel.add(Priority);
		textFieldsPanel.add(priorityPanel);

		Category = new JLabel("Category");
		labelPanel.add(Category);
		txtCategory = new JTextField(10);
		textFieldsPanel.add(txtCategory);

		// button to submit the changes

		submitButton = new JButton("Submit");
		mainPanel.add(submitButton, BorderLayout.SOUTH);

		// add two panels inside the main panel to have proper alignment
		mainPanel.add(labelPanel, BorderLayout.CENTER);
		mainPanel.add(textFieldsPanel, BorderLayout.EAST);

		// add main panel to our frame
		this.getContentPane().add(mainPanel);

		this.pack();
		this.setVisible(true);
	}
}