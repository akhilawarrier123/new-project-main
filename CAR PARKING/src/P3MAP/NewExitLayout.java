package P3MAP;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewExitLayout {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("                      CAR PARKING EXIT LAYOUT");
		frame.setSize(1000, 1000);
		
	    frame.setLayout(null);
	    frame.setVisible(true);

	
	    HashMap<String,String> map  = new HashMap<>();
	    

		
		/*String[] choices = { "CAR","TRUCK", "BUS","TRAILER","SCOOTER","HEAVY DUTY"};

	     JComboBox<String> cb = new JComboBox<String>(choices);
	     cb.setBounds(180,160, 200,30);
	     frame.add(cb);*/
	     

			JLabel VehicleLabel = new JLabel("Vehicle Number");
			VehicleLabel.setBounds(10, 10, 100, 20);
			JLabel VehicleTime = new JLabel("Exit time");
			VehicleTime.setBounds(10, 50, 250, 50);
			JLabel Amount = new JLabel("Total Amount");
			Amount.setBounds(10, 100, 250, 50);
			JLabel Fetch = new JLabel("Fetch");
			Fetch.setBounds(10, 100, 250, 50);
			JLabel ContactNumber = new JLabel("Enter the Contact number");
			ContactNumber.setBounds(10, 150, 250, 50);
			//JLabel VehicleType = new JLabel("Enter the Vehicle Type");
		//	VehicleType .setBounds(10, 150, 250, 50);
			frame.add(Amount);
			frame.add(VehicleLabel);
			frame.add(VehicleTime);
			frame.add(ContactNumber);
			//frame.add(VehicleType);

			  
				     
	        JTextField t1,t2,t3,t5;  
		    t1=new JTextField("    Type the corresponding number");  
		    
		    t1.setBounds(180,10,200,30);  
		   
	        t2=new JTextField("     Enter the Time");  
			t2.setBounds(180,60, 200,30); 
			t3=new JTextField("     0.00");  
			t3.setBounds(180,110, 200,30); 
			t5=new JTextField("    Display contact number");  
			t5.setBounds(180,160, 200,30); 
	        frame.add(t1); frame.add(t2);frame.add(t3) ; 
			frame.setSize(400,400);  
			//t4=new JTextField("           Fetch");  
			//t4.setBounds(420,10, 130,30);
			//frame.add(t4);
			frame.add(t5);
		    frame.setLayout(null);
		    frame.setVisible(true); 
		    
		    
		   JButton jButton = new JButton("Fetch");
		   jButton.setBounds(420,10, 130, 30);
		   frame.add(jButton, "Fetch");
		 
			
			
				 			
			frame.setSize(600,300);
			//return true;
	        
	        
	        
		}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}


	}




