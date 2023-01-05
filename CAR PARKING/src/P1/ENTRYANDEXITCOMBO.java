package P1;



import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ENTRYANDEXITCOMBO {

	public static void main(String[] args) {

//EXITLAYOUT EX=new EXITLAYOUT();
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
ENTRYLAYOUT EN=new ENTRYLAYOUT();
EN.setVisible(true);
{
System.out.println(EN.getClass());
}

jButton.addActionListener(new ActionListner() {
	public void actionPerformed(ActionEvent e) {
EN.getClass();	
System.out.print(ENTRYLAYOUT.main(args));
}	
});
EXITLAYOUT EX=new EXITLAYOUT();
EX.setVisible(true);
{
	System.out.println(EN.getClass());
}
jButton1.addActionListener(new ActionListner() {
	public void actionPerformed(ActionEvent e) {
EX.getClass();	
System.out.print(EXITLAYOUT.main(args));
}	
});

	}}



