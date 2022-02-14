package hr.fer.oop.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Akcije extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public Akcije() {
		this.setLocation(100,100);
		this.setSize(200,120);
		this.setTitle("Prozor stare majke");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JLabel labela1 = new JLabel("I ❤ grah");
		labela1.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField text = new JTextField(10);
		JButton btn = new JButton("OK");
		
//		BORDER!!
		this.setLayout(new BorderLayout());
		this.add(labela1, BorderLayout.NORTH);
		this.add(new JLabel("Unesi ime i prezime "),BorderLayout.WEST);
		this.add(text, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.add(btn);
		this.add(panel, BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("wooooo");
//				System.out.println("tekst: "+text.getText());
				JOptionPane.showMessageDialog(Akcije.this, "Hello "+text.getText());
				
			}
		});
		
		text.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(text.getText().equals(""))
				text.setText("Ovdje upisi ime");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(text.getText().equals("Ovdje upisi ime"))
				text.setText("");
				
			}
		});
		this.setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
					JFrame f1 = new Akcije();
					
					JLabel labela1 = new JLabel("I ❤ grah");					
					ImageIcon img = new ImageIcon("C:\\Igre\\Eclipse\\program\\3447855837_551bb012aa.jpg");
					JLabel labela2 = new JLabel(img);
					JTextField text = new JTextField(5);
					JButton btn = new JButton("Eat me!");	
					
//					FLOW!!!
//					f1.setLayout(new FlowLayout());
//					f1.add(labela1);
//					f1.add(labela2);
//					f1.add(text);
//					f1.add(btn);
					
//					BORDER!!
//					f1.setLayout(new BorderLayout());
//					f1.add(labela1, BorderLayout.NORTH);
//					f1.add(labela2);
//					f1.add(text, BorderLayout.EAST);
//					f1.add(btn,BorderLayout.WEST);
					
//					GRID!!!
//					f1.setLayout(new GridLayout(3,2));
//					f1.add(labela2);
//					f1.add(labela1);
//					f1.add(text);
//					f1.add(new Button("1"));
//					f1.add(new Button("2"));
//					f1.add(new Button("3"));
//					f1.add(new Button("4"));
					
//					f1.pack();
					f1.setVisible(true);
					
			}
		});
		
		System.out.println("...");
	}

}