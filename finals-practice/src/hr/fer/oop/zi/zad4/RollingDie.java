package hr.fer.oop.zi.zad4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class RollingDie extends JFrame {// (1)
	private JLabel textLbl = new JLabel("Broj bacanja kocke:");
	private JTextField numberOfRollsTf = new JTextField(10);
	private JLabel [] dieValues = new JLabel[6];
	private JLabel [] occurrences = new JLabel[6];
	private JButton startBtn = new JButton("Start");
	private JPanel inputPnl = new JPanel();
	private JPanel centralPnl = new JPanel();
	private JPanel buttonPnl = new JPanel();
	
	RollingDie () {// GUI (2)
		inputPnl.add(textLbl);
		inputPnl.add(numberOfRollsTf);
		centralPnl.setLayout(new GridLayout(6, 2));
		for (int i = 0; i<6; i++) {
			centralPnl.add(dieValues[i] = new JLabel("["+(i+1)+"]"));
			centralPnl.add(occurrences[i]= new JLabel(""));
		}
		buttonPnl.add(startBtn);
		this.add(inputPnl, BorderLayout.NORTH);
		this.add(centralPnl);
		this.add(buttonPnl, BorderLayout.SOUTH);
				
		startBtn.addActionListener(new ActionListener() {
			
			// obrada doga�aja "Start" (3)
			@Override
			public void actionPerformed(ActionEvent e) {
				try  {
					int numberOfRolls = Integer.parseInt(numberOfRollsTf.getText());
					startBtn.setEnabled(false);
					//worker
					SimulationTask st = new SimulationTask(numberOfRolls);
					st.execute();
				}
				catch (Exception ex) {
					//puklo
				}
				
			}
		});

	}
	
	private class SimulationTask extends SwingWorker<Double, Map<Integer, Integer>> {// (1)
		int numberOfRolls;
		Map<Integer, Integer> map = new HashMap<>();

		SimulationTask(int numberOfRolls){
			this.numberOfRolls = numberOfRolls;
			for (int i = 0; i<6; i++)
				map.put(i, Integer.valueOf(0));
		}
		// (4)

		@Override
		protected Double doInBackground() throws Exception {
						
			Random rnd = new Random();
			
			for (int i=0; i<numberOfRolls; i++) {
				int randomNumber = rnd.nextInt(6);				
				map.put(randomNumber, map.get(randomNumber)+1);
				publish(map);
			}
			
			return numberOfRolls/6.0;
			
		}

		protected void process(List<Map<Integer, Integer>> chunks) {
			//prva ideja bila bi da obra�ujemo SVE zapise iz liste
			//ovako:
			//for (Map<Integer, Integer> map : chunks)
			//ali ustvari nam to ne treba, uzet �emo zamo zadnji zapis:
			//kako �e se GUI pona�ati ako obra�eujemo SVAKI zapis?
			Map<Integer, Integer> map = chunks.get(chunks.size()-1);
				for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
					occurrences[entry.getKey()].setText(entry.getValue().toString());
				} 					
		}

		protected void done() {
			startBtn.setEnabled(true);
		}

	}
	
	
	public static void main (String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override public void run() {
				RollingDie simulator = new RollingDie();
				simulator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				simulator.pack();
				simulator.setVisible(true);
			}
		});
	}
}7