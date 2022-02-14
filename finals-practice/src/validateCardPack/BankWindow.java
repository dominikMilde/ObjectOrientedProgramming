/**
 * 
 */
package validateCardPack;

import java.awt.GridLayout;
import java.util.concurrent.ExecutionException;

import javax.swing.*;

public class BankWindow extends JFrame{

	public BankWindow() {
		setLayout(new GridLayout(3, 3));
		
		//row 0
		JLabel l1 = new JLabel("IBAN");
		add(l1);
		add(new JLabel(""));
		JTextField textField = new JTextField(25);
		add(textField);
		
		//row 1
		JLabel l2 = new JLabel("VALIDAN");
		add(l2);
		add(new JLabel(""));
		JTextField tfValidan = new JTextField(25);
		tfValidan.setText("NE");
		tfValidan.setEnabled(false);
		add(tfValidan);
		
		//row 2
		
		add(new JLabel(""));
		add(new JLabel(""));
		JButton botun = new JButton("Provjeri");
		add(botun);
		botun.addActionListener(e -> {
			botun.setEnabled(false);
			SwingWorker<Boolean, Void> sw = new SwingWorker<Boolean, Void>() {
				public Boolean doInBackground() {
//					IBANCheckDigit ib = new IBANChechDigit();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return true;
				}
				public void done() {
					try {
						if(this.get()) {
							tfValidan.setText("DA");
							botun.setEnabled(true);
						}
					} catch (InterruptedException | ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			sw.execute();
		});
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				BankWindow bw = new BankWindow();
				bw.setLocation(200, 200);
				bw.setSize(500, 200);
				bw.setVisible(true);
				bw.setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
		});
	}

}
