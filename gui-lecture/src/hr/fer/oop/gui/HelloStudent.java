/**
 * 
 */
package hr.fer.oop.gui;

/**
 * @author Dominik
 *
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class HelloStudent extends JFrame {
	static int p;

	public HelloStudent() {
		this.setLocation((int) (200), (int) (200));
		this.setSize(400, 300);
		setTitle("Suvisli prozor");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p++;
		setLayout(new BorderLayout());
	
		JTextField tekst = new JTextField("Defaultni");
		add(tekst, BorderLayout.CENTER);

		JButton btn = new JButton("OK");
		add(btn, BorderLayout.SOUTH);
		
		JLabel lbl = new JLabel();
		lbl.setHorizontalAlignment(SwingConstants.CENTER);

	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				JFrame f1 = new HelloStudent();
				}
		});

		Thread.sleep(500);
		System.out.println("...");
	}

}