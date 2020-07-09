package pattern;

public class TestFactoryMethod {
	
	public static void main(String[] args) {
		
		IWorkFactory stuWork = new StudentWorkFactory();
//		stuWork.getWork().doWork();
		
		IWorkFactory teacWork = new TeacherWorkFactory();
//		teacWork.getWork().doWork();
		
		TestFactoryMethod test = new TestFactoryMethod();
		test.createWork(stuWork).doWork();
		test.createWork(teacWork).doWork();
	}
	
	public Work createWork(IWorkFactory factory) {
		return factory.getWork();
	}

}


interface IWorkFactory{
	Work getWork();
}
class StudentWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		return new StudentWork();
	}
	
}
class TeacherWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		return new TeacherWork();
	}
	
}

interface Work{
	void doWork();
}

class StudentWork implements Work{

	@Override
	public void doWork() {
		System.out.println("学生写作业");
	}
	
}
class TeacherWork implements Work{

	@Override
	public void doWork() {
		System.out.println("老师批改作业");
	}
	
}