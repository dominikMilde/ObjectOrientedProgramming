/**
 * 
 */
package hr.fer.oop.gui;

/**
 * @author Dominik
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("1");
		//System.out.println("2");
		//System.out.println("3");
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i<5; i++) {
				System.out.println("Thread 1: "  + i);
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					// TODO: handle exception
				}
				}
				
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.println("Thread 2: "  + i);
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				
			}
		};
		
		//t1.run();
		//t2.run();
		
		t1.start();
		t2.start();
	}

}
