package Thread;

public class TestThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		
		ThreadDemo t2 = new ThreadDemo();
		
		t1.start();
		t2.start();
		
		for(int i=0;i<20;i++) {
			System.out.println("Main:"+i);
		}
	}

}
