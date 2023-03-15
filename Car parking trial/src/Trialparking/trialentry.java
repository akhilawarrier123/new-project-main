package Trialparking;


	import java.awt.BorderLayout;
import java.awt.Component;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.text.DateFormat;
	import java.text.Format;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.time.LocalTime;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Collection;
	import java.util.Date;

import javax.swing.AbstractAction;
import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFormattedTextField;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
	import javax.swing.JTextField;
	import javax.swing.SpinnerNumberModel;
	import javax.swing.SwingUtilities;
	import javax.swing.Timer;

	public class trialentry {
		

		



		public static void main(String[] args)
		{
		
		
		class ClockPane extends JPanel {

			  /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public JLabel clock = new JLabel();

			  public ClockPane() {
			    setLayout(new BorderLayout());
			    tickTock();
			    add(clock);
			    Timer timer = new Timer(500, new ActionListener() {
			      @Override
			      public void actionPerformed(ActionEvent e) {
			        tickTock();
			      }
			    });
			    timer.setRepeats(true);
			    timer.setCoalesce(true);
			    timer.setInitialDelay(0);
			    timer.start();
			  }

			  public void tickTock() {
			    clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
			 
			  }
			}
			

			
			DateFormat dfor = new SimpleDateFormat("dd/MM/yy    HH:mm:ss");
			  Calendar obj = Calendar.getInstance();
			 // System.out.println(dfor.format(obj.getTime())); 
		
		
		//	DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy , HH:mm");// for automatic display of date and time
			// Date date = new Date();
			JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setTitle("CAR PARKING ENTRY LAYOUT      "  +dfor.format(obj.getTime()));
			
// for constructing the frame 
		
			frame.setSize(500, 90);
			frame.add(new ClockPane());
		    frame.setLayout(null);
		    frame.setVisible(true);
		    frame.pack();
		    ArrayList<String> Vehicle = new ArrayList<>();// for saving the entry fields to arraylists
		   
			
			String[] Vehiclechoices = { "CAR","TRUCK", "BUS","TRAILER","SCOOTER","HEAVY DUTY"};

		     JComboBox<String> cb = new JComboBox<String>(Vehiclechoices);// setting combobox for selection of vehicles
		     cb.setBounds(180,110, 200,30);
		     frame.add(cb);// to add combobox to the frame
		     
		     //frame.pack();
		     frame.setVisible(true);// for visibility

				JLabel VehicleLabel = new JLabel("Vehicle Number");// for labeling vehicle number
				VehicleLabel.setBounds(10, 10, 100, 20);
				
				//JLabel timedisplay = new JLabel("Current Time" + dfor.format(obj.getTime()));// for showing the time
				//timedisplay.setBounds(10, 150, 100, 50);
			
	
				JLabel ContactNumber = new JLabel("Enter the Contact number");//for contact number
				ContactNumber.setBounds(10, 50, 250, 50);
			
				JLabel VehicleType = new JLabel("Enter the Vehicle Type");//for vehicle type
				VehicleType .setBounds(10, 100, 250, 50);
				
				
				frame.add(ContactNumber);                               //adding each field to the frame
				frame.add(VehicleLabel);
				frame.add(VehicleType);
				frame.add(new ClockPane());
				


				  
					     
		        JTextField t1,t3,t2;  
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
			  
			 // JButton jButton1 = new JButton("display current time");// for saving the data a button is created
			 //  jButton1.setBounds(200,60 , 200, 30);
			 //  frame.add(jButton1,("display current time"));
			 
			  //JFrame frame1= new JFrame("Current Date: "+dateFormat.format(date));

			 
			 
			      

			  /* jButton1.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Button Clicked");
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				  LocalTime localTime = LocalTime.now();
				  System.out.println(dtf.format(localTime));
				  t2.getAction();
					}});*/
				 
				t2=new JTextField(DateFormat.getDateTimeInstance().format(new Date())) ;  
				t2.setBounds(180,30, 200,30); 
				t3=new JTextField("Type the Contact number");  
				t3.setBounds(180,60, 200,30); 
		        frame.add(t1);frame.add(t3); frame.add(t2) ;
				frame.setSize(400,400);  
			    frame.setLayout(null);
			    frame.setVisible(true); 
			  
			   
			   t3.addKeyListener(new KeyAdapter() {
		            public void keyTyped(KeyEvent evt) {
		                if (!Character.isDigit(evt.getKeyChar())) {       // to get only the numerical values
		                    evt.consume();
		                }
		                if (t3.getText().length() >= 10 ) // limit to 10 characters
		                    evt.consume();
		                t3.getAction();
		            }
		        });
			  
			   
			 
			   
			   JButton jButton = new JButton("save");// for saving the data a button is created
			   jButton.setBounds(150, 180, 100, 30);
			   frame.add(jButton, "save");
			   jButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Button Clicked");
				// all the field entered is saved to arraylists
					Vehicle.add(t1.getText());
					Vehicle.add(frame.getTitle());
					Vehicle.add(t3.getText());
					Vehicle.add(cb.getSelectedItem().toString());
					if(e.getSource()==cb)
					{
						System.out.println(cb.getSelectedItem().toString());       // for getting the combobox element saved
					}
					
					for(String X:Vehicle) {
						System.out.println(X);
					
				}}
				   
			   });
			   
			   
			   
			   
			   if(VehicleLabel.equals("")||ContactNumber.equals("")||VehicleType.equals(""))

			   {

			               JOptionPane.showMessageDialog(null,"Please Enter the Valid Details");

			   }

			   
		frame.setSize(600,370);
		
			   
		}

		@Override
		public String toString() {
			return "ENTRYLAYOUT []";
		}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}
			   }
		
			   

