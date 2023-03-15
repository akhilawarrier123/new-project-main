package P3MAP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NewEntryLayout {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("                  CAR PARKING ENTRY LAYOUT");// for constructing the frame 
		frame.setSize(800, 800);
	    frame.setLayout(null);
	    frame.setVisible(true);
	    HashMap<String,String> map  = new HashMap<>();
	    
	  
	    
	    
	    ArrayList<String> Vehicle = new ArrayList<String>();// for saving the entry fields to arraylists
	   

	
	

		
		String[] Vehiclechoices = { "CAR","TRUCK", "BUS","TRAILER","SCOOTER","HEAVY DUTY"};

	     JComboBox<String> cb = new JComboBox<String>(Vehiclechoices);// setting combobox for selection of vehicles
	     cb.setBounds(180,160, 200,30);
	     frame.add(cb);// to add combobox to the frame
	     
	     //frame.pack();
	     frame.setVisible(true);// for visibility

			JLabel VehicleLabel = new JLabel("Vehicle Number");// for labeling vehicle number
			VehicleLabel.setBounds(10, 10, 100, 20);
		
			JLabel VehicleTime = new JLabel("Entry time");// for labeling vehicle entry time
			VehicleTime.setBounds(10, 50, 250, 50);
			
			JLabel VehicleTimeHrs = new JLabel("Hrs");// for labeling vehicle entry time
			VehicleTimeHrs.setBounds(250, 50, 250, 50);
			
			JLabel VehicleTimeMin = new JLabel("Min");// for labeling vehicle entry time
			VehicleTimeMin.setBounds(350, 50, 250, 50);
			
			
			JLabel ContactNumber = new JLabel("Enter the Contact number");//for contact number
			ContactNumber.setBounds(10, 100, 250, 50);
		
			JLabel VehicleType = new JLabel("Enter the Vehicle Type");//for vehicle type
			VehicleType .setBounds(10, 150, 250, 50);
			
			JLabel Error = new JLabel("");//for contact number
			Error.setBounds(10, 200, 250, 50);
			
			frame.add(ContactNumber);                               //adding each field to the frame
			frame.add(VehicleLabel);
			frame.add(VehicleTime);
			frame.add(VehicleType);
			frame.add(VehicleTimeHrs);
			frame.add(VehicleTimeMin);
			frame.add(Error);
			
			
			  
				     
	        JTextField t1,t2,t3,t4;  
		    t1=new JTextField("Type the corresponding number");  // to type the vehicle number
		    t1.setBounds(180,10,200,30);  // for setting the length width height etc.. of the text box
		  t1.addKeyListener(new KeyAdapter() {
		        @Override
		        public void keyTyped(KeyEvent e) {
		            if (t1.getText().length() >= 10 ) // to limit to 10 characters
		                e.consume();
		          t1.getAction(); // for getting this action inside the textfield
		        }
		    });
		 
	       t2=new JTextField(""); 
	       t2.setBounds(180,60,60,30); 
	       

	     
	       
	       t3=new JTextField(""); 
	       t3.setBounds(280,60,60,30); 
		
			 //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
			  //  Date date = new Date();  
			 //   System.out.println(formatter.format(date));  
		   
			t4=new JTextField("Type the Contact number");  
			t4.setBounds(180,110, 200,30);
			
	        frame.add(t1); frame.add(t2);frame.add(t3);frame.add(t4);  
			frame.setSize(400,400);  
		    frame.setLayout(null);
		    frame.setVisible(true);
		    //int a=Integer.parseInt(t2.getText());
		   //int b=Integer.parseInt(t3.getText());
		    
		    t2.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent e) {
	                if (!Character.isDigit(e.getKeyChar())) {       // to get only the numerical values
	                    e.consume();
	                }
	                
	                if (t2.getText().length() >= 2 ) // limit to 10 characters
	                    e.consume();
	               
	    		    
	                t2.getAction();
	               
	           }
	        });
		    
		    t3.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent evt) {
	            	
	 
	            			
	                if (!Character.isDigit(evt.getKeyChar())) {       // to get only the numerical values
	                    evt.consume();
	                }
	                if (t3.getText().length() >= 2 )   // limit to 10 characters
	                    evt.consume();
	                t3.getAction();
	                
	      		        
	      		    
	                     
	            }
	        });
			
		   
		    
		    t4.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent evt) {
	                if (!Character.isDigit(evt.getKeyChar())) {       // to get only the numerical values
	                    evt.consume();
	                }
	                if (t4.getText().length() >= 10 ) // limit to 10 characters
	                    evt.consume();
	                t4.getAction();
	            }
	        });
		  
		   
		   JButton jButton = new JButton("save");// for saving the data a button is created
		   jButton.setBounds(100, 250, 100, 30);
		   frame.add(jButton, "save");
		   jButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Button Clicked");
				
				int thr = Integer.parseInt(t2.getText());
				int tmin = Integer.parseInt(t3.getText());
				
				
				if ((thr>24) || (tmin>60))
		
					Error.setText("Please enter valid details");
					//System.out.println("Error");
				
				
				if ((thr<=24) && (tmin<=60))
						Error.setText("");
						int Ptime = Integer.parseInt(t2.getText())*60 + (Integer.parseInt(t3.getText()));
						Vehicle.add(t1.getText());
						Vehicle.add(t4.getText());
						Vehicle.add(String.valueOf(Ptime));
						Vehicle.add(cb.getSelectedItem().toString());
						String EntryTime = String.valueOf(Ptime);
						String k = EntryTime.toString() + "," + t4.getText().toString()+","+cb.getSelectedItem().toString();
						map.put(t1.getText(), k);
						System.out.println(map);
			
				
				
				
				if(e.getSource()==cb)
				{
					//System.out.println(cb.getSelectedItem().toString());       // for getting the combobox element saved
				}
				
				for(String X:Vehicle) {
					System.out.println(X);
				
			}}
			   
		   });
		   if(VehicleLabel.equals("")|| VehicleTime.equals("")||ContactNumber.equals("")||VehicleType.equals(""))

		   {

		               JOptionPane.showMessageDialog(null,"Please Enter the Valid Details");

		   }

		   
	frame.setSize(500,400);
	
		  }
	

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "ENTRYLAYOUT []";
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}}

	



	
