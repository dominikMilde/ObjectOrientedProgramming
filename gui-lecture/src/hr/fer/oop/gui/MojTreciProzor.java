/**
 * 
 */
package hr.fer.oop.gui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class MojTreciProzor extends JFrame{
	static int p;
	public MojTreciProzor() {
		this.setLocation((int) (200), (int) (200));
		this.setSize(400, 300);
		setTitle("Moj treci prozor");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p++;
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<1; i++) {
					
					JFrame f1 = new MojTreciProzor();
					f1.setLayout(new BorderLayout());
					JTextField tekst = new JTextField("Defaultni");
					f1.add(tekst, BorderLayout.NORTH);
					
					JButton btn = new JButton("Klikni mee");
					f1.add(btn, BorderLayout.SOUTH);
					ImageIcon img = new ImageIcon("C:\\Users\\Dominik\\Desktop\\ŠKOLA\\Zavrsni\\slike\\klav.jpg");
					JLabel imgLabel = new JLabel(img); 
					f1.add(imgLabel);
				}
			}
		});	
		
		Thread.sleep(500);
		System.out.println("...");
	}

}

