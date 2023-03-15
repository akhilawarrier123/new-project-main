package P1;



import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ENTRYANDEXITCOMBO {
	 
	  

	public static void main(String[] args) {
		 HashMap<String,String> map  = new HashMap<>();
		 HashMap<String,Integer> M  = new HashMap<String,Integer>();

		
		
JFrame frame = new JFrame();
frame.setVisible(true);
frame.setTitle("COMBO");
frame.setSize(800, 400);
frame.setLayout(null);
frame.setVisible(true);
JButton jButton = new JButton("Entry");
jButton.setBounds(100, 100, 100, 60);
frame.add(jButton, "Entry");

JButton jButton1 = new JButton("Exit");
jButton1.setBounds(500, 100, 100, 60);
frame.add(jButton1, "Exit");


jButton.addActionListener(new ActionListner() {
	public void actionPerformed(ActionEvent e) {
		ENTRYLAYOUT EN=new ENTRYLAYOUT();
		EN.Entry(map, M);

	}	
});

	
jButton1.addActionListener(new ActionListner() {
	public void actionPerformed(ActionEvent e) {
		EXITLAYOUT EX=new EXITLAYOUT();
		EX.Exit(map, M);
}	
});

	}}



