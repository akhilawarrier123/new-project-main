package P2;

import java.awt.Component;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class ENTRYLAYOUT {

	public void Entry(HashMap<String, String> map, HashMap<String, Integer> M)

	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("                  CAR PARKING ENTRY LAYOUT");// for constructing the frame
		frame.setSize(800, 800);
		frame.setLayout(null);
		frame.setVisible(true);

		

		String[] Vehiclechoices = { "CAR", "AUTO", "TRUCK", "BUS", "TRAILER", "SCOOTER", "HEAVY DUTY" };

		JComboBox<String> cb = new JComboBox<String>(Vehiclechoices);// setting combobox for selection of vehicles
		cb.setBounds(180, 160, 200, 30);
		frame.add(cb);// to add combobox to the frame

		// frame.pack();
		frame.setVisible(true);// for visibility

		JLabel VehicleLabel = new JLabel("Vehicle Number");// for labeling vehicle number
		VehicleLabel.setBounds(10, 10, 100, 20);

		JLabel VehicleTime = new JLabel("Entry time");// for labeling vehicle entry time
		VehicleTime.setBounds(10, 50, 250, 50);

		JLabel VehicleTimeHrs = new JLabel("Hrs");// for labeling vehicle entry time
		VehicleTimeHrs.setBounds(250, 50, 250, 50);

		JLabel VehicleTimeMin = new JLabel("Min");// for labeling vehicle entry time
		VehicleTimeMin.setBounds(350, 50, 250, 50);

		JLabel ContactNumber = new JLabel("Enter the Contact number");// for contact number
		ContactNumber.setBounds(10, 100, 250, 50);

		JLabel VehicleType = new JLabel("Enter the Vehicle Type");// for vehicle type
		VehicleType.setBounds(10, 150, 250, 50);

		JLabel Error = new JLabel("");// for contact number
		Error.setBounds(10, 200, 250, 50);

		frame.add(ContactNumber); // adding each field to the frame
		frame.add(VehicleLabel);
		frame.add(VehicleTime);
		frame.add(VehicleType);
		frame.add(VehicleTimeHrs);
		frame.add(VehicleTimeMin);
		frame.add(Error);

		JTextField t1, t2, t3, t4;

		t1 = new JTextField("Type the corresponding number"); // to type the vehicle number
		t1.setBounds(180, 10, 200, 30); // for setting the length width height etc.. of the text box
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (t1.getText().length() >= 10) // to limit to 10 characters
					e.consume();
				t1.getAction(); // for getting this action inside the textfield
			}
		});

		t2 = new JTextField("");
		t2.setBounds(180, 60, 60, 30);

		t3 = new JTextField("");
		t3.setBounds(280, 60, 60, 30);

		t4 = new JTextField("Type the Contact number");
		t4.setBounds(180, 110, 200, 30);

		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	

		t2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) { // to get only the numerical values
					e.consume();
				}

				if (t2.getText().length() >= 2) // limit to 2 characters
					e.consume();

				t2.getAction();

			}
		});

		t3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent evt) {

				if (!Character.isDigit(evt.getKeyChar())) { // to get only the numerical values
					evt.consume();
				}
				if (t3.getText().length() >= 2) // limit to 2 characters
					evt.consume();
				t3.getAction();

			}
		});

		t4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent evt) {
				if (!Character.isDigit(evt.getKeyChar())) { // to get only the numerical values
					evt.consume();
				}
				if (t4.getText().length() >= 10) // limit to 10 characters
					evt.consume();
				t4.getAction();
			}
		});

		JButton jButton = new JButton("save");// for saving the data a button is created
		jButton.setBounds(100, 250, 100, 30);
		frame.add(jButton, "save");
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Button Clicked");

				

				int thr = Integer.parseInt(t2.getText());
				int tmin = Integer.parseInt(t3.getText());

				if ((thr > 24) || (tmin > 60))
					JOptionPane.showMessageDialog(null,"Please enter valid details");
					
				int Ptime = Integer.parseInt(t2.getText()) * 60 + (Integer.parseInt(t3.getText()));

				String EntryTime = String.valueOf(Ptime);
				String k = EntryTime + "," + t4.getText() + "," + cb.getSelectedItem().toString();
				map.put(t1.getText(), k);

			

			}
		});

		

		frame.setSize(500, 400);

	}

}
