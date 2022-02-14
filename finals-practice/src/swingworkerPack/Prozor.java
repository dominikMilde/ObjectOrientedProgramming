/**
 * 
 */
package swingworkerPack;

import java.awt.BorderLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;

/**
 * @author Dominik
 *
 */
public class Prozor extends JFrame{
	private static final long serialVersionUID = 1L;
	JTextArea textArea;
	public Prozor() {
		JTextArea textArea = new JTextArea(30, 40);
		textArea.setAutoscrolls(true);
		this.add(textArea);
		JProgressBar pb = new JProgressBar();
		pb.setMinimum(0);
		pb.setMaximum(20);
		pb.setValue(0);
		pb.setStringPainted(true);
		
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.add(pb);
		this.add(panel, BorderLayout.SOUTH);
		JButton botun = new JButton("Pokreni worker");
		botun.addActionListener(e -> {
			MyWorker mw = new MyWorker(textArea, pb);
			mw.execute();
		});
		panel.add(botun);
		
	}

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		// TODO Auto-generated method stub
		SwingUtilities.invokeAndWait(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Prozor prozor = new Prozor();
				prozor.setLocation(200, 200);
				prozor.setSize(400, 300);
				prozor.setVisible(true);
				prozor.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			}
		});
	}

}
