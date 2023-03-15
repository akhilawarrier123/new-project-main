package P1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EXITLAYOUT {
	
	
	public static void Exit(HashMap<String,String> map,HashMap<String,Integer> M )
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("                      CAR PARKING EXIT LAYOUT");
		frame.setSize(1000, 1000);
		
	    frame.setLayout(null);
	    frame.setVisible(true);
      
	   

		
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
			JLabel ContactNumber = new JLabel(" Contact number");
			ContactNumber.setBounds(10, 150, 250, 50);
			JLabel VehicleTimeHrs1 = new JLabel("Hrs");// for labeling vehicle entry time
			VehicleTimeHrs1.setBounds(250, 50, 250, 50);
			
			JLabel VehicleTimeMin1 = new JLabel("Min");// for labeling vehicle entry time
			VehicleTimeMin1.setBounds(350, 50, 250, 50);
			frame.add(VehicleTimeHrs1);
			frame.add(VehicleTimeMin1);
			//JLabel VehicleType = new JLabel("Enter the Vehicle Type");
		//	VehicleType .setBounds(10, 150, 250, 50);
			frame.setVisible(true);
			frame.add(Amount);
			frame.add(VehicleLabel);
			frame.add(VehicleTime);
			frame.add(ContactNumber);
			
			
		
		

			  
				     
	       JTextField t1;  
		    t1=new JTextField("    Type the corresponding number");  
		    
		    t1.setBounds(180,10,200,30);  
		    frame.add(t1);
		    t1.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent e) {
	                
	                
	                if (t1.getText().length() >= 10 ) // limit to 2 characters
	                    e.consume();
	               
	                
	               
	           }
	        });
		    JLabel VehicleTime1 = new JLabel("Exit time");// for labeling vehicle entry time
			VehicleTime1.setBounds(10, 50, 250, 50);
			
			JLabel VehicleTimeHrs = new JLabel("Hrs");// for labeling vehicle entry time
			VehicleTimeHrs.setBounds(250, 50, 250, 50);
			
			JLabel VehicleTimeMin = new JLabel("Min");// for labeling vehicle entry time
			VehicleTimeMin.setBounds(350, 50, 250, 50);
		     
	        JTextField t21,t31;
		 
		 
	       t21=new JTextField(""); 
	       t21.setBounds(180,60,60,30); 
	       
	       t21.getText();
	     
	       
	       t31=new JTextField(""); 
	       t31.setBounds(280,60,60,30); 
	       frame.add(t21); frame.add(t31);
	       t21.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent e) {
	                if (!Character.isDigit(e.getKeyChar())) {       // to get only the numerical values
	                    e.consume();
	                }
	                
	                if (t21.getText().length() >= 2 ) // limit to 2 characters
	                    e.consume();
	               
	                
	               
	           }
	        });
		    
		    t31.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent evt) {
	            	
	 
	            			
	                if (!Character.isDigit(evt.getKeyChar())) {       // to get only the numerical values
	                    evt.consume();
	                }
	                if (t31.getText().length() >= 2 )   // limit to 10 characters
	                    evt.consume();
	                t31.getAction();
	                
	      		        
	                
	            }
	        });
	                     
			
	       /* t2=new JTextField("     Enter the Time");  
			t2.setBounds(180,60, 200,30); 
			t3=new JTextField("     0.00");  
			t3.setBounds(180,110, 200,30); 
			t5=new JTextField("    Display contact number");  
			t5.setBounds(180,160, 200,30); 
	        frame.add(t21); frame.add(t31);
	        frame.add(t3) ; 
			frame.setSize(400,400);  
			//t4=new JTextField("           Fetch");  
			//t4.setBounds(420,10, 130,30);
			//frame.add(t4);
			frame.add(t5);
		    frame.setLayout(null);
		    frame.setVisible(true); */
		    
		    
		   JButton jButton = new JButton("Fetch");
		   jButton.setBounds(420,10, 130, 30);
		   frame.add(jButton, "Fetch");
		 
				 			
			frame.setSize(600,300);
			//return true;
			
	       
	        
	   
	}


	}




