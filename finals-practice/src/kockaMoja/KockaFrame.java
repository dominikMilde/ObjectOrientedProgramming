/**
 * 
 */
package kockaMoja;

import java.awt.GridLayout;
import java.awt.List;
import java.util.*;
import java.util.concurrent.ExecutionException;

import javax.swing.*;

/**
 * @author Dominik
 *
 */
public class KockaFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public KockaFrame() {
		setLayout(new GridLayout(6, 3));
		ArrayList<JTextField> lista = new ArrayList<>();
		// row 0
		JLabel l1 = new JLabel("Broj 1");
		JLabel l1space = new JLabel("");
		JTextField ta1 = new JTextField("0");
		ta1.setEnabled(false);

		this.add(l1);
		this.add(l1space);
		this.add(ta1);

		lista.add(ta1);

		// row 1
		JLabel l2 = new JLabel("Broj 2");
		JLabel l2space = new JLabel("");
		JTextField ta2 = new JTextField("0");
		ta2.setEnabled(false);

		this.add(l2);
		this.add(l2space);
		this.add(ta2);

		lista.add(ta2);

		// row 2
		JLabel l3 = new JLabel("Broj 3");
		JLabel l3space = new JLabel("");
		JTextField ta3 = new JTextField("0");
		ta3.setEnabled(false);

		this.add(l3);
		this.add(l3space);
		this.add(ta3);

		lista.add(ta3);

		// row 3
		JLabel l4 = new JLabel("Broj 4");
		JLabel l4space = new JLabel("");
		JTextField ta4 = new JTextField("0");
		ta4.setEnabled(false);

		this.add(l4);
		this.add(l4space);
		this.add(ta4);

		lista.add(ta4);
		
		// row 4
		JLabel l5 = new JLabel("Broj 5");
		JLabel l5space = new JLabel("");
		JTextField ta5 = new JTextField("0");
		ta5.setEnabled(false);

		this.add(l5);
		this.add(l5space);
		this.add(ta5);

		lista.add(ta5);
		
		//ROW 5
		add(new JLabel(""));
		add(new JLabel(""));
		JButton botun = new JButton("Generiraj");
		add(botun);
		
		botun.addActionListener(e -> {
			SwingWorker<Integer, Void> moj = new SwingWorker<Integer, Void>(){
				public Integer doInBackground() throws InterruptedException {
					Thread.sleep(500);
					int broj = (int)(Math.random() * 5);
					System.out.println(broj);
					return broj;
				}
				public void done(){
					try {
						String br = lista.get(this.get()).getText();
						int sljedeci = Integer.parseInt(br) +1;
						lista.get(this.get()).setText(String.valueOf(sljedeci));
					} catch (InterruptedException | ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}			
			};
			moj.execute();
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				KockaFrame kf = new KockaFrame();
				kf.setLocation(200, 200);
				kf.setSize(400, 300);
				kf.setDefaultCloseOperation(EXIT_ON_CLOSE);
				kf.setVisible(true);
			}
		});
	}

}
