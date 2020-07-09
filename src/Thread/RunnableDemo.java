package Thread;

public class RunnableDemo implements Runnable {
	public void run() {
		for(int i = 0;i<20;i++) {
			System.out.println("Thread "+1);
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
