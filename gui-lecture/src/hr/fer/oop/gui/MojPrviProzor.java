/**
 * 
 */
package hr.fer.oop.gui;

import javax.swing.*;

/**
 * @author Dominik
 *
 */
public class MojPrviProzor extends JFrame{
	static int p;
	public MojPrviProzor() {
		this.setLocation((int) (Math.random()*1000), (int) (Math.random()*1000));
		this.setSize(400, 300);
		setTitle("Moj prvi prozor");
		setVisible(true);
		p++;
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<1500; i++) {
					
					JFrame f1 = new MojPrviProzor();
					
				}
			}
		});	
		
		Thread.sleep(500);
		System.out.println("...");
	}

}
