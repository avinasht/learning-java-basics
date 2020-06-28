/**
 * 
 */
package tasks.threads.learn;

/**
 * @author avinash
 *
 */
public class Task implements Runnable {

	@Override
	public void run() {
		while(!Thread.interrupted()) {
			System.out.println("Thread is running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Thread has been interrupted");
				return;
			}
		}
	}

}
