package P2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		ENTRYLAYOUT EN=new ENTRYLAYOUT();
		EXITLAYOUT EX=new EXITLAYOUT();
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
		System.out.println("Button Clicked");
	}

}
