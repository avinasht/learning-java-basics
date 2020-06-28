package threads.learn.java;

import tasks.threads.learn.Task;

public class HelloWorld {

	public static void main(String... args) {
		Task task1 = new Task();
		Thread thread1 = new Thread(task1);
		thread1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1.interrupt();
	}
}
