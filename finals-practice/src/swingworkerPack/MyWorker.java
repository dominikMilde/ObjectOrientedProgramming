/**
 * 
 */
package swingworkerPack;

import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 * @author Dominik
 *
 */
public class MyWorker extends SwingWorker<Integer, String>{
	private JTextArea textarea;
	private JProgressBar pb;
	
	public MyWorker(JTextArea textarea, JProgressBar pb) {
		// TODO Auto-generated constructor stub
		this.textarea = textarea;
		this.pb = pb;
	}
	@Override
	protected Integer doInBackground() throws Exception {
		for(int i = 0; i<20; i++) {
			Thread.sleep(500);
			publish(" " + i);
			
		}
		return 20;
		
	}

	@Override
	protected void process(List<String> chunks) {
		for(String chunk : chunks) {
			textarea.append(chunk);
			pb.setValue(Integer.parseInt(chunk.trim())+1);		}
	}

	@Override
	protected void done() {
		try {
			System.out.println(get().toString());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
