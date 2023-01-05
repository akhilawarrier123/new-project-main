package P1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ENTRYLAYOUT {
	

	//private static final AbstractButton VehicleNumber = null;

	public static boolean main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("                  CAR PARKING ENTRY LAYOUT");
		frame.setSize(800, 800);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    ArrayList<String> Vehicle = new ArrayList<>();
	   // ArrayList<Vehicledriver> A1= new ArrayList<Vehicledriver>();

	
	

		
		String[] Vehiclechoices = { "CAR","TRUCK", "BUS","TRAILER","SCOOTER","HEAVY DUTY"};

	     JComboBox<String> cb = new JComboBox<String>(Vehiclechoices);
	     cb.setBounds(180,160, 200,30);
	     frame.add(cb);
	     
	     frame.pack();
	     frame.setVisible(true);

			JLabel VehicleLabel = new JLabel("Vehicle Number");
			VehicleLabel.setBounds(10, 10, 100, 20);
		
			JLabel VehicleTime = new JLabel("Entry time");
			VehicleTime.setBounds(10, 50, 250, 50);
			JLabel ContactNumber = new JLabel("Enter the Contact number");
			ContactNumber.setBounds(10, 100, 250, 50);
			JLabel VehicleType = new JLabel("Enter the Vehicle Type");
			VehicleType .setBounds(10, 150, 250, 50);
			frame.add(ContactNumber);
			frame.add(VehicleLabel);
			frame.add(VehicleTime);
			frame.add(VehicleType);

			  
				     
	        JTextField t1,t2,t3;  
		    t1=new JTextField("Type the corresponding number");  
		    
		    t1.setBounds(180,10,200,30);  
		   
	        t2=new JTextField("Enter the Time");  
			t2.setBounds(180,60, 200,30); 
			t3=new JTextField("Type the Contact number");  
			t3.setBounds(180,110, 200,30); 
	        frame.add(t1); frame.add(t2);frame.add(t3);  
			frame.setSize(400,400);  
		    frame.setLayout(null);
		    frame.setVisible(true); 
		    
		    
		   JButton jButton = new JButton("save");
		   jButton.setBounds(100, 250, 100, 30);
		   frame.add(jButton, "save");
		   
		   jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked");
			
				Vehicle.add(t1.getText());
				Vehicle.add(t2.getText());
				Vehicle.add(t3.getText());
				if(e.getSource()==cb)
				{
					System.out.println(cb.getSelectedIndex());
				}
				//Vehicle.addAll(cb.getSelectedItem());
				for(String X:Vehicle) {
					System.out.println(X);
				
			}}
			   
		   });
		   
	frame.setSize(500,400);
	return true;	  
		   
	}

	@Override
	public String toString() {
		return "ENTRYLAYOUT []";
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}}
		






