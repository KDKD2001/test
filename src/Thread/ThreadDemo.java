package Thread;

public class ThreadDemo extends Thread{
	
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("Thread "+1);
			 System.out.println(Thread.currentThread().getName()+": "+i);
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}}
	
		

