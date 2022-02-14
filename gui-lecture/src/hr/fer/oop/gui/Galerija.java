package hr.fer.oop.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Galerija extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public Galerija() {
		this.setLocation(100,100);
		this.setSize(400,300);
		this.setTitle("Prozor stare majke");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JButton btn1 = new JButton("Slika 1");
		JButton btn2 = new JButton("Slika 2");
		
		ImageIcon img1 = new ImageIcon("D:\\test\\pickle-rick.jpg");
		ImageIcon img2 = new ImageIcon("C:\\Igre\\Eclipse\\program\\Greek_lc_theta.svg.jpg");
		
		setLayout(new BorderLayout());
		JLabel imgLabel = new JLabel();
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(imgLabel);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		this.add(btnPanel,BorderLayout.SOUTH);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				imgLabel.setIcon(img1);
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				imgLabel.setIcon(img2);

			}
		});
	}
	
	public static void main(String[] args) throws Exception {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
					JFrame f1 = new Galerija();
					
					
			}
		});
		
		System.out.println("...");
	}

}